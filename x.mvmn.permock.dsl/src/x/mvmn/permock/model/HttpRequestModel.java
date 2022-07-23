package x.mvmn.permock.model;

import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Arrays;
import java.util.List;

public class HttpRequestModel {
	private final String httpMethod;
	private final HttpHeaderDictionary headersByName;
	private final CookieDictionary cookiesByName;
	private final RequestParameterDictionary queryParamsByName;
	private final byte[] body;
	private final List<HttpHeader> headers;
	private final List<Cookie> cookies;
	private final List<RequestParameter> requestParams;
	private final ContentTypeModel contentType;
	private final String path;
	private final String query;

	public HttpRequestModel(String httpMethod, String path, String query, HttpHeaderDictionary headersByName,
			CookieDictionary cookiesByName, RequestParameterDictionary requestParamsByName, byte[] body,
			List<HttpHeader> headers, List<Cookie> cookies, List<RequestParameter> requestParams) {
		this.httpMethod = httpMethod;
		this.headersByName = headersByName;
		this.cookiesByName = cookiesByName;
		this.queryParamsByName = requestParamsByName;
		this.body = body;
		this.headers = headers;
		this.cookies = cookies;
		this.requestParams = requestParams;
		this.contentType = new ContentTypeModel(
				headersByName.get("Content-Type") != null ? headersByName.get("Content-Type").getValue() : null);
		this.path = path;
		this.query = query;
	}

	private Charset requestCharset() {
		Charset result = StandardCharsets.UTF_8;
		String charsetStr = contentType.getCharSet();
		if (charsetStr != null) {
			try {
				return Charset.forName(charsetStr.toUpperCase());
			} catch (IllegalCharsetNameException | UnsupportedCharsetException e) {
			}
		}
		return result;
	}

	public String getHttpMethod() {
		return httpMethod;
	}

	public HttpHeaderDictionary getHttpHeadersByName() {
		return headersByName;
	}

	public CookieDictionary getCookiesByName() {
		return cookiesByName;
	}

	public byte[] body() {
		return body;
	}

	public List<HttpHeader> getHttpHeaders() {
		return headers;
	}

	public List<Cookie> getCookies() {
		return cookies;
	}

	public String getBodyAsString() {
		return body != null ? new String(body, requestCharset()) : null;
	}

	public ContentTypeModel getContentType() {
		return contentType;
	}

	public String getPath() {
		return path;
	}

	public String getQuery() {
		return query;
	}

	public RequestParameterDictionary getRequestParamsByName() {
		return queryParamsByName;
	}

	public List<RequestParameter> getRequestParams() {
		return requestParams;
	}

	@Override
	public String toString() {
		return "HttpRequestModel [httpMethod=" + httpMethod + ", headersByName=" + headersByName + ", cookiesByName="
				+ cookiesByName + ", queryParamsByName=" + queryParamsByName + ", body=" + Arrays.toString(body)
				+ ", headers=" + headers + ", cookies=" + cookies + ", requestParams=" + requestParams
				+ ", contentType=" + contentType + ", path=" + path + ", query=" + query + "]";
	}
}
