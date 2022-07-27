package x.mvmn.permock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class PerpetualMockeryApplication {

	public static void main(String[] args) {
		SpringApplication.run(PerpetualMockeryApplication.class, args);
	}
}
