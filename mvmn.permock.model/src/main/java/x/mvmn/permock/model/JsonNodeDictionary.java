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

	public JsonNode get(String name) {
		if (name == null) {
			return null;
		}
		return map.get(name);
	}

	@Override
	public String toString() {
		return "JsonValueDictionary [map=" + map + "]";
	}
}
