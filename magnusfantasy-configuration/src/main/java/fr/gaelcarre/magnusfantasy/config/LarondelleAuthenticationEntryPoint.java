package fr.gaelcarre.magnusfantasy.config;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component
public class LarondelleAuthenticationEntryPoint extends BasicAuthenticationEntryPoint {

	private static Logger logger = org.slf4j.LoggerFactory.getLogger(LarondelleAuthenticationEntryPoint.class);

	@Override
	public void commence(final HttpServletRequest request, final HttpServletResponse response,
			final AuthenticationException authException) throws IOException, ServletException {
		// Authentication failed, send error response.
		response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);

		PrintWriter writer = response.getWriter();
		logger.info(authException.getMessage());
		writer.println("HTTP Status 401 : " + authException.getMessage());
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		setRealmName("REFCOLLAB");
		super.afterPropertiesSet();
	}
}
