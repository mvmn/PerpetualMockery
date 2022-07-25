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
public class MockRuleUnaryCondition extends MockRuleCondition {

	private MockRuleCondition wrappedCondition;
	private boolean negate;

	@Override
	@JsonIgnore
	public boolean isUnaryLogicalCondition() {
		return true;
	}

	@Override
	@JsonIgnore
	public boolean isBinaryLogicalCondition() {
		return false;
	}

	@Override
	@JsonIgnore
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
