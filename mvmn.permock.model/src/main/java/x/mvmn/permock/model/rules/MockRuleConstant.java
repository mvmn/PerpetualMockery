package x.mvmn.permock.model.rules;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import x.mvmn.permock.util.Property;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MockRuleConstant extends MockRuleOperand {

	public static enum Type {
		BOOL(Boolean.class), INT(Long.class), FLOAT(Double.class), STR(String.class);

		private final Property type;

		private Type(Class<?> type) {
			this.type = new Property("const", type);
		}

		public Property getType() {
			return type;
		}
	}

	private Type type;
	private Boolean boolVal;
	private Long intVal;
	private Double floatVal;
	private String strVal;
	protected MockRulePropertyReference subProp;

	@Override
	@JsonIgnore
	public boolean isConstant() {
		return true;
	}

	@Override
	@JsonIgnore
	public boolean isListElementRef() {
		return false;
	}

	@Override
	public String toString() {
		String result;
		switch (type) {
		case BOOL:
			result = boolVal.toString().toLowerCase();
			break;
		case FLOAT:
			result = floatVal.toString();
			break;
		case INT:
			result = intVal.toString();
			break;
		case STR:
		default:
			result = "'" + strVal + "'"; // TODO: escape string
		}
		if (subProp != null) {
			result += subProp;
		}
		return result;
	}

	@JsonIgnore
	public Object getValue() {
		switch (type) {
		case BOOL:
			return boolVal;
		case FLOAT:
			return floatVal;
		case INT:
			return intVal;
		case STR:
		default:
			return strVal;
		}
	}
}
