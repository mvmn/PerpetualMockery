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
public class MockRuleListAccess extends MockRulePropertyReference {

	private Integer index;

	@Override
	public boolean isListFunction() {
		return false;
	}

	@Override
	public boolean isListAccess() {
		return true;
	}

	@Override
	public boolean isDictionaryAccess() {
		return false;
	}

	@Override
	public String toString() {
		String result = "[" + index + "]";

		if (subProp != null) {
			result += subProp;
		}

		return result;
	}
}
