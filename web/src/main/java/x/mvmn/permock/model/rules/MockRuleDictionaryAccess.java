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
public class MockRuleDictionaryAccess extends MockRulePropertyReference {

	private String key;

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
		return true;
	}

	@Override
	public String toString() {
		String result = "['" + key + "']"; // TODO: escape string

		if (subProp != null) {
			result += subProp;
		}

		return result;
	}
}
