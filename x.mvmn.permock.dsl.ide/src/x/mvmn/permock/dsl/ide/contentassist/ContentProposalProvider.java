package x.mvmn.permock.dsl.ide.contentassist;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistEntry;
import org.eclipse.xtext.ide.editor.contentassist.IIdeContentProposalAcceptor;
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalCreator;
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalPriorities;
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalProvider;

import com.google.inject.Inject;

public class ContentProposalProvider extends IdeContentProposalProvider {
	@Inject
	private IdeContentProposalCreator proposalCreator;

	@Inject
	private IdeContentProposalPriorities proposalPriorities;

	@Override
	protected boolean filterKeyword(Keyword keyword, ContentAssistContext context) {
		System.out.println(keyword);
		return true;
	}

	@Override
	protected void _createProposals(Keyword keyword, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		if (this.filterKeyword(keyword, context)) {
			ContentAssistEntry entry = this.proposalCreator.createProposal(keyword.getValue(), context);
			if (entry != null) {
//						if (context.prefix == "" && "a" == keyword.value) { // use constants in MydslGrammarAccess
//							entry.prefix = "$"
//							entry.proposal = "$" + entry.proposal
//							entry.label = "a"
//						}
				entry.setKind(ContentAssistEntry.KIND_KEYWORD);
				acceptor.accept(entry, this.proposalPriorities.getKeywordPriority(keyword.getValue(), entry));
			}
		}
	}
}
