package x.mvmn.permock.controller;

import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.xtext.web.servlet.XtextServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/xtext-service")
public class XtextEditorController {

	@Autowired
	private XtextServlet xtextServlet;

	@Autowired
	private ServletContext servletContext;

	@PostConstruct
	public void init() throws ServletException {
		xtextServlet.init(new ServletConfig() {

			@Override
			public String getServletName() {
				return "xtext";
			}

			@Override
			public ServletContext getServletContext() {
				return servletContext;
			}

			@Override
			public Enumeration<String> getInitParameterNames() {
				return Collections.emptyEnumeration();
			}

			@Override
			public String getInitParameter(String name) {
				return null;
			}
		});
	}

	@RequestMapping("*")
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		xtextServlet.service(req, resp);
	}

	@PreDestroy
	public void destroy() {
		xtextServlet.destroy();
	}
}
