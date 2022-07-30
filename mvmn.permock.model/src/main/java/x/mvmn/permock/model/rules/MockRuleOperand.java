package x.mvmn.permock.model.rules;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonIgnoreProperties("_type")
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "_type")
@JsonSubTypes({ @JsonSubTypes.Type(value = MockRuleConstant.class, name = "_type"),
		@JsonSubTypes.Type(value = MockRuleListElementReference.class, name = "_type"),
		@JsonSubTypes.Type(value = MockRuleReference.class, name = "_type") })
public abstract class MockRuleOperand {

	public abstract boolean isConstant();

	public abstract boolean isListElementRef();
}
