package x.mvmn.permock.model.rules;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MockRule {
	private MockRuleCondition conditions;
	private MockResponseConfig responseConfig;

	@Override
	public String toString() {
		return "if\n\t" + conditions.toString() + "\n\t" + responseConfig.toString();
	}
}
