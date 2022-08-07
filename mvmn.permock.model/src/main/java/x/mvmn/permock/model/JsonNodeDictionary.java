package x.mvmn.permock.model;

import java.util.Map;
import java.util.TreeMap;

public class JsonNodeDictionary implements Dictionary<String, JsonNode> {

	private final Map<String, JsonNode> map;

	public JsonNodeDictionary(com.fasterxml.jackson.databind.JsonNode parent) {
		map = new TreeMap<>();
		parent.fields().forEachRemaining(entry -> map.put(entry.getKey(), JsonNode.of(entry.getValue())));
	}

	public JsonNodeDictionary(Map<String, JsonNode> map) {
		this.map = map;
	}

	public JsonNode get(String headerName) {
		return map.get(headerName);
	}

	@Override
	public String toString() {
		return "JsonValueDictionary [map=" + map + "]";
	}
}
