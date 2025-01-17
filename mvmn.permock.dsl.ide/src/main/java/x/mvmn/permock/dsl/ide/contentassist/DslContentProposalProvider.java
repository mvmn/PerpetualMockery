package x.mvmn.permock.dsl.ide.contentassist;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistEntry;
import org.eclipse.xtext.ide.editor.contentassist.IIdeContentProposalAcceptor;
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalCreator;
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalPriorities;
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Inject;

import x.mvmn.permock.dsl.dsl.Constant;
import x.mvmn.permock.dsl.dsl.ListElementReference;
import x.mvmn.permock.dsl.dsl.ListFunction;
import x.mvmn.permock.dsl.dsl.PropertyRef;
import x.mvmn.permock.dsl.dsl.Reference;
import x.mvmn.permock.dsl.model.ModelHelper;
import x.mvmn.permock.dsl.model.ModelHelper.FunctionDescriptor;
import x.mvmn.permock.dsl.model.XtextModelHelper;
import x.mvmn.permock.dsl.services.DslGrammarAccess;
import x.mvmn.permock.util.Property;

public class DslContentProposalProvider extends IdeContentProposalProvider {

	private static final Logger LOGGER = LoggerFactory.getLogger(DslContentProposalProvider.class);

	@Inject
	private IdeContentProposalCreator proposalCreator;

	@Inject
	private IdeContentProposalPriorities proposalPriorities;

	@Inject
	private DslGrammarAccess grammarAccess;

	@Inject
	private ModelHelper modelHelper;

	@Inject
	private XtextModelHelper xtextModelHelper;

	private Set<String> primitiveValRuleNames;

	private Set<Keyword> collectionOps;

	@Inject
	public void init() {
		primitiveValRuleNames = new HashSet<>(Arrays.asList(grammarAccess.getSTRINGRule().getName(),
				grammarAccess.getFLOATRule().getName(), grammarAccess.getINTEGERRule().getName(),
				grammarAccess.getBOOLEANRule().getName(), grammarAccess.getIDRule().getName()));

		collectionOps = new HashSet<>(
				Arrays.asList(grammarAccess.getListFunctionAccess().getLeftCurlyBracketKeyword_0(),
						grammarAccess.getCollectionAccessAccess().getLeftSquareBracketKeyword_0(),
						grammarAccess.getListOperationAccess().getALLAllKeyword_1_0(),
						grammarAccess.getListOperationAccess().getANYAnyKeyword_2_0(),
						grammarAccess.getListOperationAccess().getFILTERWhereKeyword_0_0(),
						grammarAccess.getListFunctionAccess().getMapKeywordMapKeyword_1_1_0_0()));
	}

	@Override
	protected void _createProposals(RuleCall ruleCall, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		String prefix = context.getPrefix();
		if (ruleCall.getRule().getName().equals(grammarAccess.getEntityRule().getName())) {
			createProposals(modelHelper.entities(), prefix, context, acceptor, false);
		} else if (ruleCall.getRule().getName().equals(grammarAccess.getPropertyRefRule().getName())) {
			EObject currentModel = context.getCurrentModel();
			if (currentModel instanceof PropertyRef || currentModel instanceof Reference
					|| currentModel instanceof ListElementReference || currentModel instanceof Constant) {
				Property currentModelType = xtextModelHelper.resolveType(currentModel);
				if (currentModelType != null) {
					createProposals(modelHelper.properties(currentModelType), prefix, context, acceptor, false);
					createFunctionProposals(modelHelper.getFunctionDescriptors(currentModelType), prefix, context,
							acceptor, false);
				}
			} else {
				LOGGER.error("Not covered in _createProposals(ruleCall): " + currentModel);
			}
		} else if (ruleCall.getRule().getName().equals(grammarAccess.getPropertyAccessRule().getName())
				|| ruleCall.getRule().getName().equals(grammarAccess.getFunctionCallRule().getName())) {
			EObject currentModel = context.getCurrentModel();
			if (currentModel instanceof PropertyRef) {
				PropertyRef propRef = (PropertyRef) currentModel;
				if (prefix != null && !prefix.isEmpty()) {
					Property currentModelType = xtextModelHelper.resolveType(propRef.eContainer());
					if (currentModelType != null) {
						createProposals(modelHelper.properties(currentModelType), prefix, context, acceptor, true);
						createFunctionProposals(modelHelper.getFunctionDescriptors(currentModelType), prefix, context,
								acceptor, true);
					}
				}
			}
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

	@Override
	protected boolean filterKeyword(Keyword keyword, ContentAssistContext context) {
		boolean collectionOp = false;
		boolean isDictionary = false;
		if (context.getCurrentModel() instanceof ListFunction) {
			collectionOp = true;
		} else {
			Property currentModelType = xtextModelHelper.resolveType(context.getCurrentModel());
			if (currentModelType == null) {
				return true;
			}
			if (currentModelType.isCollection()) {
				collectionOp = true;
			} else if (modelHelper.isDictionary(currentModelType)) {
				isDictionary = true;
			}
		}
		return grammarAccess.getPropertyRefAccess().getFullStopKeyword_0_0_0().equals(keyword)
				|| isDictionary
						&& grammarAccess.getCollectionAccessAccess().getLeftSquareBracketKeyword_0().equals(keyword)
				|| collectionOp == collectionOps.contains(keyword);
	}

	private void createProposals(List<Property> options, String prefix, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor, boolean skipDot) {
		boolean appendDot = !skipDot && prefix != null && prefix.startsWith(".");
		options.stream().forEach(n -> createProposal(appendDot ? ("." + n.getName()) : n.getName(), toDescription(n),
				ContentAssistEntry.KIND_KEYWORD, context, acceptor));
	}

	private void createFunctionProposals(List<FunctionDescriptor> functionDescriptor, String prefix,
			ContentAssistContext context, IIdeContentProposalAcceptor acceptor, boolean skipDot) {
		boolean appendDot = !skipDot; // prefix != null && prefix.startsWith(".");

		functionDescriptor.stream()
				.forEach(functionDesc -> createProposal(
						(appendDot ? "." : "") + functionDescriptorToCompletion(functionDesc),
						functionDescriptorToDescription(functionDesc), ContentAssistEntry.KIND_KEYWORD, context,
						acceptor));
	}

	private String toDescription(Property prop) {
		return (prop.isCollection() ? "List of " : "") + prop.getType().getSimpleName();
	}

	private String functionDescriptorToCompletion(FunctionDescriptor functionDescription) {
		return functionDescription.getName() + "(" + functionDescription.getArgs().stream().skip(1)
				.map(arg -> arg.getName()).collect(Collectors.joining(", ")) + ")";
	}

	private String functionDescriptorToDescription(FunctionDescriptor functionDescription) {
		String params = functionDescription.getArgs().stream().skip(1).map(arg -> toDescription(arg))
				.collect(Collectors.joining(", "));
		return (params.isEmpty() ? "" : params + " -> ") + toDescription(functionDescription.getReturnType());
	}

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
