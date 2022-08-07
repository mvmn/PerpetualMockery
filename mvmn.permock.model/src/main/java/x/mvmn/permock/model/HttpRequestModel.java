package x.mvmn.permock.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.Getter;

public class HttpRequestModel {
	private final byte[] body;

	@Getter
	private final String httpMethod;
	@Getter
	private final String path;
	@Getter
	private final String query;
	@Getter
	private final ContentTypeModel contentType;

	@Getter
	private final List<HttpHeader> httpHeaders;
	@Getter
	private final HttpHeaderDictionary httpHeadersByName;

	@Getter
	private final List<Cookie> cookies;
	@Getter
	private final CookieDictionary cookiesByName;

	@Getter
	private final List<RequestParameter> queryParams;
	@Getter
	private final RequestParameterDictionary queryParamsByName;

	@Getter
	private final List<RequestParameter> formUrlencodedParams;
	@Getter
	private final RequestParameterDictionary formUrlencodedParamsByName;

	@Getter
	private List<RequestParameter> requestParams;
	@Getter
	private RequestParameterDictionary requestParamsByName;

	public HttpRequestModel(String httpMethod, String path, String query, ContentTypeModel contentTypeModel,
			HttpHeaderDictionary headersByName, CookieDictionary cookiesByName,
			RequestParameterDictionary requestParamsByName, byte[] body, List<HttpHeader> headers, List<Cookie> cookies,
			List<RequestParameter> requestParams, RequestParameterDictionary formUrlencodedParamsByName,
			List<RequestParameter> formUrlencodedParams) {
		this.contentType = contentTypeModel;
		this.httpMethod = httpMethod;
		this.httpHeadersByName = headersByName;
		this.cookiesByName = cookiesByName;
		this.queryParamsByName = requestParamsByName;
		this.body = body;
		this.httpHeaders = headers;
		this.cookies = cookies;
		this.queryParams = requestParams;
		this.path = path;
		this.query = query;
		this.formUrlencodedParamsByName = formUrlencodedParamsByName;
		this.formUrlencodedParams = formUrlencodedParams;
		this.requestParams = Stream.concat(queryParams.stream(), formUrlencodedParams.stream())
				.collect(Collectors.toList());
		this.requestParamsByName = new RequestParameterDictionary(requestParams);
	}

	@Override
	public String toString() {
		return "HttpRequestModel [httpMethod=" + httpMethod + ", headersByName=" + httpHeadersByName
				+ ", cookiesByName=" + cookiesByName + ", queryParamsByName=" + queryParamsByName + ", body="
				+ Arrays.toString(body) + ", headers=" + httpHeaders + ", cookies=" + cookies + ", requestParams="
				+ queryParams + ", contentType=" + contentType + ", path=" + path + ", query=" + query + "]";
	}

	public byte[] body() {
		return body;
	}

	public String getBodyAsString() {
		return body != null ? new String(body, contentType.detectCharset()) : null;
	}
}
