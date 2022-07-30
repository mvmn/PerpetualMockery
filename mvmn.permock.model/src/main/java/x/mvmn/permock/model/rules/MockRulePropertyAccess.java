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
public class MockRulePropertyAccess extends MockRulePropertyReference {

	private String property;

	@JsonIgnore
	@Override
	public boolean isPropertyAccess() {
		return true;
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
