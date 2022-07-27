package x.mvmn.permock.service;

import x.mvmn.permock.model.HttpRequestModel;
import x.mvmn.permock.model.rules.MockRuleCondition;

public interface RuleConditionEvaluationService {

	boolean evaluate(MockRuleCondition conditions, HttpRequestModel requestModel);

}