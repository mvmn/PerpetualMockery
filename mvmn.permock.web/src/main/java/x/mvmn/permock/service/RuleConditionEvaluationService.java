package x.mvmn.permock.service;

import x.mvmn.permock.model.HttpRequestModel;
import x.mvmn.permock.model.rules.MockRuleCondition;
import x.mvmn.permock.model.rules.MockRuleOperand;

public interface RuleConditionEvaluationService {

	boolean evaluate(MockRuleCondition conditions, HttpRequestModel requestModel);

	String evaluate(MockRuleOperand operand, HttpRequestModel requestModel);

}