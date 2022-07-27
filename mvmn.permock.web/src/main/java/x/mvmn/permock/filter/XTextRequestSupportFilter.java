package x.mvmn.permock.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.util.ContentCachingRequestWrapper;

@Component
public class XTextRequestSupportFilter implements Filter {

	private final String PATH_PREFIX = "/api/xtext-service/";

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		if (request instanceof HttpServletRequest) {
			HttpServletRequest httpReq = (HttpServletRequest) request;
			if (isXTextRequest(httpReq)) {
				chain.doFilter(new ContentCachingRequestWrapper(httpReq) {
					@Override
					public String getPathInfo() {
						return "/" + httpReq.getServletPath().substring(PATH_PREFIX.length());
					}
				}, response);
				return;
			}
		}
		chain.doFilter(request, response);
	}

	private boolean isXTextRequest(HttpServletRequest httpReq) {
		String path = httpReq.getServletPath();
		return path != null && path.startsWith(PATH_PREFIX);
	}
}
