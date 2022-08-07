package x.mvmn.permock.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RequestParameterDictionary implements Dictionary<String, RequestParameter> {

	private final Map<String, RequestParameter> paramsMap;

	public RequestParameterDictionary(List<RequestParameter> params) {
		paramsMap = new HashMap<>();
		params.forEach(p -> paramsMap.put(p.getName(), p));
	}

	public RequestParameterDictionary(Map<String, RequestParameter> paramsMap) {
		this.paramsMap = paramsMap;
	}

	public RequestParameter get(String key) {
		if (key == null) {
			return null;
		}
		return paramsMap.get(key);
	}

	@Override
	public String toString() {
		return "RequestParameterDictionary [paramsMap=" + paramsMap + "]";
	}
}
