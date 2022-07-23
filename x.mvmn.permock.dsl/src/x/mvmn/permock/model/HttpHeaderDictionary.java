package x.mvmn.permock.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HttpHeaderDictionary implements Dictionary<String, HttpHeader> {

	private final Map<String, HttpHeader> map;

	public HttpHeaderDictionary(List<HttpHeader> params) {
		map = new HashMap<>();
		params.forEach(p -> map.put(p.getName(), p));
	}

	public HttpHeaderDictionary(Map<String, HttpHeader> map) {
		this.map = map;
	}

	public HttpHeader get(String headerName) {
		return map.get(headerName);
	}

	@Override
	public String toString() {
		return "HttpHeaderDictionary [map=" + map + "]";
	}
}
