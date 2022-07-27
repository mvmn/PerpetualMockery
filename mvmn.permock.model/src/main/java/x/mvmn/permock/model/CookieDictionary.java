package x.mvmn.permock.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CookieDictionary implements Dictionary<String, Cookie> {
	private final Map<String, Cookie> map;

	public CookieDictionary(List<Cookie> params) {
		map = new HashMap<>();
		params.forEach(p -> map.put(p.getName(), p));
	}

	public CookieDictionary(Map<String, Cookie> map) {
		this.map = map;
	}

	public Cookie get(String key) {
		return map.get(key);
	}

	@Override
	public String toString() {
		return "CookieDictionary [map=" + map + "]";
	}
}
