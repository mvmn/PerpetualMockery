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
public class MockRuleExpression extends MockRuleCondition {

	public static enum Type {
		EQ, NEQ, GT, LT, GTEQ, LTEQ, REGEX
	}

	private Type type;
	private MockRuleOperand left;
	private MockRuleOperand right;

	@Override
	@JsonIgnore
	public boolean isUnaryLogicalCondition() {
		return false;
	}

	@Override
	@JsonIgnore
	public boolean isBinaryLogicalCondition() {
		return false;
	}

	@Override
	@JsonIgnore
	public boolean isExpression() {
		return true;
	}

	@Override
	public String toString() {
		String result = left.toString();
		if (type != null && right != null) {
			result += " " + typeToString() + " " + right.toString();

		}
		return result;
	}

	private String typeToString() {
		switch (type) {
		case NEQ:
			return "!=";
		case GT:
			return ">";
		case LT:
			return "<";
		case GTEQ:
			return ">=";
		case LTEQ:
			return "<=";
		case REGEX:
			return "~=";
		case EQ:
		default:
			return "=";
		}
	}
}
