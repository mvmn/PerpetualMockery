/*
 * generated by Xtext 2.25.0
 */
grammar InternalDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package x.mvmn.permock.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package x.mvmn.permock.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import x.mvmn.permock.dsl.services.DslGrammarAccess;

}

@parser::members {

 	private DslGrammarAccess grammarAccess;

    public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Rule";
   	}

   	@Override
   	protected DslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleRule
entryRuleRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRuleRule()); }
	iv_ruleRule=ruleRule
	{ $current=$iv_ruleRule.current; }
	EOF;

// Rule Rule
ruleRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='if'
		{
			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getIfKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleAccess().getConditionsConditionParserRuleCall_1_0());
				}
				lv_conditions_1_0=ruleCondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleRule());
					}
					set(
						$current,
						"conditions",
						lv_conditions_1_0,
						"x.mvmn.permock.dsl.Dsl.Condition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				otherlv_2='proxy'
				{
					newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getProxyKeyword_2_0_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getRuleAccess().getProxyProxyConfParserRuleCall_2_0_1_0());
						}
						lv_proxy_3_0=ruleProxyConf
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRuleRule());
							}
							set(
								$current,
								"proxy",
								lv_proxy_3_0,
								"x.mvmn.permock.dsl.Dsl.ProxyConf");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_4='respond'
				{
					newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getRespondKeyword_2_1_0());
				}
				otherlv_5='with'
				{
					newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getWithKeyword_2_1_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getRuleAccess().getResponseResponseConfParserRuleCall_2_1_2_0());
						}
						lv_response_6_0=ruleResponseConf
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRuleRule());
							}
							set(
								$current,
								"response",
								lv_response_6_0,
								"x.mvmn.permock.dsl.Dsl.ResponseConf");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)?
	)
;

// Entry rule entryRuleProxyConf
entryRuleProxyConf returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProxyConfRule()); }
	iv_ruleProxyConf=ruleProxyConf
	{ $current=$iv_ruleProxyConf.current; }
	EOF;

// Rule ProxyConf
ruleProxyConf returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='url'
		{
			newLeafNode(otherlv_0, grammarAccess.getProxyConfAccess().getUrlKeyword_0());
		}
		(
			(
				lv_proxyUrl_1_0=RULE_STRING
				{
					newLeafNode(lv_proxyUrl_1_0, grammarAccess.getProxyConfAccess().getProxyUrlSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProxyConfRule());
					}
					setWithLastConsumed(
						$current,
						"proxyUrl",
						lv_proxyUrl_1_0,
						"x.mvmn.permock.dsl.Dsl.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleResponseConf
entryRuleResponseConf returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getResponseConfRule()); }
	iv_ruleResponseConf=ruleResponseConf
	{ $current=$iv_ruleResponseConf.current; }
	EOF;

// Rule ResponseConf
ruleResponseConf returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{ 
			  getUnorderedGroupHelper().enter(grammarAccess.getResponseConfAccess().getUnorderedGroup());
			}
			(
				(
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 0);
				}
							({true}?=>(otherlv_1='status'
							{
								newLeafNode(otherlv_1, grammarAccess.getResponseConfAccess().getStatusKeyword_0_0());
							}
							(
								(
									lv_httpStatus_2_0=RULE_INTEGER
									{
										newLeafNode(lv_httpStatus_2_0, grammarAccess.getResponseConfAccess().getHttpStatusINTEGERTerminalRuleCall_0_1_0());
									}
									{
										if ($current==null) {
											$current = createModelElement(grammarAccess.getResponseConfRule());
										}
										setWithLastConsumed(
											$current,
											"httpStatus",
											lv_httpStatus_2_0,
											"x.mvmn.permock.dsl.Dsl.INTEGER");
									}
								)
							)
							))
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResponseConfAccess().getUnorderedGroup());
				}
			)
		)|
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 1);
				}
							({true}?=>(otherlv_3='content'
							{
								newLeafNode(otherlv_3, grammarAccess.getResponseConfAccess().getContentKeyword_1_0());
							}
							(
								(
									lv_content_4_0=RULE_STRING
									{
										newLeafNode(lv_content_4_0, grammarAccess.getResponseConfAccess().getContentSTRINGTerminalRuleCall_1_1_0());
									}
									{
										if ($current==null) {
											$current = createModelElement(grammarAccess.getResponseConfRule());
										}
										setWithLastConsumed(
											$current,
											"content",
											lv_content_4_0,
											"x.mvmn.permock.dsl.Dsl.STRING");
									}
								)
							)
							))
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResponseConfAccess().getUnorderedGroup());
				}
			)
		)|
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 2);
				}
							({true}?=>(otherlv_5='headers'
							{
								newLeafNode(otherlv_5, grammarAccess.getResponseConfAccess().getHeadersKeyword_2_0());
							}
							(
								(
									{
										newCompositeNode(grammarAccess.getResponseConfAccess().getHeadersHeadersParserRuleCall_2_1_0());
									}
									lv_headers_6_0=ruleHeaders
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getResponseConfRule());
										}
										set(
											$current,
											"headers",
											lv_headers_6_0,
											"x.mvmn.permock.dsl.Dsl.Headers");
										afterParserOrEnumRuleCall();
									}
								)
							)?
							))
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResponseConfAccess().getUnorderedGroup());
				}
			)
		)
				)*
			)
		)
			{ 
			  getUnorderedGroupHelper().leave(grammarAccess.getResponseConfAccess().getUnorderedGroup());
			}
	)
