package x.mvmn.permock.model.rules;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import lombok.Data;

@Data
@JsonIgnoreProperties("_type")
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "_type")
@JsonSubTypes({ @JsonSubTypes.Type(value = MockRuleDictionaryAccess.class, name = "_type"),
		@JsonSubTypes.Type(value = MockRuleListAccess.class, name = "_type"),
		@JsonSubTypes.Type(value = MockRulePropertyAccess.class, name = "_type"),
		@JsonSubTypes.Type(value = MockRuleListFunction.class, name = "_type"),
		@JsonSubTypes.Type(value = MockRuleFunctionCall.class, name = "_type") })
public abstract class MockRulePropertyReference {

	protected MockRulePropertyReference subProp;

	@JsonIgnore
	public boolean isListAccess() {
		return false;
	}

	@JsonIgnore
	public boolean isPropertyAccess() {
		return false;
	}

	@JsonIgnore
	public boolean isDictionaryAccess() {
		return false;
	}

	@JsonIgnore
	public boolean isListFunction() {
		return false;
	}

	@JsonIgnore
	public boolean isFunctionCall() {
		return false;
	}
}
