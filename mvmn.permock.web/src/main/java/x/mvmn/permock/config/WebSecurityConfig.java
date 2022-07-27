package x.mvmn.permock.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

	@Value("${auth.enable:true}")
	private boolean authEnabled = true;

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		if (authEnabled) {
			return http.formLogin().and().authorizeRequests().antMatchers("/api/**").authenticated()
					.antMatchers("/index.html").authenticated().antMatchers("/").authenticated().and().csrf().disable()
					.build();
		} else {
			return http.authorizeRequests().anyRequest().permitAll().and().csrf().disable().build();
		}
	}
}
