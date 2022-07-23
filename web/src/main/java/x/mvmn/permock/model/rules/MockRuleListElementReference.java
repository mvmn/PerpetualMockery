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
public class MockRuleListElementReference extends MockRuleOperand {
	private String listElementAlias;
	private MockRulePropertyReference propRef;

	@Override
	public boolean isConstant() {
		return false;
	}

	@Override
	public boolean isListElementRef() {
		return true;
	}

	@Override
	public String toString() {
		String result = "$" + listElementAlias;

		if (propRef != null) {
			result += propRef;
		}

		return result;
	}
}
