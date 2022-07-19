package x.mvmn.permock.dsl.ide.contentassist;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistEntry;
import org.eclipse.xtext.ide.editor.contentassist.IIdeContentProposalAcceptor;
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalCreator;
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalPriorities;
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalProvider;

import com.google.inject.Inject;

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
		} else if (ruleCall.getRule().getName().equals("PropertyRef")) {
			boolean appendDot = false;
			if (prefix != null && prefix.startsWith(".")) {
				appendDot = true;
			}
			BeanUtil.Property currentModelType = resolveType(context.getCurrentModel());
			if (currentModelType != null) {
				createProposals(modelHelper.properties(currentModelType.getType()).stream().map(v -> "." + v)
						.collect(Collectors.toList()), prefix, context, acceptor);
			}
		}
	}

	private void createProposals(List<String> options, String prefix, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		options.stream().filter(n -> prefix != null && !prefix.trim().isEmpty() ? n.startsWith(prefix.trim()) : true)
				.forEach(n -> createProposal(n, ContentAssistEntry.KIND_KEYWORD, context, acceptor));
	}

	private BeanUtil.Property resolveType(EObject currentModel) {
		if (currentModel instanceof Reference) {
			return getReferenceType((Reference) currentModel);
		} else if (currentModel instanceof PropertyRef) {
			return getPropertyType((PropertyRef) currentModel);
		}
		return null;
	}

	private BeanUtil.Property getReferenceType(Reference reference) {
		String entityName = reference.getName().getName();
		return modelHelper.entityType(entityName);
	}

	private BeanUtil.Property getPropertyType(PropertyRef propertyRef) {
		BeanUtil.Property parentType = resolveType(propertyRef.eContainer());
		if (parentType == null) {
			return null;
		}
		if (propertyRef.getIndex() != null) {
			if (!parentType.isCollection()) {
				return null;
			} else {
				return new BeanUtil.Property(propertyRef.getIndex().toString(), parentType.getType(), false);
			}
		}
		return propertyRef.getName() != null ? modelHelper.typeOfProperty(parentType.getType(), propertyRef.getName())
				: null;
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

	protected void createProposal(String value, String kind, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		ContentAssistEntry entry = this.proposalCreator.createProposal(value, context);
		if (entry != null) {
//			entry.setKind(kind);
			acceptor.accept(entry, proposalPriorities.getDefaultPriority(entry));
		}
	}
}
