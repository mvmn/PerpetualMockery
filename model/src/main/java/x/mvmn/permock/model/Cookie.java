package x.mvmn.permock.model;

import lombok.Data;

@Data
public class Cookie {
	private final String name;
	private final String domain;
	private final String path;
	private final String expires;
	private final String maxAge;
	private final boolean httpOnly;
	private final boolean secure;
	private final boolean sameSiteLax;
	private final boolean sameSiteStrict;

	public boolean isSameSite() {
		return sameSiteLax || sameSiteStrict;
	}
}
