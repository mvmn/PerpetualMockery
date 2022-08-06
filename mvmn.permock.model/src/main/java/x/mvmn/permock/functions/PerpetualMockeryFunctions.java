package x.mvmn.permock.functions;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.burt.jmespath.jackson.JacksonRuntime;
import x.mvmn.permock.model.JsonValue;

public class PerpetualMockeryFunctions {

	private final ObjectMapper objectMapper = new ObjectMapper();

	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.PARAMETER)
	public static @interface FunctionParam {
		public String value() default "param";
	}

	private String blankForNull(String val) {
		return val != null ? val : "";
	}

	public String append(String val, String param) {
		return blankForNull(val) + blankForNull(param);
	}

	public String prepend(String val, String param) {
		return blankForNull(param) + blankForNull(val);
	}

	public Boolean startsWith(String val, String param) {
		return blankForNull(val).startsWith(blankForNull(param));
	}

	public Boolean endsWith(String val, String param) {
		return blankForNull(val).endsWith(blankForNull(param));
	}

	public Boolean contains(String val, String param) {
		return blankForNull(val).contains(blankForNull(param));
	}

	public String substring(String val, @FunctionParam("start") Long start) {
		return val != null ? substring(val, start, (long) val.length()) : "";
	}

	public String substring(String val, @FunctionParam("start") Long start, @FunctionParam("end") Long end) {
		String result = "";

		if (val != null && start != null && end != null) {
			int startIndex = start.intValue();
			if (startIndex > val.length()) {
				return "";
			}

			int endIndex = end.intValue();
			if (endIndex > val.length()) {
				endIndex = val.length();
			}
			if (startIndex >= endIndex) {
				return "";
			}
			result = val.substring(startIndex, endIndex);
		}

		return result;
	}

	public String substringAfter(String str, String val) {
		if (str == null || val == null) {
			return "";
		}
		int index = str.indexOf(val);
		if (index >= 0) {
			return str.substring(index + 1);
		} else {
			return "";
		}
	}

	public String substringAfterLast(String str, String val) {
		if (str == null || val == null) {
			return "";
		}
		int index = str.lastIndexOf(val);
		if (index >= 0) {
			return str.substring(index + 1);
		} else {
			return "";
		}
	}

	public String substringBefore(String str, String val) {
		if (str == null || val == null) {
			return "";
		}
		int index = str.indexOf(val);
		if (index >= 0) {
			return str.substring(0, index);
		} else {
			return "";
		}
	}

	public String substringBeforeLast(String str, String val) {
		if (str == null || val == null) {
			return "";
		}
		int index = str.lastIndexOf(val);
		if (index >= 0) {
			return str.substring(0, index);
		} else {
			return "";
		}
	}

	public Boolean isEmpty(String string) {
		return string == null || string.isEmpty();
	}

	public Boolean isBlank(String string) {
		return string == null || string.trim().isEmpty();
	}

	public Long length(String string) {
		return string != null ? string.length() : 0L;
	}

	public Long round(Double val) {
		return val != null ? Math.round(val) : null;
	}

	public Long ceil(Double val) {
		return val != null ? Double.valueOf(Math.ceil(val)).longValue() : null;
	}

	public Long floor(Double val) {
		return val != null ? Double.valueOf(Math.floor(val)).longValue() : null;
	}

	public String toStringFromNum(Double val) {
		return val != null ? val.toString() : null;
	}

	public String toStringFromInt(Long val) {
		return val != null ? val.toString() : null;
	}

	public String toStringFromBool(Boolean val) {
		return val != null ? val.toString() : null;
	}

	public Long size(List<?> val) {
		return val != null ? val.size() : 0L;
	}

	public Boolean isEmptyList(List<?> val) {
		return size(val) < 1;
	}

	public Boolean isNotEmptyList(List<?> val) {
		return size(val) > 0;
	}

	public <T> T first(List<T> val) {
		if (val == null || val.size() < 1) {
			return null;
		}
		return val.get(0);
	}

	public <T> T last(List<T> val) {
		if (val == null || val.size() < 1) {
			return null;
		}
		return val.get(val.size() - 1);
	}

	public String join(List<?> val, String separator) {
		if (val == null || val.isEmpty()) {
			return null;
		}
		return val.stream().map(v -> v != null ? v.toString() : "").collect(Collectors.joining(separator));
	}

	public JsonValue parseJson(String str) {
		try {
			return JsonValue.of(objectMapper.readTree(str));
		} catch (Exception e) {
			return null;
		}
	}

	public JsonValue jmesPath(JsonValue val, String str) {
		return JsonValue.of(new JacksonRuntime().compile(str).search(val.jsonNode()));
	}
}