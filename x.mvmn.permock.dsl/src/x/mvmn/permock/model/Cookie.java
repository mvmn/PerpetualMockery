package x.mvmn.permock.model;

public class Cookie {

	private final String name;
	private final String domain;
	private final String path;
	private final String expires;
	private final String maxAge;
	private final Boolean httpOnly;
	private final Boolean secure;
	private final Boolean sameSiteLax;
	private final Boolean sameSiteStrict;

	public Cookie(String name, String domain, String path, String expires, String maxAge, Boolean httpOnly,
			Boolean secure, Boolean sameSiteLax, Boolean sameSiteStrict) {
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

	public Boolean getHttpOnly() {
		return httpOnly;
	}

	public Boolean getSecure() {
		return secure;
	}

	public Boolean getSameSiteLax() {
		return sameSiteLax;
	}

	public Boolean getSameSiteStrict() {
		return sameSiteStrict;
	}
}
