package x.mvmn.permock.model;

import java.util.Map;
import java.util.TreeMap;

import com.fasterxml.jackson.databind.JsonNode;

public class JsonValueDictionary implements Dictionary<String, JsonValue> {

	private final Map<String, JsonValue> map;

	public JsonValueDictionary(JsonNode parent) {
		map = new TreeMap<>();
		parent.fields().forEachRemaining(entry -> map.put(entry.getKey(), JsonValue.of(entry.getValue())));
	}

	public JsonValueDictionary(Map<String, JsonValue> map) {
		this.map = map;
	}

	public JsonValue get(String headerName) {
		return map.get(headerName);
	}

	@Override
	public String toString() {
		return "JsonValueDictionary [map=" + map + "]";
	}
}
