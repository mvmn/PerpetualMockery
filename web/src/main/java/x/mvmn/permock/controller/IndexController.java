package x.mvmn.permock.controller;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

	@RequestMapping(value = "/", produces = "text/html")
	public @ResponseBody byte[] stdRedirect() throws IOException {
		return IOUtils.toByteArray(this.getClass().getResourceAsStream("/static/index.html"));
	}
}
