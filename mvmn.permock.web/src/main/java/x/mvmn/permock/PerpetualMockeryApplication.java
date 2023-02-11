package x.mvmn.permock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class PerpetualMockeryApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(PerpetualMockeryApplication.class, args);
	}
}
