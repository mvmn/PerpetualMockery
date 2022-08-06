package x.mvmn.permock.dsl.ide.highlight;

import java.util.Arrays;
import java.util.HashSet;
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

import x.mvmn.permock.dsl.dsl.Condition;
import x.mvmn.permock.dsl.dsl.FunctionCall;
import x.mvmn.permock.dsl.dsl.Header;
import x.mvmn.permock.dsl.dsl.ListFunction;
import x.mvmn.permock.dsl.dsl.Reference;
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
		public static String LOGICAL_CONDITION_ID = "logicalCondition";
		public static String FUNCTION_NAME_ID = "functionName";
		public static String FUNCTION_KEYWORDS_ID = "functionKeyword";
		public static String ENTITY_NAME_ID = "entityName";
	}

	@Inject
	private DslGrammarAccess grammarAccess;

	private Set<Keyword> ruleKeywordSet;

	private Set<Keyword> responseConfKeywordSet;

	private Set<Keyword> listFunctionKeywordSet;

	private Set<Keyword> logicalConditionSet;

	private Set<Keyword> conditionKeywordSet;

	private Set<Keyword> functionCallKeywordSet;

	@Inject
	private void init() {
		ruleKeywordSet = new HashSet<>(Arrays.asList(grammarAccess.getRuleAccess().getIfKeyword_0(),
				grammarAccess.getRuleAccess().getProxyKeyword_2_0_0(),
				grammarAccess.getRuleAccess().getRespondKeyword_2_1_0(),
				grammarAccess.getRuleAccess().getWithKeyword_2_1_1()));

		responseConfKeywordSet = new HashSet<>(
				Arrays.asList(grammarAccess.getResponseConfAccess().getContentKeyword_1_0(),
						grammarAccess.getResponseConfAccess().getHeadersKeyword_2_0(),
						grammarAccess.getResponseConfAccess().getStatusKeyword_0_0()));

		listFunctionKeywordSet = new HashSet<>(
				Arrays.asList(grammarAccess.getListFunctionAccess().getLeftCurlyBracketKeyword_0(),
						grammarAccess.getListFunctionAccess().getRightCurlyBracketKeyword_2(),
						grammarAccess.getListFunctionAccess().getSeparatorColonKeyword_1_0_2_0(),
						grammarAccess.getListFunctionAccess().getSeparatorColonKeyword_1_1_2_0()));

		logicalConditionSet = new HashSet<>(Arrays.asList(grammarAccess.getOrConditionAccess().getOrKeyword_1_1(),
				grammarAccess.getAndConditionAccess().getAndKeyword_1_1(),
				grammarAccess.getOptionalNegationConditionAccess().getNotKeyword_1_1()));

		conditionKeywordSet = new HashSet<>(
				Arrays.asList(grammarAccess.getBracketedConditionAccess().getLeftParenthesisKeyword_1_0(),
						grammarAccess.getBracketedConditionAccess().getRightParenthesisKeyword_1_2()));

		functionCallKeywordSet = new HashSet<>(
				Arrays.asList(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1(),
						grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_4(),
						grammarAccess.getFunctionCallAccess().getCommaKeyword_3_0()));
	}

	@Override
	protected boolean highlightElement(EObject object, IHighlightedPositionAcceptor acceptor,
			CancelIndicator cancelIndicator) {
		ICompositeNode node = NodeModelUtils.findActualNodeFor(object);
		if (object instanceof Rule) {
			for (ILeafNode n : node.getLeafNodes()) {
				if (n.getGrammarElement() != null && ruleKeywordSet.contains(n.getGrammarElement())) {
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
			for (ILeafNode n : node.getLeafNodes()) {
				if (n.getGrammarElement() != null && responseConfKeywordSet.contains(n.getGrammarElement())) {
					acceptor.addPosition(n.getOffset(), n.getLength(), DslHighlightingStyles.KEYWORD_RESPONSE_ID);
				}
			}
		} else if (object instanceof Header) {
			for (ILeafNode n : node.getLeafNodes()) {
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
			for (ILeafNode n : node.getLeafNodes()) {
				if (n.getGrammarElement() != null && listFunctionKeywordSet.contains(n.getGrammarElement())) {
					acceptor.addPosition(n.getOffset(), n.getLength(), DslHighlightingStyles.KEYWORD_ID);
				}
				if (n.getGrammarElement() != null && grammarAccess.getListFunctionAccess()
						.getMapKeywordMapKeyword_1_1_0_0().equals(n.getGrammarElement())) {
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
		} else if (object instanceof Condition) {
			for (ILeafNode n : node.getLeafNodes()) {
				if (n.getGrammarElement() != null && conditionKeywordSet.contains(n.getGrammarElement())) {
					acceptor.addPosition(n.getOffset(), n.getLength(), DslHighlightingStyles.KEYWORD_ID);
				}
				if (n.getGrammarElement() != null && logicalConditionSet.contains(n.getGrammarElement())) {
					acceptor.addPosition(n.getOffset(), n.getLength(), DslHighlightingStyles.LOGICAL_CONDITION_ID);
				}
			}
		} else if (object instanceof FunctionCall) {
			INode firstChild = node.getFirstChild();
			if (firstChild.getGrammarElement() instanceof RuleCall) {
				RuleCall ruleCall = (RuleCall) firstChild.getGrammarElement();
				if (ruleCall.eContainer() instanceof Assignment) {
					Assignment assignment = (Assignment) ruleCall.eContainer();
					if (grammarAccess.getFunctionCallAccess().getNameAssignment_0().getFeature()
							.equals(assignment.getFeature())) {
						acceptor.addPosition(firstChild.getOffset(), firstChild.getLength(),
								DslHighlightingStyles.FUNCTION_NAME_ID);
					}
				}
			}
			for (ILeafNode n : node.getLeafNodes()) {
				if (n.getGrammarElement() != null && functionCallKeywordSet.contains(n.getGrammarElement())) {
					acceptor.addPosition(n.getOffset(), n.getLength(), DslHighlightingStyles.FUNCTION_KEYWORDS_ID);
				}
			}
		} else if (object instanceof Reference) {
			INode firstChild = node.getFirstChild();
			if (firstChild.getGrammarElement() instanceof RuleCall) {
				RuleCall ruleCall = (RuleCall) firstChild.getGrammarElement();
				if (ruleCall.eContainer() instanceof Assignment) {
					Assignment assignment = (Assignment) ruleCall.eContainer();
					if (grammarAccess.getReferenceAccess().getNameAssignment_0().getFeature()
							.equals(assignment.getFeature())) {
						acceptor.addPosition(firstChild.getOffset(), firstChild.getLength(),
								DslHighlightingStyles.ENTITY_NAME_ID);
					}
				}
			}
		}
		return super.highlightElement(object, acceptor, cancelIndicator);
	}
}
