package x.mvmn.permock.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		return http.formLogin().and().authorizeRequests().antMatchers("/api/**").authenticated()
				.antMatchers("/index.html").authenticated().antMatchers("/").authenticated().and().csrf().disable()
				.build();
	}
}
