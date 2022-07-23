package x.mvmn.permock.model.rules;

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
public class MockRuleBiLogicalCondition extends MockRuleCondition {

	public static enum Type {
		OR, AND
	};

	private MockRuleCondition left;
	private MockRuleCondition right;
	private Type type;

	@Override
	public boolean isUnaryLogicalCondition() {
		return false;
	}

	@Override
	public boolean isBinaryLogicalCondition() {
		return true;
	}

	@Override
	public boolean isExpression() {
		return false;
	}

	@Override
	public String toString() {
		return left.toString() + (type == Type.OR ? " or " : " and ") + right.toString();
	}
}
