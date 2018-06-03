package com.sopra.referentielcollab.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	private static final String[] AUTH_WHITELIST = { "/swagger-resources/**", "/swagger-ui.html", "/v2/api-docs",
			"/webjars/**" };

	private static Logger logger = LoggerFactory.getLogger(WebSecurityConfig.class);

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		logger.debug("Configure HttpSecurity");
		http.csrf().disable().cors().and().authorizeRequests().antMatchers(AUTH_WHITELIST).permitAll()
				.antMatchers("/**/*").authenticated().and().httpBasic().authenticationEntryPoint(getBasicAEP());
	}

	private AuthenticationEntryPoint getBasicAEP() {
		return new RefCollabAuthenticationEntryPoint();
	}

	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		logger.debug("Configure AuthenticationManagerBuilder");
		auth.ldapAuthentication().userSearchBase("OU=FR,OU=users,OU=Sopragroup,OU=UsersEmea")
				.userSearchFilter("(sAMAccountName={0})").contextSource()
				.url("ldap://ptx.ldap-ad.dmsi.corp.sopra:3268/DC=emea,DC=msad,DC=sopra")
				.managerDn("smpmsvc@emea.msad.sopra") // Utilisation d'un compte
														// technique du stage
														// autodmep
				.managerPassword("SuiviMMA!");
	}

	@Bean
	CorsConfigurationSource corsConfigurationSource() {
		logger.debug("Configure CorsConfigurationSource");
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", new CorsConfiguration().applyPermitDefaultValues());
		return source;
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**");
			}
		};
	}
}