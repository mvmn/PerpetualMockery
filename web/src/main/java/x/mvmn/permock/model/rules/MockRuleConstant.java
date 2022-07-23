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
public class MockRuleConstant extends MockRuleOperand {

	public static enum Type {
		BOOL, INT, FLOAT, STR
	}

	private Type type;
	private Boolean boolVal;
	private Long intVal;
	private Double floatVal;
	private String strVal;

	@Override
	public boolean isConstant() {
		return true;
	}

	@Override
	public boolean isListElementRef() {
		return false;
	}

	@Override
	public String toString() {
		switch (type) {
		case BOOL:
			return boolVal.toString().toLowerCase();
		case FLOAT:
			return floatVal.toString();
		case INT:
			return intVal.toString();
		case STR:
		default:
			return "'" + strVal + "'"; // TODO: escape string
		}
	}
}
