package x.mvmn.permock.model;

public class Cookie {

	private final String name;
	private final String value;
	private final String domain;
	private final String path;
	private final String comment;
	private final Long maxAge;
	private final Long version;
	private final Boolean secure;

	public Cookie(String name, String value, String domain, String path, String comment, Long maxAge, Boolean secure,
			Long version) {
		this.name = name;
		this.value = value;
		this.domain = domain;
		this.path = path;
		this.comment = comment;
		this.secure = secure;
		this.version = version;
		this.maxAge = maxAge;
	}

	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}

	public String getDomain() {
		return domain;
	}

	public String getPath() {
		return path;
	}

	public Boolean getSecure() {
		return secure;
	}

	public String getComment() {
		return comment;
	}

	public Long getMaxAge() {
		return maxAge;
	}

	public Long getVersion() {
		return version;
	}

	@Override
	public String toString() {
		return "Cookie [name=" + name + ", value=" + value + ", domain=" + domain + ", path=" + path + ", comment="
				+ comment + ", maxAge=" + maxAge + ", version=" + version + ", secure=" + secure + "]";
	}
}
