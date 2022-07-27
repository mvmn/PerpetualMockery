package x.mvmn.permock.model.rules;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MockRuleListFunction extends MockRulePropertyReference {

	public static enum Type {
		WHERE, ALL, ANY
	}

	private Type type;
	private String listElementAlias;
	private MockRuleCondition condition;

	@Override
	@JsonIgnore
	public boolean isListAccess() {
		return false;
	}

	@Override
	@JsonIgnore
	public boolean isDictionaryAccess() {
		return false;
	}

	@Override
	@JsonIgnore
	public boolean isListFunction() {
		return true;
	}

	@JsonIgnore
	public boolean producesBoolean() {
		return type != Type.WHERE;
	}

	@Override
	public String toString() {
		String result = "{\n\t" + type.toString().toLowerCase() + " " + listElementAlias + ":\n\t\t"
				+ condition.toString() + "\n\t}";

		if (subProp != null) {
			result += subProp;
		}

		return result;
	}
}
