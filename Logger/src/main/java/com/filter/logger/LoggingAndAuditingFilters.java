package com.filter.logger;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Servlet Filter implementation class LoggingAndAuditingFilters
 */
public class LoggingAndAuditingFilters implements Filter {

	private static Logger logger = LogManager.getLogger(LoggingAndAuditingFilters.class);
	private FilterConfig filterConfig = null;
	// add more new method
	/**
	 * Default constructor.
	 */
	public LoggingAndAuditingFilters() {
		System.out.println("Constructor called......");
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		logger.info("logger filter stopped");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		String remoteAddress = request.getRemoteAddr();
		String protocol = request.getProtocol();
		chain.doFilter(request, response);
		filterConfig.getServletContext().log("Logging Filter Servlet called");
		filterConfig.getServletContext().log("**************************");
		filterConfig.getServletContext().log("IP addresss" + remoteAddress);
		filterConfig.getServletContext().log("Protocal" + protocol);
		filterConfig.getServletContext().log("Updated logger filter");
		filterConfig.getServletContext().log("more updateds");
		filterConfig.getServletContext().log("more more updateds");

		// new comments line

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
	}

}
