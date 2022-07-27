package x.mvmn.permock.dsl.ide.contentassist;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

import com.google.inject.Inject;

import x.mvmn.permock.dsl.dsl.ListFunction;
import x.mvmn.permock.dsl.dsl.PropertyRef;
import x.mvmn.permock.dsl.model.ModelHelper;
import x.mvmn.permock.dsl.model.XtextModelHelper;
import x.mvmn.permock.dsl.services.DslGrammarAccess;
import x.mvmn.permock.util.BeanUtil;
import x.mvmn.permock.util.BeanUtil.Property;

public class DslContentProposalProvider extends IdeContentProposalProvider {

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

	private static final Set<String> primitiveValRuleNames = new HashSet<>(
			Arrays.asList("ID", "STRING", "INTEGER", "FLOAT"));

	private Set<Keyword> collectionOps;

	@Inject
	public void init() {
		collectionOps = new HashSet<>(
				Arrays.asList(grammarAccess.getListFunctionAccess().getLeftCurlyBracketKeyword_0(),
						grammarAccess.getCollectionAccessAccess().getLeftSquareBracketKeyword_0(),
						grammarAccess.getListOperationAccess().getALLAllKeyword_1_0(),
						grammarAccess.getListOperationAccess().getANYAnyKeyword_2_0(),
						grammarAccess.getListOperationAccess().getFILTERWhereKeyword_0_0()));
	}

	@Override
	protected void _createProposals(RuleCall ruleCall, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		String prefix = context.getPrefix();
		if (ruleCall.getRule().getName().equals("Entity")) {
			createProposals(modelHelper.entities(), prefix, context, acceptor);
		} else if (ruleCall.getRule().getName().equals(grammarAccess.getPropertyAccessRule().getName())) {
			EObject currentModel = context.getCurrentModel();
			if (currentModel instanceof PropertyRef) {
				BeanUtil.Property currentModelType = xtextModelHelper.resolveType(currentModel.eContainer());
				if (currentModelType != null) {
					createProposals(modelHelper.properties(currentModelType), prefix, context, acceptor);
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
		if (context.getCurrentModel() instanceof ListFunction) {
			collectionOp = true;
		} else {
			Property currentModelType = xtextModelHelper.resolveType(context.getCurrentModel());
			if (currentModelType == null) {
				return true;
			}
			if (currentModelType.isCollection()) {
				collectionOp = true;
			}
		}
		return grammarAccess.getPropertyRefAccess().getFullStopKeyword_0_0_0().equals(keyword)
				|| collectionOp == collectionOps.contains(keyword);
	}

	private void createProposals(List<BeanUtil.Property> options, String prefix, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		boolean appendDot = prefix != null && prefix.startsWith(".");
		options.stream()
				.forEach(n -> createProposal(appendDot ? ("." + n.getName()) : n.getName(),
						(n.isCollection() ? "List of " : "") + n.getType().getSimpleName(),
						ContentAssistEntry.KIND_KEYWORD, context, acceptor));
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
