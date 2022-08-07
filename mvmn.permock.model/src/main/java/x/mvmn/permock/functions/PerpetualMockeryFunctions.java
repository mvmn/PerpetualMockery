package x.mvmn.permock.functions;

import java.io.ByteArrayInputStream;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.NullNode;

import io.burt.jmespath.jackson.JacksonRuntime;
import x.mvmn.permock.model.JsonNode;
import x.mvmn.permock.model.XmlNode;
import x.mvmn.permock.util.StringUtil;

public class PerpetualMockeryFunctions {

	private static final Logger LOGGER = LoggerFactory.getLogger(PerpetualMockeryFunctions.class);
	private final ObjectMapper objectMapper = new ObjectMapper();

	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.PARAMETER)
	public static @interface FunctionParam {
		public String value() default "param";
	}

	public String replace(String val, @FunctionParam("regex") String regex,
			@FunctionParam("replacement") String param) {
		try {
			return StringUtil.blankForNull(val).replaceAll(StringUtil.blankForNull(regex),
					StringUtil.blankForNull(param));
		} catch (Exception e) {
			LOGGER.warn("Regex error", e);
			return "Regex error: " + e.getMessage();
		}
	}

	public String replaceFirst(String val, @FunctionParam("value") String regex,
			@FunctionParam("replacement") String param) {
		try {
			return StringUtil.blankForNull(val).replaceFirst(StringUtil.blankForNull(regex),
					StringUtil.blankForNull(param));
		} catch (Exception e) {
			LOGGER.warn("Regex error", e);
			return "Regex error: " + e.getMessage();
		}
	}

	public String replaceStr(String val, @FunctionParam("value") String regex,
			@FunctionParam("replacement") String param) {
		return StringUtil.blankForNull(val).replace(StringUtil.blankForNull(regex), StringUtil.blankForNull(param));
	}

	public String append(String val, String param) {
		return StringUtil.blankForNull(val) + StringUtil.blankForNull(param);
	}

	public String prepend(String val, String param) {
		return StringUtil.blankForNull(param) + StringUtil.blankForNull(val);
	}

	public String appendIfNotEmpty(String val, String param) {
		return val != null && !val.isEmpty() ? val + StringUtil.blankForNull(param) : val;
	}

	public String prependIfNotEmpty(String val, String param) {
		return val != null && !val.isEmpty() ? StringUtil.blankForNull(param) + val : val;
	}

	public Boolean startsWith(String val, String param) {
		return StringUtil.blankForNull(val).startsWith(StringUtil.blankForNull(param));
	}

	public Boolean endsWith(String val, String param) {
		return StringUtil.blankForNull(val).endsWith(StringUtil.blankForNull(param));
	}

	public Boolean contains(String val, String param) {
		return StringUtil.blankForNull(val).contains(StringUtil.blankForNull(param));
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

	public String join(List<?> val, @FunctionParam("separator") String separator) {
		if (val == null || val.isEmpty()) {
			return null;
		}
		return val.stream().map(v -> v != null ? v.toString() : "").collect(Collectors.joining(separator));
	}

	public String joinSurrounding(List<?> val, @FunctionParam("separator") String separator,
			@FunctionParam("prefix") String prefix, @FunctionParam("suffix") String suffix) {
		if (val == null || val.isEmpty()) {
			return null;
		}
		return StringUtil.blankForNull(prefix)
				+ val.stream().map(v -> v != null ? v.toString() : "").collect(Collectors.joining(separator))
				+ StringUtil.blankForNull(suffix);
	}

	public JsonNode parseJson(String str) {
		try {
			return JsonNode.of(objectMapper.readTree(str));
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public JsonNode jmesPath(JsonNode val, String str) {
		return val == null || val.getIsNull() ? JsonNode.of(NullNode.instance)
				: JsonNode.of(new JacksonRuntime().compile(str).search(val.jsonNode()));
	}

	public XmlNode parseXml(String str) {
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			try {
				dbf.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
				dbf.setAttribute(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "");
				dbf.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
				dbf.setFeature("http://xml.org/sax/features/external-general-entities", false);
				dbf.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
				dbf.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
				dbf.setXIncludeAware(false);
				dbf.setExpandEntityReferences(false);
			} catch (Exception e) {
				LOGGER.warn("XML parser setup error", e);
			}
			Document document = dbf.newDocumentBuilder()
					.parse(new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8)));
			return new XmlNode(document.getFirstChild());
		} catch (Exception e) {
			LOGGER.warn("XML parsing error", e);
			return null;
		}
	}

	public XmlNode xPath(XmlNode val, String str) {
		try {
			Node result = (Node) XPathFactory.newInstance().newXPath().compile(str).evaluate(val.node(),
					XPathConstants.NODE);
			return result != null ? new XmlNode(result) : null;
		} catch (Exception e) {
			LOGGER.warn("Xpath error", e);
			return null;
		}
	}

	public String xPathForString(XmlNode val, String str) {
		try {
			return XPathFactory.newInstance().newXPath().compile(str).evaluate(val.node());
		} catch (Exception e) {
			LOGGER.warn("Xpath error", e);
			return null;
		}
	}

	public List<XmlNode> xPathForList(XmlNode val, String str) {
		try {
			NodeList nodes = (NodeList) XPathFactory.newInstance().newXPath().compile(str).evaluate(val.node(),
					XPathConstants.NODESET);
			return XmlNode.ofList(nodes);
		} catch (Exception e) {
			LOGGER.warn("Xpath error", e);
			return Collections.emptyList();
		}
	}

	public Boolean xPathForBoolean(XmlNode val, String str) {
		try {
			Boolean result = (Boolean) XPathFactory.newInstance().newXPath().compile(str).evaluate(val.node(),
					XPathConstants.BOOLEAN);
			return result;
		} catch (Exception e) {
			LOGGER.warn("Xpath error", e);
			return null;
		}
	}

	public Double xPathForFloat(XmlNode val, String str) {
		try {
			Number result = (Number) XPathFactory.newInstance().newXPath().compile(str).evaluate(val.node(),
					XPathConstants.NUMBER);
			return result != null ? result.doubleValue() : null;
		} catch (Exception e) {
			LOGGER.warn("Xpath error", e);
			return null;
		}
	}

	public Long xPathForInteger(XmlNode val, String str) {
		try {
			Number result = (Number) XPathFactory.newInstance().newXPath().compile(str).evaluate(val.node(),
					XPathConstants.NUMBER);
			return result != null ? result.longValue() : null;
		} catch (Exception e) {
			LOGGER.warn("Xpath error", e);
			return null;
		}
	}

	public Long parseInt(String val, @FunctionParam("defaultValue") Long defaultVal) {
		Long result = defaultVal;

		if (val != null) {
			try {
				result = Long.parseLong(val.trim());
			} catch (Exception e) {
			}
		}

		return result;
	}

	public Double parseFloat(String val, @FunctionParam("defaultValue") Double defaultVal) {
		Double result = defaultVal;

		if (val != null) {
			try {
				result = Double.parseDouble(val.trim());
			} catch (Exception e) {
			}
		}

		return result;
	}

	public Boolean parseBoolean(String val, @FunctionParam("defaultValue") Boolean defaultVal) {
		Boolean result = defaultVal;

		if (val != null) {
			try {
				result = Boolean.valueOf(val.trim());
			} catch (Exception e) {
			}
		}

		return result;
	}

	public Long addInt(Long val, Long val2) {
		return zeroForNull(val) + zeroForNull(val2);
	}

	public Long subInt(Long val, Long val2) {
		return zeroForNull(val) - zeroForNull(val2);
	}

	public Long mulInt(Long val, Long val2) {
		return zeroForNull(val) * zeroForNull(val2);
	}

	public Long divInt(Long val, Long val2) {
		if (val2 == null || val2 == 0) {
			return null;
		}
		return zeroForNull(val) / val2;
	}

	private long zeroForNull(Long val) {
		return val != null ? val.longValue() : 0L;
	}

	public Double addFloat(Double val, Double val2) {
		return zeroForNull(val) + zeroForNull(val2);
	}

	public Double subFloat(Double val, Double val2) {
		return zeroForNull(val) - zeroForNull(val2);
	}

	public Double mulFloat(Double val, Double val2) {
		return zeroForNull(val) * zeroForNull(val2);
	}

	public Double divFloat(Double val, Double val2) {
		if (val2 == null || val2 < 0.00000000000001) {
			return null;
		}
		return zeroForNull(val) / val2;
	}

	private double zeroForNull(Double val) {
		return val != null ? val.doubleValue() : 0.0d;
	}
}