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
public class MockRuleBiLogicalCondition extends MockRuleCondition {

	public static enum Type {
		OR, AND
	};

	private MockRuleCondition left;
	private MockRuleCondition right;
	private Type type;

	@Override
	@JsonIgnore
	public boolean isUnaryLogicalCondition() {
		return false;
	}

	@Override
	@JsonIgnore
	public boolean isBinaryLogicalCondition() {
		return true;
	}

	@Override
	@JsonIgnore
	public boolean isExpression() {
		return false;
	}

	@Override
	public String toString() {
		return left.toString() + (type == Type.OR ? " or " : " and ") + right.toString();
	}
}
