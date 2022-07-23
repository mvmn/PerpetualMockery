package x.mvmn.permock.model.rules;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MockRuleReference extends MockRuleOperand {

	private String entity;
	private MockRulePropertyReference propRef;

	@Override
	public boolean isConstant() {
		return false;
	}

	@Override
	public boolean isListElementRef() {
		return false;
	}

	@Override
	public String toString() {
		return entity + (propRef != null ? propRef.toString() : "");
	}
}
