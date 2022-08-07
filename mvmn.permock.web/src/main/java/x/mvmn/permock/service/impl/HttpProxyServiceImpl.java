package x.mvmn.permock.service.impl;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.io.entity.ByteArrayEntity;
import org.apache.hc.core5.http.message.BasicClassicHttpRequest;
import org.springframework.core.NestedExceptionUtils;
import org.springframework.stereotype.Service;

import x.mvmn.permock.model.HttpRequestModel;
import x.mvmn.permock.service.HttpProxyService;

@Service
public class HttpProxyServiceImpl implements HttpProxyService {

	private CloseableHttpClient httpClient;

	private Set<String> skipHeaders = new HashSet<>();

	@PostConstruct
	public void init() {
		this.httpClient = HttpClients.custom().disableCookieManagement().disableAuthCaching().disableRedirectHandling()
				.disableAutomaticRetries().disableDefaultUserAgent().disableContentCompression()
				.disableConnectionState().build();

		skipHeaders.add("host");
		skipHeaders.add("content-length");
		skipHeaders.add("content-encoding");
	}

	@PreDestroy
	public void destroy() {
		try {
			this.httpClient.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void proxyRequest(String url, HttpServletRequest request, HttpServletResponse response,
			HttpRequestModel mappedRequest) {
		System.out.println("Proxying " + request.getMethod() + " " + url);

		BasicClassicHttpRequest proxRequest = new BasicClassicHttpRequest(request.getMethod(), url);
		Collections.list(request.getHeaderNames()).stream()
				.filter(headerName -> !skipHeaders.contains(headerName.toLowerCase()))
				.forEach(headerName -> Collections.list(request.getHeaders(headerName)).stream()
						.forEach(headerValue -> proxRequest.addHeader(headerName, headerValue)));
		if (mappedRequest.body() != null && mappedRequest.body().length > 0) {
			proxRequest.setEntity(new ByteArrayEntity(mappedRequest.body(), null));
		}

		try (CloseableHttpResponse proxResponse = httpClient.execute(proxRequest)) {
			response.setStatus(proxResponse.getCode());
			Stream.of(proxResponse.getHeaders())
					.forEach(header -> response.addHeader(header.getName(), header.getValue()));
			HttpEntity entity = proxResponse.getEntity();
			if (entity != null) {
				try (ServletOutputStream out = response.getOutputStream()) {
					IOUtils.copy(entity.getContent(), out);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			response.setStatus(500);
			try (ServletOutputStream out = response.getOutputStream()) {
				out.write(NestedExceptionUtils.buildMessage("Proxying failure", e).getBytes(StandardCharsets.UTF_8));
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
