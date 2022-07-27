package x.mvmn.permock.model.rules;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonIgnoreProperties("_type")
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "_type")
@JsonSubTypes({ @JsonSubTypes.Type(value = MockRuleBiLogicalCondition.class, name = "_type"),
		@JsonSubTypes.Type(value = MockRuleUnaryCondition.class, name = "_type"),
		@JsonSubTypes.Type(value = MockRuleExpression.class, name = "_type") })
public abstract class MockRuleCondition {

	public abstract boolean isUnaryLogicalCondition();

	public abstract boolean isBinaryLogicalCondition();

	public abstract boolean isExpression();
}
