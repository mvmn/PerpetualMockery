package x.mvmn.permock.model;

import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Arrays;
import java.util.List;

import lombok.Data;

@Data
public class HttpRequestModel {
	private final String method;
	private final StringDictionary headersByName;
	private final CookieDictionary cookiesByName;
	private final byte[] body;
	private final List<HttpHeader> headers;
	private final List<Cookie> cookies;

	public String bodyAsString() {
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
