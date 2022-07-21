package x.mvmn.permock.dsl.ide.contentassist;

import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistEntry;
import org.eclipse.xtext.ide.editor.contentassist.IIdeContentProposalAcceptor;
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalCreator;
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalPriorities;
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalProvider;

import com.google.inject.Inject;

import x.mvmn.permock.dsl.dsl.CollectionAccess;
import x.mvmn.permock.dsl.dsl.ListElementReference;
import x.mvmn.permock.dsl.dsl.ListFunction;
import x.mvmn.permock.dsl.dsl.PropertyAccess;
import x.mvmn.permock.dsl.dsl.PropertyRef;
import x.mvmn.permock.dsl.dsl.Reference;
import x.mvmn.permock.dsl.model.ModelHelper;
import x.mvmn.permock.util.BeanUtil;

public class DslContentProposalProvider extends IdeContentProposalProvider {

	@Inject
	private IdeContentProposalCreator proposalCreator;

	@Inject
	private IdeContentProposalPriorities proposalPriorities;

	@Inject
	private ModelHelper modelHelper;

	private Set<String> primitiveValRuleNames = Set.of("ID", "STRING", "INTEGER", "FLOAT");

	@Override
	protected void _createProposals(RuleCall ruleCall, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		String prefix = context.getPrefix();
		if (ruleCall.getRule().getName().equals("Entity")) {
			createProposals(modelHelper.entities(), prefix, context, acceptor);
		} else if (ruleCall.getRule().getName().equals("PropertyAccess")) {
			EObject currentModel = context.getCurrentModel();
			if (currentModel instanceof PropertyRef) {
				BeanUtil.Property currentModelType = resolveType(currentModel.eContainer());
				if (currentModelType != null) {
					createProposals(modelHelper.properties(currentModelType), prefix, context, acceptor);
				}
			} else {
				// Can this even happen for rule call PropertyRef?
				System.err.println(currentModel);
			}
		}
	}

	private void createProposals(List<BeanUtil.Property> options, String prefix, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		boolean appendDot = prefix != null && prefix.startsWith(".");
		options.stream()
				.forEach(n -> createProposal(appendDot ? ("." + n.getName()) : n.getName(),
						(n.isCollection() ? "List of " : "") + n.getType().getSimpleName(),
						ContentAssistEntry.KIND_KEYWORD, context, acceptor));
	}

	private BeanUtil.Property resolveType(EObject currentModel) {
		if (currentModel instanceof Reference) {
			return getReferenceType((Reference) currentModel);
		} else if (currentModel instanceof PropertyAccess) {
			return getPropertyType((PropertyAccess) currentModel);
		} else if (currentModel instanceof CollectionAccess) {
			return getCollectionType((CollectionAccess) currentModel);
		} else if (currentModel instanceof PropertyRef) {
			PropertyRef propertyRef = (PropertyRef) currentModel;
			if (propertyRef.getCollectionAccess() != null) {
				return getCollectionType(propertyRef.getCollectionAccess());
			} else if (propertyRef.getPropAccess() != null) {
				return getPropertyType(propertyRef.getPropAccess());
			} else if (propertyRef.getListFunc() != null) {
				ListFunction listFunction = propertyRef.getListFunc();
				if ("FILTER".equals(listFunction.getOp().getName())) {
					return resolveType(propertyRef.eContainer());
				} else { // ALL, ANY - boolean result
					return BeanUtil.Property.of("list", Boolean.class, false);
				}
			}
		} else if (currentModel instanceof ListElementReference) {
			ListElementReference listElRef = (ListElementReference) currentModel;
			String alias = listElRef.getName() != null ? listElRef.getName().getName() : null;
			if (alias != null) {
				ListFunction parentListFunction = findMatchingContainerOfType(currentModel, ListFunction.class,
						lf -> lf.getAlias().getName().equals(alias));
				if (parentListFunction != null) {
					BeanUtil.Property parentCollection = resolveType(parentListFunction.eContainer());
					if (parentCollection != null) {
						return new BeanUtil.Property(alias, parentCollection.getType(),
								BeanUtil.isCollection(parentCollection.getType()));
					}
				}
			}
		}
		return null;
	}

	private <T extends EObject> T findMatchingContainerOfType(EObject currentModel, Class<T> clazz,
			Predicate<T> check) {
		T candidate = EcoreUtil2.getContainerOfType(currentModel, clazz);
		while (candidate != null) {
			if (check.test(candidate)) {
				return candidate;
			} else {
				if (candidate.eContainer() != null) {
					candidate = EcoreUtil2.getContainerOfType(candidate.eContainer(), clazz);
				} else {
					return null;
				}
			}
		}
		return null;
	}

	private BeanUtil.Property getReferenceType(Reference reference) {
		String entityName = reference.getName().getName();
		return modelHelper.entityType(entityName);
	}

	private BeanUtil.Property getPropertyType(PropertyAccess propertyRef) {
		BeanUtil.Property parentType = resolveType(propertyRef.eContainer().eContainer());
		if (parentType == null) {
			return null;
		}
		return propertyRef.getName() != null ? modelHelper.typeOfProperty(parentType, propertyRef.getName()) : null;
	}

	private BeanUtil.Property getCollectionType(CollectionAccess collectionAccess) {
		BeanUtil.Property parentType = resolveType(collectionAccess.eContainer().eContainer());
		if (collectionAccess.getKey() != null) {
			return modelHelper.getDictionaryValueType(parentType);
		}

		if (parentType == null) {
			return null;
		}
		if (collectionAccess.getIndex() == null) {
			return null;
		}
		if (!parentType.isCollection()) {
			return null;
		} else {
			return new BeanUtil.Property(collectionAccess.getIndex().toString(), parentType.getType(), false);
		}
	}

	@Override
	protected void _createProposals(Assignment assignment, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		AbstractElement terminal = assignment.getTerminal();
		if (terminal instanceof RuleCall) {
			AbstractRule rule = ((RuleCall) terminal).getRule();
			if (rule instanceof TerminalRule && context.getPrefix().isEmpty()) {
				if (primitiveValRuleNames.contains(rule.getName())) {
					return;
				}
			}
		}
		super._createProposals(assignment, context, acceptor);
	}

//	@Override
//	protected void _createProposals(Keyword keyword, ContentAssistContext context,
//			IIdeContentProposalAcceptor acceptor) {
//		if (this.filterKeyword(keyword, context)) {
//			ContentAssistEntry entry = this.proposalCreator.createProposal(keyword.getValue(), context);
//			if (entry != null) {
//				if (dslGrammarAccess.getListElementReferenceAccess().getDollarSignKeyword_0().getValue()
//						.equals(context.getPrefix())) {
//					System.out.println("Dollar " + keyword);
//				} else {
//
//				}
//				entry.setKind(ContentAssistEntry.KIND_KEYWORD);
//				acceptor.accept(entry, this.proposalPriorities.getKeywordPriority(keyword.getValue(), entry));
//			}
//		}
//	}

	protected void createProposal(String value, String description, String kind, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		ContentAssistEntry entry = this.proposalCreator.createProposal(value, context);
		if (entry != null) {
			entry.setKind(kind);
			entry.setDescription(description);
			acceptor.accept(entry, proposalPriorities.getDefaultPriority(entry));
		}
	}
}
