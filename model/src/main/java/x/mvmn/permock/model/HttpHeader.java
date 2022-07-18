package x.mvmn.permock.model;

import java.util.List;

import lombok.Data;

@Data
public class HttpHeader {
	private final String name;
	private final String value;
	private final List<String> values;
}