;

// Entry rule entryRuleHeaders
entryRuleHeaders returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHeadersRule()); }
	iv_ruleHeaders=ruleHeaders
	{ $current=$iv_ruleHeaders.current; }
	EOF;

// Rule Headers
ruleHeaders returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getHeadersAccess().getHeadersHeaderParserRuleCall_0_0());
				}
				lv_headers_0_0=ruleHeader
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHeadersRule());
					}
					add(
						$current,
						"headers",
						lv_headers_0_0,
						"x.mvmn.permock.dsl.Dsl.Header");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getHeadersAccess().getCommaKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getHeadersAccess().getHeadersHeaderParserRuleCall_1_1_0());
					}
					lv_headers_2_0=ruleHeader
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getHeadersRule());
						}
						add(
							$current,
							"headers",
							lv_headers_2_0,
							"x.mvmn.permock.dsl.Dsl.Header");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleHeader
entryRuleHeader returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHeaderRule()); }
	iv_ruleHeader=ruleHeader
	{ $current=$iv_ruleHeader.current; }
	EOF;

// Rule Header
ruleHeader returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_headerName_0_0=RULE_STRING
				{
					newLeafNode(lv_headerName_0_0, grammarAccess.getHeaderAccess().getHeaderNameSTRINGTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getHeaderRule());
					}
					setWithLastConsumed(
						$current,
						"headerName",
						lv_headerName_0_0,
						"x.mvmn.permock.dsl.Dsl.STRING");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getHeaderAccess().getColonKeyword_1());
		}
		(
			(
				lv_headerValue_2_0=RULE_STRING
				{
					newLeafNode(lv_headerValue_2_0, grammarAccess.getHeaderAccess().getHeaderValueSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getHeaderRule());
					}
					setWithLastConsumed(
						$current,
						"headerValue",
						lv_headerValue_2_0,
						"x.mvmn.permock.dsl.Dsl.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleCondition
entryRuleCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	iv_ruleCondition=ruleCondition
	{ $current=$iv_ruleCondition.current; }
	EOF;

// Rule Condition
ruleCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getConditionAccess().getOrConditionParserRuleCall());
	}
	this_OrCondition_0=ruleOrCondition
	{
		$current = $this_OrCondition_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleOrCondition
entryRuleOrCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOrConditionRule()); }
	iv_ruleOrCondition=ruleOrCondition
	{ $current=$iv_ruleOrCondition.current; }
	EOF;

// Rule OrCondition
ruleOrCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getOrConditionAccess().getAndConditionParserRuleCall_0());
		}
		this_AndCondition_0=ruleAndCondition
		{
			$current = $this_AndCondition_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getOrConditionAccess().getOrConditionLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='or'
			{
				newLeafNode(otherlv_2, grammarAccess.getOrConditionAccess().getOrKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getOrConditionAccess().getRightAndConditionParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleAndCondition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOrConditionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"x.mvmn.permock.dsl.Dsl.AndCondition");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleAndCondition
entryRuleAndCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAndConditionRule()); }
	iv_ruleAndCondition=ruleAndCondition
	{ $current=$iv_ruleAndCondition.current; }
	EOF;

