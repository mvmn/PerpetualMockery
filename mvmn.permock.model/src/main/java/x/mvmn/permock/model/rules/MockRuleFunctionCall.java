package x.mvmn.permock.model.rules;

import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

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
@JsonPropertyOrder({ "name", "args", "subProp" })
public class MockRuleFunctionCall extends MockRulePropertyReference {

	private String name;
	private List<MockRuleOperand> args;

	@Override
	@JsonIgnore
	public boolean isFunctionCall() {
		return true;
	}

	public String toString() {
		return "." + name + "(" + args.stream().map(MockRuleOperand::toString).collect(Collectors.joining(", ")) + ")"
				+ (this.subProp != null ? this.subProp.toString() : "");
	}
}
