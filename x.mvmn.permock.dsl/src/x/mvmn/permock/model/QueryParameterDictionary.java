package x.mvmn.permock.model;

public interface QueryParameterDictionary extends Dictionary<String, QueryParameter> {
	public QueryParameter get(String key);
}
