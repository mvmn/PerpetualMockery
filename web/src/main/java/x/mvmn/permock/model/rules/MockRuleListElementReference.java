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
public class MockRuleListElementReference extends MockRuleOperand {
	private String listElementAlias;
	private MockRulePropertyReference propRef;

	@Override
	@JsonIgnore
	public boolean isConstant() {
		return false;
	}

	@Override
	@JsonIgnore
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
