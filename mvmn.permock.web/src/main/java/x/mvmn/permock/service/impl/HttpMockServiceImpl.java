package x.mvmn.permock.service.impl;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.eclipse.jetty.util.UrlEncoded;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.util.ContentCachingRequestWrapper;

import com.fasterxml.jackson.databind.ObjectMapper;

import x.mvmn.permock.model.ContentTypeModel;
import x.mvmn.permock.model.Cookie;
import x.mvmn.permock.model.CookieDictionary;
import x.mvmn.permock.model.HttpHeader;
import x.mvmn.permock.model.HttpHeaderDictionary;
import x.mvmn.permock.model.HttpRequestModel;
import x.mvmn.permock.model.RequestParameter;
import x.mvmn.permock.model.RequestParameterDictionary;
import x.mvmn.permock.model.rules.MockResponseConfig;
import x.mvmn.permock.model.rules.MockRule;
import x.mvmn.permock.persistence.entity.RuleEntity;
import x.mvmn.permock.persistence.repository.RuleRepository;
import x.mvmn.permock.service.HttpProxyService;
import x.mvmn.permock.service.RuleConditionEvaluationService;

@Service
public class HttpMockServiceImpl extends AbstractHandler {

	@Value("${mock.port:0}")
	private int mockPort;

	private volatile Server server;

	private volatile long lastRuleReadtime = 0;

	@Value("${mock.rules.cache.time:60}")
	private long ruleCacheTimeSeconds;

	private final AtomicReference<List<MockRule>> rules = new AtomicReference<List<MockRule>>();

	@Autowired
	private RuleRepository ruleRepo;

	@Autowired
	private ObjectMapper objectMapper;

	@Autowired
	private RuleConditionEvaluationService evaluationService;

	@Autowired
	private HttpProxyService proxyService;

	@PostConstruct
	public void startMockServer() throws Exception {
		Server server = new Server(mockPort);
		server.setHandler(this);
		server.start();
		int port = Stream.of(server.getConnectors()).filter(c -> c instanceof ServerConnector)
				.map(c -> (ServerConnector) c).mapToInt(ServerConnector::getLocalPort).findAny().orElse(-1);
		System.out.println("Started mock server on port " + port);
		this.server = server;
	}

