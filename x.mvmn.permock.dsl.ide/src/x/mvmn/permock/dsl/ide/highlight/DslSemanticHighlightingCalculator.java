package x.mvmn.permock.dsl.ide.highlight;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.util.CancelIndicator;

import com.google.inject.Inject;

import x.mvmn.permock.dsl.dsl.Header;
import x.mvmn.permock.dsl.dsl.ListFunction;
import x.mvmn.permock.dsl.dsl.ResponseConf;
import x.mvmn.permock.dsl.dsl.Rule;
import x.mvmn.permock.dsl.services.DslGrammarAccess;

public class DslSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {

	public static class DslHighlightingStyles implements HighlightingStyles {
		public static String KEYWORD_RESPONSE_ID = HighlightingStyles.KEYWORD_ID + "Response";
		public static String RESPONSE_HEADER_NAME_ID = "responseHeaderName";
		public static String RESPONSE_HEADER_VALUE_ID = "responseHeaderValue";
		public static String RESPONSE_STATUS_VALUE_ID = "responseStatusValue";
		public static String RESPONSE_CONTENT_VALUE_ID = "responseContentValue";
		public static String BOOLEAN_ID = "boolean";
	}

	@Inject
	private DslGrammarAccess grammarAccess;

	@Override
	protected boolean highlightElement(EObject object, IHighlightedPositionAcceptor acceptor,
			CancelIndicator cancelIndicator) {

		if (object instanceof Rule) {
			Set<Keyword> keywordSet = Set.of(grammarAccess.getRuleAccess().getIfKeyword_0(),
					grammarAccess.getRuleAccess().getProxyKeyword_2_0_0(),
					grammarAccess.getRuleAccess().getRespondKeyword_2_1_0(),
					grammarAccess.getRuleAccess().getWithKeyword_2_1_1());
			for (ILeafNode n : NodeModelUtils.findActualNodeFor(object).getLeafNodes()) {
				if (n.getGrammarElement() != null && keywordSet.contains(n.getGrammarElement())) {
					acceptor.addPosition(n.getOffset(), n.getLength(), DslHighlightingStyles.KEYWORD_ID);
				} else if (n.getGrammarElement() instanceof RuleCall) {
					RuleCall ruleCall = (RuleCall) n.getGrammarElement();
					if (!(n.getGrammarElement().eContainer() instanceof Assignment
							&& grammarAccess.getHeaderAccess().getHeaderNameAssignment_0().getFeature()
									.equals(((Assignment) n.getGrammarElement().eContainer()).getFeature()))) {
						if (grammarAccess.getSTRINGRule().getName().equals(ruleCall.getRule().getName())) {
							acceptor.addPosition(n.getOffset(), n.getLength(), DslHighlightingStyles.STRING_ID);
						} else if (grammarAccess.getINTEGERRule().getName().equals(ruleCall.getRule().getName())
								|| grammarAccess.getFLOATRule().getName().equals(ruleCall.getRule().getName())) {
							acceptor.addPosition(n.getOffset(), n.getLength(), DslHighlightingStyles.NUMBER_ID);
						} else if (grammarAccess.getBOOLEANRule().getName().equals(ruleCall.getRule().getName())) {
							acceptor.addPosition(n.getOffset(), n.getLength(), DslHighlightingStyles.BOOLEAN_ID);
						}
					}
				}
			}
		} else if (object instanceof ResponseConf) {
			Set<Keyword> keywordSet = Set.of(grammarAccess.getResponseConfAccess().getContentKeyword_1_0(),
					grammarAccess.getResponseConfAccess().getHeadersKeyword_2_0(),
					grammarAccess.getResponseConfAccess().getStatusKeyword_0_0());
			for (ILeafNode n : NodeModelUtils.findActualNodeFor(object).getLeafNodes()) {
				if (n.getGrammarElement() != null && keywordSet.contains(n.getGrammarElement())) {
					acceptor.addPosition(n.getOffset(), n.getLength(), DslHighlightingStyles.KEYWORD_RESPONSE_ID);
				}
			}
		} else if (object instanceof Header) {
			for (ILeafNode n : NodeModelUtils.findActualNodeFor(object).getLeafNodes()) {
				if (n.getGrammarElement() instanceof RuleCall) {
					RuleCall ruleCall = (RuleCall) n.getGrammarElement();
					if (ruleCall.eContainer() instanceof Assignment) {
						Assignment assignment = (Assignment) ruleCall.eContainer();
						if (grammarAccess.getHeaderAccess().getHeaderNameAssignment_0().getFeature()
								.equals(assignment.getFeature())) {
							acceptor.addPosition(n.getOffset(), n.getLength(),
									DslHighlightingStyles.RESPONSE_HEADER_NAME_ID);
						} else if (grammarAccess.getHeaderAccess().getHeaderValueAssignment_2().getFeature()
								.equals(assignment.getFeature())) {
							acceptor.addPosition(n.getOffset(), n.getLength(),
									DslHighlightingStyles.RESPONSE_HEADER_VALUE_ID);
						}
					}
				}
			}
		} else if (object instanceof ListFunction) {
			Set<Keyword> keywordSet = Set.of(grammarAccess.getListFunctionAccess().getLeftCurlyBracketKeyword_0(),
					grammarAccess.getListFunctionAccess().getRightCurlyBracketKeyword_5(),
					grammarAccess.getListFunctionAccess().getSeparatorColonKeyword_3_0(),
					grammarAccess.getListElementReferenceAccess().getDollarSignKeyword_0());
			ICompositeNode node = NodeModelUtils.findActualNodeFor(object);
			for (ILeafNode n : node.getLeafNodes()) {
				if (n.getGrammarElement() != null && keywordSet.contains(n.getGrammarElement())) {
					acceptor.addPosition(n.getOffset(), n.getLength(), DslHighlightingStyles.KEYWORD_ID);
				}
			}
			for (INode childNode : node.getChildren()) {
				if (childNode.getGrammarElement() instanceof RuleCall) {
					RuleCall ruleCall = (RuleCall) childNode.getGrammarElement();
					if (grammarAccess.getListOperationRule().getName().equals(ruleCall.getRule().getName())) {
						acceptor.addPosition(childNode.getOffset(), childNode.getLength(),
								DslHighlightingStyles.KEYWORD_ID);
					}
				}
			}
		}
		return super.highlightElement(object, acceptor, cancelIndicator);
	}
}
