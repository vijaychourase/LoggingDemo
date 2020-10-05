package com.log4j.logger.Logger;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 */
@ApplicationPath("/data")
public class LoggerRestApplication extends Application {

	private static Logger logger = LogManager.getLogger(LoggerRestApplication.class);
	

}