// Rule AndCondition
ruleAndCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAndConditionAccess().getOptionalNegationConditionParserRuleCall_0());
		}
		this_OptionalNegationCondition_0=ruleOptionalNegationCondition
		{
			$current = $this_OptionalNegationCondition_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getAndConditionAccess().getAndConditionLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='and'
			{
				newLeafNode(otherlv_2, grammarAccess.getAndConditionAccess().getAndKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAndConditionAccess().getRightOptionalNegationConditionParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleOptionalNegationCondition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAndConditionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"x.mvmn.permock.dsl.Dsl.OptionalNegationCondition");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleOptionalNegationCondition
entryRuleOptionalNegationCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOptionalNegationConditionRule()); }
	iv_ruleOptionalNegationCondition=ruleOptionalNegationCondition
	{ $current=$iv_ruleOptionalNegationCondition.current; }
	EOF;

// Rule OptionalNegationCondition
ruleOptionalNegationCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getOptionalNegationConditionAccess().getBracketedConditionParserRuleCall_0());
		}
		this_BracketedCondition_0=ruleBracketedCondition
		{
			$current = $this_BracketedCondition_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getOptionalNegationConditionAccess().getNegationAction_1_0(),
						$current);
				}
			)
			otherlv_2='not'
			{
				newLeafNode(otherlv_2, grammarAccess.getOptionalNegationConditionAccess().getNotKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getOptionalNegationConditionAccess().getNegatedBracketedConditionParserRuleCall_1_2_0());
					}
					lv_negated_3_0=ruleBracketedCondition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOptionalNegationConditionRule());
						}
						set(
							$current,
							"negated",
							lv_negated_3_0,
							"x.mvmn.permock.dsl.Dsl.BracketedCondition");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleBracketedCondition
entryRuleBracketedCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBracketedConditionRule()); }
	iv_ruleBracketedCondition=ruleBracketedCondition
	{ $current=$iv_ruleBracketedCondition.current; }
	EOF;

// Rule BracketedCondition
ruleBracketedCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getBracketedConditionAccess().getExpressionExpressionParserRuleCall_0_0());
				}
				lv_expression_0_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBracketedConditionRule());
					}
					set(
						$current,
						"expression",
						lv_expression_0_0,
						"x.mvmn.permock.dsl.Dsl.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			otherlv_1='('
			{
				newLeafNode(otherlv_1, grammarAccess.getBracketedConditionAccess().getLeftParenthesisKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getBracketedConditionAccess().getConditionConditionParserRuleCall_1_1_0());
					}
					lv_condition_2_0=ruleCondition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBracketedConditionRule());
						}
						set(
							$current,
							"condition",
							lv_condition_2_0,
							"x.mvmn.permock.dsl.Dsl.Condition");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_3=')'
			{
				newLeafNode(otherlv_3, grammarAccess.getBracketedConditionAccess().getRightParenthesisKeyword_1_2());
			}
		)
	)
;

// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	iv_ruleExpression=ruleExpression
	{ $current=$iv_ruleExpression.current; }
	EOF;

// Rule Expression
ruleExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getExpressionAccess().getLeftOperandParserRuleCall_0_0());
				}
				lv_left_0_0=ruleOperand
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExpressionRule());
					}
					set(
						$current,
						"left",
						lv_left_0_0,
						"x.mvmn.permock.dsl.Dsl.Operand");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getExpressionAccess().getOpOperatorEnumRuleCall_1_0_0());
					}
					lv_op_1_0=ruleOperator
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExpressionRule());
						}
						set(
							$current,
							"op",
							lv_op_1_0,
							"x.mvmn.permock.dsl.Dsl.Operator");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExpressionAccess().getRightOperandParserRuleCall_1_1_0());
					}
					lv_right_2_0=ruleOperand
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExpressionRule());
						}
						set(
							$current,
							"right",
							lv_right_2_0,
							"x.mvmn.permock.dsl.Dsl.Operand");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleOperand
