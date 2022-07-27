package x.mvmn.permock.service;

import x.mvmn.permock.model.rules.MockRule;

public interface RuleParsingService {

	MockRule parse(String text);

}