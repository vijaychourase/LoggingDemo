package com.log4j.logger.Logger;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 */
@Path("/hello")
@Singleton
public class HelloController {

	private static Logger logger = LogManager.getLogger(HelloController.class);

	@GET
	public String sayHello() {
		logger.info("updates info logger");
		logger.info("info logger!");
		logger.warn("warning logger!");
		logger.error("error logger!");
		logger.debug("debug logger!");
		logger.fatal("fatal logger!");
		logger.trace("trace logger!");
		
		System.out.println("update the class !!!");
		System.out.println("more update the class !!!");
		System.out.println(" again more update the class !!!");
		System.out.println(" again and again more update the class !!!");
		System.out.println(" more sysout added");
		
		System.out.println("Git Demo example");
		System.out.println("Programmer-1 updated");
		System.out.println("programmer-01 update more");
		return "Hello World";
	}
}