entryRuleOperand returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOperandRule()); }
	iv_ruleOperand=ruleOperand
	{ $current=$iv_ruleOperand.current; }
	EOF;

// Rule Operand
ruleOperand returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getOperandAccess().getRefReferenceParserRuleCall_0_0());
				}
				lv_ref_0_0=ruleReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOperandRule());
					}
					set(
						$current,
						"ref",
						lv_ref_0_0,
						"x.mvmn.permock.dsl.Dsl.Reference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getOperandAccess().getConstConstantParserRuleCall_1_0());
				}
				lv_const_1_0=ruleConstant
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOperandRule());
					}
					set(
						$current,
						"const",
						lv_const_1_0,
						"x.mvmn.permock.dsl.Dsl.Constant");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getOperandAccess().getListElementRefListElementReferenceParserRuleCall_2_0());
				}
				lv_listElementRef_2_0=ruleListElementReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOperandRule());
					}
					set(
						$current,
						"listElementRef",
						lv_listElementRef_2_0,
						"x.mvmn.permock.dsl.Dsl.ListElementReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleListFunction
entryRuleListFunction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getListFunctionRule()); }
	iv_ruleListFunction=ruleListFunction
	{ $current=$iv_ruleListFunction.current; }
	EOF;

// Rule ListFunction
ruleListFunction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='{'
		{
			newLeafNode(otherlv_0, grammarAccess.getListFunctionAccess().getLeftCurlyBracketKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getListFunctionAccess().getOpListOperationEnumRuleCall_1_0());
				}
				lv_op_1_0=ruleListOperation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getListFunctionRule());
					}
					set(
						$current,
						"op",
						lv_op_1_0,
						"x.mvmn.permock.dsl.Dsl.ListOperation");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getListFunctionAccess().getAliasListElementAliasParserRuleCall_2_0());
				}
				lv_alias_2_0=ruleListElementAlias
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getListFunctionRule());
					}
					set(
						$current,
						"alias",
						lv_alias_2_0,
						"x.mvmn.permock.dsl.Dsl.ListElementAlias");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_separator_3_0=':'
				{
					newLeafNode(lv_separator_3_0, grammarAccess.getListFunctionAccess().getSeparatorColonKeyword_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getListFunctionRule());
					}
					setWithLastConsumed($current, "separator", lv_separator_3_0, ":");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getListFunctionAccess().getConditionConditionParserRuleCall_4_0());
				}
				lv_condition_4_0=ruleCondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getListFunctionRule());
					}
					set(
						$current,
						"condition",
						lv_condition_4_0,
						"x.mvmn.permock.dsl.Dsl.Condition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getListFunctionAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleListElementAlias
entryRuleListElementAlias returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getListElementAliasRule()); }
	iv_ruleListElementAlias=ruleListElementAlias
	{ $current=$iv_ruleListElementAlias.current; }
	EOF;

// Rule ListElementAlias
ruleListElementAlias returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getListElementAliasAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getListElementAliasRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"x.mvmn.permock.dsl.Dsl.ID");
			}
		)
	)
;

// Entry rule entryRuleReference
entryRuleReference returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}:
	{ newCompositeNode(grammarAccess.getReferenceRule()); }
	iv_ruleReference=ruleReference
	{ $current=$iv_ruleReference.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule Reference
ruleReference returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getReferenceAccess().getNameEntityParserRuleCall_0_0());
				}
				lv_name_0_0=ruleEntity
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getReferenceRule());
					}
					set(
						$current,
						"name",
						lv_name_0_0,
						"x.mvmn.permock.dsl.Dsl.Entity");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getReferenceAccess().getPropPropertyRefParserRuleCall_1_0());
				}
				lv_prop_1_0=rulePropertyRef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getReferenceRule());
					}
					set(
						$current,
						"prop",
						lv_prop_1_0,
						"x.mvmn.permock.dsl.Dsl.PropertyRef");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleListElementReference
