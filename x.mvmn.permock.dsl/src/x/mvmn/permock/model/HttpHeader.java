package x.mvmn.permock.model;

import java.util.List;

public class HttpHeader {
	private final String name;
	private final String value;
	private final List<String> values;

	public HttpHeader(String name, String value, List<String> values) {
		this.name = name;
		this.value = value;
		this.values = values;
	}

	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}

	public List<String> getValues() {
		return values;
	}
}