	@PreDestroy
	public void stopMockServer() {
		if (server != null && server.isRunning()) {
			try {
				server.stop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request = new ContentCachingRequestWrapper(request);
		HttpRequestModel requestModel = mapToRequestModel(request);
		MockRule matchingRule = findMatchingRule(requestModel);
		if (matchingRule != null) {
			sendResponse(matchingRule.getResponseConfig(), requestModel, request, response);
		} else {
			response.setStatus(404);
		}
		baseRequest.setHandled(true);
	}

	private void sendResponse(MockResponseConfig responseConfig, HttpRequestModel requestModel,
			HttpServletRequest request, HttpServletResponse response) {
		if (responseConfig.isProxy()) {
			String proxyUrl = evaluationService.evaluate(responseConfig.getProxyUrl(), requestModel);
			proxyService.proxyRequest(proxyUrl, request, response, requestModel);
		} else {
			int responseStatus = 200;
			if (responseConfig.getResponseStatus() != null) {
				String responseStatusStr = evaluationService.evaluate(responseConfig.getResponseStatus(), requestModel);
				if (responseStatusStr != null) {
					try {
						responseStatus = Integer.parseInt(responseStatusStr);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}

			response.setStatus(responseStatus);
			if (responseConfig.getResponseHeaders() != null && !responseConfig.getResponseHeaders().isEmpty()) {
				responseConfig.getResponseHeaders()
						.forEach(header -> response.setHeader(header.getName(), header.getValue()));
			}
			if (responseConfig.getResponse() != null) {
				String responseData = evaluationService.evaluate(responseConfig.getResponse(), requestModel);
				if (responseData != null) {
					try (OutputStream os = response.getOutputStream()) {
						if (responseConfig.isRespondWithFile()) {
							FileUtils.copyFile(new File(responseData), os);
						} else {
							os.write(responseData.getBytes(StandardCharsets.UTF_8));
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	private MockRule findMatchingRule(HttpRequestModel requestModel) {
		List<MockRule> rules = getRules();

		for (MockRule rule : rules) {
			if (evaluationService.evaluate(rule.getConditions(), requestModel)) {
				return rule;
			}
		}

		return null;
	}

	private HttpRequestModel mapToRequestModel(HttpServletRequest request) {
		String method = request.getMethod();
		String path = request.getRequestURI();
		String queryString = request.getQueryString();
		List<RequestParameter> requestParams = new ArrayList<>();
		if (request.getParameterMap() != null) {
			request.getParameterMap().entrySet().stream()
					.map(param -> new RequestParameter(param.getKey(), request.getParameter(param.getKey()),
							param.getValue() != null ? Arrays.asList(param.getValue()) : Collections.emptyList()))
					.forEach(requestParams::add);
		}

		List<HttpHeader> headers = new ArrayList<>();
		if (request.getHeaderNames() != null) {
			Collections.list(request.getHeaderNames()).stream().map(headerName -> this.mapHeader(headerName, request))
					.forEach(headers::add);
		}

		List<Cookie> cookies = new ArrayList<>();
		if (request.getCookies() != null) {
			Stream.of(request.getCookies()).map(this::mapCookie).forEach(cookies::add);
		}

		byte[] body = null;
		try (InputStream in = request.getInputStream()) {
			body = IOUtils.toByteArray(in);
		} catch (Exception e) {
			e.printStackTrace();
		}

		HttpHeaderDictionary headersByName = new HttpHeaderDictionary(headers);
		ContentTypeModel contentTypeModel = new ContentTypeModel(
				headersByName.get("Content-Type") != null ? headersByName.get("Content-Type").getValue() : null);

		List<RequestParameter> formParams = new ArrayList<>();
		if ("application/x-www-form-urlencoded".equalsIgnoreCase(request.getContentType())) {
			try {
				UrlEncoded formData = new UrlEncoded(new String(body, contentTypeModel.detectCharset()));
				formData.forEach((key, values) -> formParams
						.add(new RequestParameter(key, values != null && !values.isEmpty() ? values.get(0) : null,
								values != null ? values : Collections.emptyList())));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return new HttpRequestModel(method, path, queryString, contentTypeModel, headersByName,
				new CookieDictionary(cookies), new RequestParameterDictionary(requestParams), body, headers, cookies,
				requestParams, new RequestParameterDictionary(formParams), formParams);
	}

	private HttpHeader mapHeader(String headerName, HttpServletRequest request) {
		return new HttpHeader(headerName, request.getHeader(headerName),
				Collections.list(request.getHeaders(headerName)));
	}

	private Cookie mapCookie(javax.servlet.http.Cookie cookie) {
		String name = cookie.getName();
		String value = cookie.getValue();
		String domain = cookie.getDomain();
		String path = cookie.getPath();
		String comment = cookie.getComment();
		Long maxAge = Long.valueOf(cookie.getMaxAge());
		Boolean secure = cookie.getSecure();
		Long version = Long.valueOf(cookie.getVersion());

		return new Cookie(name, value, domain, path, comment, maxAge, secure, version);
	}

	private List<MockRule> getRules() {
		long now = System.currentTimeMillis();
		if (now - lastRuleReadtime > (ruleCacheTimeSeconds * 1000)) {
			List<RuleEntity> freshRules = ruleRepo.findAll();
			freshRules.sort(
					Comparator.comparing(rule -> rule.getPriority() != null ? -rule.getPriority().longValue() : 0L));
			List<MockRule> rulesDeserialized = freshRules.stream().map(r -> {
				try {
					MockRule parsedRule = objectMapper.readValue(r.getSerialized(), MockRule.class);
					parsedRule.setId(r.getId());
					return parsedRule;
				} catch (Exception e) {
					System.err.println("Error parsing rule " + r.getId());
					e.printStackTrace();
					return null;
				}
			}).filter(Objects::nonNull).collect(Collectors.toList());

			rules.set(rulesDeserialized);
			lastRuleReadtime = now;
			return rulesDeserialized;
		} else {
			return rules.get();
		}
	}
}
