package x.mvmn.permock.service.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import x.mvmn.permock.service.HttpProxyService;

@Service
public class HttpProxyServiceImpl implements HttpProxyService {

	@Override
	public void proxyRequest(String url, HttpServletRequest request, HttpServletResponse response) {
		// FIXME: implement
		System.err.println("Should be proxying to " + url);
	}
}
