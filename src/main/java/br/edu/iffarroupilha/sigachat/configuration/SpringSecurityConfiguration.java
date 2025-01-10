package br.edu.iffarroupilha.sigachat.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authorization.AuthorizationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * <p>
 * Classe responsavel por configurar aspectos de segurança associados a API
 * </p>
 * 
 * @author Professor
 * @since Jan 8, 2025 7:27:32 PM
 */
@Configuration
@EnableWebSecurity
public class SpringSecurityConfiguration {
	
	@Autowired
	private SpringUserFilter filtroUsuario; 
	
	@Bean
	public SecurityFilterChain getFilter(HttpSecurity sec) throws Exception {
		return sec.csrf(csrf -> csrf.disable())
				.authorizeHttpRequests(http -> 
				         http
				         .requestMatchers(HttpMethod.POST, "/login/entrar").permitAll()
						.requestMatchers(HttpMethod.POST, "/login/cadastrar").permitAll()
						.anyRequest().authenticated()
				)
				.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
				.addFilterBefore(filtroUsuario, UsernamePasswordAuthenticationFilter.class)
				.build();

	}

	@Bean
	public AuthenticationManager getManager(AuthenticationConfiguration cfg) throws Exception {
		return cfg.getAuthenticationManager();

	}
	@Bean
	public PasswordEncoder getEncouderPadrao() {
		return new BCryptPasswordEncoder();
	}
}