entryRuleListElementReference returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}:
	{ newCompositeNode(grammarAccess.getListElementReferenceRule()); }
	iv_ruleListElementReference=ruleListElementReference
	{ $current=$iv_ruleListElementReference.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule ListElementReference
ruleListElementReference returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}
@after {
	leaveRule();
}:
	(
		otherlv_0='$'
		{
			newLeafNode(otherlv_0, grammarAccess.getListElementReferenceAccess().getDollarSignKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getListElementReferenceRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getListElementReferenceAccess().getNameListElementAliasCrossReference_1_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getListElementReferenceAccess().getPropPropertyRefParserRuleCall_2_0());
				}
				lv_prop_2_0=rulePropertyRef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getListElementReferenceRule());
					}
					set(
						$current,
						"prop",
						lv_prop_2_0,
						"x.mvmn.permock.dsl.Dsl.PropertyRef");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRulePropertyAccess
entryRulePropertyAccess returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropertyAccessRule()); }
	iv_rulePropertyAccess=rulePropertyAccess
	{ $current=$iv_rulePropertyAccess.current; }
	EOF;

// Rule PropertyAccess
rulePropertyAccess returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getPropertyAccessAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getPropertyAccessRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"x.mvmn.permock.dsl.Dsl.ID");
			}
		)
	)
;

// Entry rule entryRuleCollectionAccess
entryRuleCollectionAccess returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCollectionAccessRule()); }
	iv_ruleCollectionAccess=ruleCollectionAccess
	{ $current=$iv_ruleCollectionAccess.current; }
	EOF;

// Rule CollectionAccess
ruleCollectionAccess returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='['
		{
			newLeafNode(otherlv_0, grammarAccess.getCollectionAccessAccess().getLeftSquareBracketKeyword_0());
		}
		(
			(
				(
					lv_key_1_0=RULE_STRING
					{
						newLeafNode(lv_key_1_0, grammarAccess.getCollectionAccessAccess().getKeySTRINGTerminalRuleCall_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCollectionAccessRule());
						}
						setWithLastConsumed(
							$current,
							"key",
							lv_key_1_0,
							"x.mvmn.permock.dsl.Dsl.STRING");
					}
				)
			)
			    |
			(
				(
					lv_index_2_0=RULE_INTEGER
					{
						newLeafNode(lv_index_2_0, grammarAccess.getCollectionAccessAccess().getIndexINTEGERTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCollectionAccessRule());
						}
						setWithLastConsumed(
							$current,
							"index",
							lv_index_2_0,
							"x.mvmn.permock.dsl.Dsl.INTEGER");
					}
				)
			)
		)
		otherlv_3=']'
		{
			newLeafNode(otherlv_3, grammarAccess.getCollectionAccessAccess().getRightSquareBracketKeyword_2());
		}
	)
;

// Entry rule entryRulePropertyRef
entryRulePropertyRef returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}:
	{ newCompositeNode(grammarAccess.getPropertyRefRule()); }
	iv_rulePropertyRef=rulePropertyRef
	{ $current=$iv_rulePropertyRef.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule PropertyRef
rulePropertyRef returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}
@after {
	leaveRule();
}:
	(
		(
			(
				otherlv_0='.'
				{
					newLeafNode(otherlv_0, grammarAccess.getPropertyRefAccess().getFullStopKeyword_0_0_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getPropertyRefAccess().getPropAccessPropertyAccessParserRuleCall_0_0_1_0());
						}
						lv_propAccess_1_0=rulePropertyAccess
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getPropertyRefRule());
							}
							set(
								$current,
								"propAccess",
								lv_propAccess_1_0,
								"x.mvmn.permock.dsl.Dsl.PropertyAccess");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getPropertyRefAccess().getCollectionAccessCollectionAccessParserRuleCall_0_1_0());
					}
					lv_collectionAccess_2_0=ruleCollectionAccess
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPropertyRefRule());
						}
						set(
							$current,
							"collectionAccess",
							lv_collectionAccess_2_0,
							"x.mvmn.permock.dsl.Dsl.CollectionAccess");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getPropertyRefAccess().getListFuncListFunctionParserRuleCall_0_2_0());
					}
					lv_listFunc_3_0=ruleListFunction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPropertyRefRule());
						}
						set(
							$current,
							"listFunc",
							lv_listFunc_3_0,
							"x.mvmn.permock.dsl.Dsl.ListFunction");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getPropertyRefAccess().getSubProperyPropertyRefParserRuleCall_1_0());
				}
				lv_subPropery_4_0=rulePropertyRef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPropertyRefRule());
					}
					set(
						$current,
						"subPropery",
						lv_subPropery_4_0,
						"x.mvmn.permock.dsl.Dsl.PropertyRef");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleConstant
