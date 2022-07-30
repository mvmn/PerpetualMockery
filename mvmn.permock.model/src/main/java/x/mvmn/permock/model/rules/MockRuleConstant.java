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
