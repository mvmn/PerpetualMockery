package x.mvmn.permock.model;

import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Arrays;
import java.util.List;

public class HttpRequestModel {
	private final String httpMethod;
	private final StringDictionary headersByName;
	private final CookieDictionary cookiesByName;
	private final byte[] body;
	private final List<HttpHeader> headers;
	private final List<Cookie> cookies;

	public HttpRequestModel(String httpMethod, StringDictionary headersByName, CookieDictionary cookiesByName,
			byte[] body, List<HttpHeader> headers, List<Cookie> cookies) {
		this.httpMethod = httpMethod;
		this.headersByName = headersByName;
		this.cookiesByName = cookiesByName;
		this.body = body;
		this.headers = headers;
		this.cookies = cookies;
	}

	public String getHttpMethod() {
		return httpMethod;
	}

	public StringDictionary getHeadersByName() {
		return headersByName;
	}

	public CookieDictionary getCookiesByName() {
		return cookiesByName;
	}

	public byte[] getBody() {
		return body;
	}

	public List<HttpHeader> getHeaders() {
		return headers;
	}

	public List<Cookie> getCookies() {
		return cookies;
	}

	public String getBodyAsString() {
		return body != null ? new String(body, requestCharset()) : null;
	}

	private Charset requestCharset() {
		Charset result = StandardCharsets.UTF_8;
		String contentType = headersByName.get("Content-Type");
		if (contentType != null) {
			String charsetStr = Arrays.asList(contentType.split("\\s*;\\s*")).stream()
					.filter(val -> val.toLowerCase().startsWith("charset=")).findFirst().orElse(null);
			if (charsetStr != null) {
				try {
					return Charset.forName(charsetStr.toUpperCase());
				} catch (IllegalCharsetNameException | UnsupportedCharsetException e) {
				}
			}
		}
		return result;
	}
}
