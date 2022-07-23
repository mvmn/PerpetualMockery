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
public class MockRuleUnaryCondition extends MockRuleCondition {

	private MockRuleCondition wrappedCondition;
	private boolean negate;

	@Override
	public boolean isUnaryLogicalCondition() {
		return true;
	}

	@Override
	public boolean isBinaryLogicalCondition() {
		return false;
	}

	@Override
	public boolean isExpression() {
		return false;
	}

	@Override
	public String toString() {
		if (negate) {
			return "not (" + wrappedCondition + ")";
		} else
			return "(" + wrappedCondition + ")";
	}
}
