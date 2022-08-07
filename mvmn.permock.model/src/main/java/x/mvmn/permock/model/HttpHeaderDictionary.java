package x.mvmn.permock.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HttpHeaderDictionary implements Dictionary<String, HttpHeader> {

	private final Map<String, HttpHeader> map;

	public HttpHeaderDictionary(List<HttpHeader> headers) {
		map = new HashMap<>();
		headers.forEach(p -> map.put(p.getName().toLowerCase(), p));
	}

	public HttpHeaderDictionary(Map<String, HttpHeader> headers) {
		this.map = new HashMap<>();
		headers.entrySet().forEach(e -> map.put(e.getKey().toLowerCase(), e.getValue()));
	}

	public HttpHeader get(String headerName) {
		if (headerName == null) {
			return null;
		}
		return map.get(headerName.toLowerCase());
	}

	@Override
	public String toString() {
		return "HttpHeaderDictionary [map=" + map + "]";
	}
}
