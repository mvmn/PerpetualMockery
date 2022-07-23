package x.mvmn.permock.service.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface HttpProxyService {
	void proxyRequest(String url, HttpServletRequest request, HttpServletResponse response);
}