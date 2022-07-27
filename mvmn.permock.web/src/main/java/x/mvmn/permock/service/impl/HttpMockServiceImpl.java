package x.mvmn.permock.service.impl;

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

import org.apache.commons.io.IOUtils;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

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
		HttpRequestModel requestModel = mapToRequestModel(request);
		MockRule matchingRule = findMatchingRule(requestModel);
		if (matchingRule != null) {
			sendResponse(matchingRule.getResponseConfig(), request, response);
		} else {
			response.setStatus(404);
		}
		baseRequest.setHandled(true);
	}

	private void sendResponse(MockResponseConfig responseConfig, HttpServletRequest request,
			HttpServletResponse response) {
		if (responseConfig.isProxy()) {
			proxyService.proxyRequest(responseConfig.getProxyUrl(), request, response);
		} else {
			response.setStatus(
					responseConfig.getResponseStatus() != null ? responseConfig.getResponseStatus().intValue() : 200);
			if (responseConfig.getResponseHeaders() != null && !responseConfig.getResponseHeaders().isEmpty()) {
				responseConfig.getResponseHeaders()
						.forEach(header -> response.setHeader(header.getName(), header.getValue()));
			}
			if (responseConfig.getResposeBody() != null) {
				try (OutputStream os = response.getOutputStream()) {
					os.write(responseConfig.getResposeBody().getBytes(StandardCharsets.UTF_8));
				} catch (Exception e) {
					e.printStackTrace();
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
		request.getParameterMap().entrySet().stream()
				.map(param -> new RequestParameter(param.getKey(), request.getParameter(param.getKey()),
						param.getValue() != null ? Arrays.asList(param.getValue()) : Collections.emptyList()))
				.forEach(requestParams::add);

		List<HttpHeader> headers = new ArrayList<>();
		Collections.list(request.getHeaderNames()).stream().map(headerName -> this.mapHeader(headerName, request))
				.forEach(headers::add);

		List<Cookie> cookies = new ArrayList<>();
		Stream.of(request.getCookies()).map(this::mapCookie).forEach(cookies::add);

		byte[] body = null;
		try (InputStream in = request.getInputStream()) {
			body = IOUtils.toByteArray(in);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new HttpRequestModel(method, path, queryString, new HttpHeaderDictionary(headers),
				new CookieDictionary(cookies), new RequestParameterDictionary(requestParams), body, headers, cookies,
				requestParams);
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