package x.mvmn.permock.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JsonNode {

	private com.fasterxml.jackson.databind.JsonNode jsonNode;

	public String getAsString() {
		return jsonNode != null ? jsonNode.asText() : null;
	}

	public List<JsonNode> getAsArray() {
		if (jsonNode == null || !jsonNode.isArray()) {
			return Collections.emptyList();
		}
		List<JsonNode> result = new ArrayList<>(jsonNode.size());
		jsonNode.forEach(child -> result.add(JsonNode.of(child)));
		return result;
	}

	public JsonNodeDictionary getAsObject() {
		if (jsonNode == null || !jsonNode.isObject()) {
			return null;
		}
		return new JsonNodeDictionary(jsonNode);
	}

	public Boolean getAsBoolean() {
		if (jsonNode == null || !jsonNode.isBoolean()) {
			return null;
		}
		return jsonNode.asBoolean(false);
	}

	public Long getAsInt() {
		if (jsonNode == null || !jsonNode.isIntegralNumber()) {
			return null;
		}
		return jsonNode.asLong();
	}

	public Double getAsFloat() {
		if (jsonNode == null || !jsonNode.isFloatingPointNumber()) {
			return null;
		}
		return jsonNode.asDouble();
	}

	public Long getSize() {
		if (jsonNode == null) {
			return 0L;
		}
		return Long.valueOf(jsonNode.size());
	}

	public Boolean getIsObject() {
		return jsonNode != null && jsonNode.isObject();
	}

	public Boolean getIsArray() {
		return jsonNode != null && jsonNode.isArray();
	}

	public Boolean getIsValueNode() {
		return jsonNode != null && jsonNode.isValueNode();
	}

	public Boolean getIsContainerNode() {
		return jsonNode != null && jsonNode.isContainerNode();
	}

	public Boolean getIsNumber() {
		return jsonNode != null && jsonNode.isNumber();
	}

	public Boolean getIsFloat() {
		return jsonNode != null && jsonNode.isFloatingPointNumber();
	}

	public Boolean getIsInteger() {
		return jsonNode != null && jsonNode.isIntegralNumber();
	}

	public Boolean getIsTextual() {
		return jsonNode != null && jsonNode.isTextual();
	}

	public Boolean getIsBoolean() {
		return jsonNode != null && jsonNode.isBoolean();
	}

	public Boolean getIsNull() {
		return jsonNode == null || jsonNode.isNull();
	}

	public static JsonNode of(com.fasterxml.jackson.databind.JsonNode jsonNode) {
		return new JsonNode(jsonNode);
	}

	public com.fasterxml.jackson.databind.JsonNode jsonNode() {
		return jsonNode;
	}
}
