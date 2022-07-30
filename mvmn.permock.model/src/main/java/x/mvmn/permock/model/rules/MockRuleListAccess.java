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
public class MockRuleListAccess extends MockRulePropertyReference {

	private Integer index;

	@Override
	@JsonIgnore
	public boolean isListAccess() {
		return true;
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
