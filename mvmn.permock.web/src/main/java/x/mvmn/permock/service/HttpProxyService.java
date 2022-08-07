package x.mvmn.permock.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import x.mvmn.permock.model.HttpRequestModel;

public interface HttpProxyService {
	void proxyRequest(String url, HttpServletRequest request, HttpServletResponse response,
			HttpRequestModel mappedRequest);
}