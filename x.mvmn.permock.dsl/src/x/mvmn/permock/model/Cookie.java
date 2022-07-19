package x.mvmn.permock.model;

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

	public Cookie(String name, String domain, String path, String expires, String maxAge, boolean httpOnly,
			boolean secure, boolean sameSiteLax, boolean sameSiteStrict) {
		this.name = name;
		this.domain = domain;
		this.path = path;
		this.expires = expires;
		this.maxAge = maxAge;
		this.httpOnly = httpOnly;
		this.secure = secure;
		this.sameSiteLax = sameSiteLax;
		this.sameSiteStrict = sameSiteStrict;
	}

	public boolean isSameSite() {
		return sameSiteLax || sameSiteStrict;
	}

	public String getName() {
		return name;
	}

	public String getDomain() {
		return domain;
	}

	public String getPath() {
		return path;
	}

	public String getExpires() {
		return expires;
	}

	public String getMaxAge() {
		return maxAge;
	}

	public boolean isHttpOnly() {
		return httpOnly;
	}

	public boolean isSecure() {
		return secure;
	}

	public boolean isSameSiteLax() {
		return sameSiteLax;
	}

	public boolean isSameSiteStrict() {
		return sameSiteStrict;
	}
}