entryRuleConstant returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConstantRule()); }
	iv_ruleConstant=ruleConstant
	{ $current=$iv_ruleConstant.current; }
	EOF;

// Rule Constant
ruleConstant returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_strVal_0_0=RULE_STRING
				{
					newLeafNode(lv_strVal_0_0, grammarAccess.getConstantAccess().getStrValSTRINGTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConstantRule());
					}
					setWithLastConsumed(
						$current,
						"strVal",
						lv_strVal_0_0,
						"x.mvmn.permock.dsl.Dsl.STRING");
				}
			)
		)
		    |
		(
			(
				lv_intVal_1_0=RULE_INTEGER
				{
					newLeafNode(lv_intVal_1_0, grammarAccess.getConstantAccess().getIntValINTEGERTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConstantRule());
					}
					setWithLastConsumed(
						$current,
						"intVal",
						lv_intVal_1_0,
						"x.mvmn.permock.dsl.Dsl.INTEGER");
				}
			)
		)
		    |
		(
			(
				lv_floatVal_2_0=RULE_FLOAT
				{
					newLeafNode(lv_floatVal_2_0, grammarAccess.getConstantAccess().getFloatValFLOATTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConstantRule());
					}
					setWithLastConsumed(
						$current,
						"floatVal",
						lv_floatVal_2_0,
						"x.mvmn.permock.dsl.Dsl.FLOAT");
				}
			)
		)
		    |
		(
			(
				lv_boolVal_3_0=RULE_BOOLEAN
				{
					newLeafNode(lv_boolVal_3_0, grammarAccess.getConstantAccess().getBoolValBOOLEANTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConstantRule());
					}
					setWithLastConsumed(
						$current,
						"boolVal",
						lv_boolVal_3_0,
						"x.mvmn.permock.dsl.Dsl.BOOLEAN");
				}
			)
		)
	)
;

// Entry rule entryRuleEntity
entryRuleEntity returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityRule()); }
	iv_ruleEntity=ruleEntity
	{ $current=$iv_ruleEntity.current; }
	EOF;

// Rule Entity
ruleEntity returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getEntityRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"x.mvmn.permock.dsl.Dsl.ID");
			}
		)
	)
;

// Rule Operator
ruleOperator returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='='
			{
				$current = grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='!='
			{
				$current = grammarAccess.getOperatorAccess().getNEQEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getNEQEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='>'
			{
				$current = grammarAccess.getOperatorAccess().getGTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getGTEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='>='
			{
				$current = grammarAccess.getOperatorAccess().getGTEQEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getOperatorAccess().getGTEQEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='<'
			{
				$current = grammarAccess.getOperatorAccess().getLTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getOperatorAccess().getLTEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='<='
			{
				$current = grammarAccess.getOperatorAccess().getLTEQEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getOperatorAccess().getLTEQEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='~='
			{
				$current = grammarAccess.getOperatorAccess().getREGEXEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getOperatorAccess().getREGEXEnumLiteralDeclaration_6());
			}
		)
	)
;

// Rule ListOperation
ruleListOperation returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='where'
			{
				$current = grammarAccess.getListOperationAccess().getFILTEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getListOperationAccess().getFILTEREnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='all'
			{
				$current = grammarAccess.getListOperationAccess().getALLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getListOperationAccess().getALLEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='any'
			{
				$current = grammarAccess.getListOperationAccess().getANYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getListOperationAccess().getANYEnumLiteralDeclaration_2());
			}
		)
	)
;

RULE_BOOLEAN : ('true'|'false');

RULE_FLOAT : RULE_INTEGER '.' RULE_INTEGER;

RULE_INTEGER : ('0'..'9')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;