package x.mvmn.permock.model;

public interface CookieDictionary extends Dictionary<String, Cookie> {
	public Cookie get(String key);
}
