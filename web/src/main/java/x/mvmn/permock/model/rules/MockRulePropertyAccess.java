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
public class MockRulePropertyAccess extends MockRulePropertyReference {

	private String property;

	@Override
	public boolean isListFunction() {
		return false;
	}

	@Override
	public boolean isListAccess() {
		return false;
	}

	@Override
	public boolean isDictionaryAccess() {
		return false;
	}

	@Override
	public String toString() {
		String result = "." + property;

		if (subProp != null) {
			result += subProp;
		}

		return result;
	}
}
