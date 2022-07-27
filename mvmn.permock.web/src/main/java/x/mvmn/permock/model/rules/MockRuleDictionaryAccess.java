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
public class MockRuleDictionaryAccess extends MockRulePropertyReference {

	private String key;

	@Override
	@JsonIgnore
	public boolean isListFunction() {
		return false;
	}

	@Override
	@JsonIgnore
	public boolean isListAccess() {
		return false;
	}

	@Override
	@JsonIgnore
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
