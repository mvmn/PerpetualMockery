package x.mvmn.permock.model;

public interface HeaderDictionary extends Dictionary<String, HttpHeader> {
	HttpHeader get(String headerName);
}
