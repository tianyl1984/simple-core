package com.tianyl.core.mvc.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.tianyl.core.orm.JdbcUtil;
import com.tianyl.core.util.log.LogManager;

public class ServerStartupListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ServletContext sc = sce.getServletContext();
		// set logger name
		String loggerName = sc.getInitParameter("loggerName");
		LogManager.LOGGER_NAME = loggerName;

		// set jdbc
		String url = sc.getInitParameter("jdbcUrl");
		String username = sc.getInitParameter("jdbcUsername");
		String password = sc.getInitParameter("jdbcPassword");
		JdbcUtil.init(url, username, password);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {

	}

}
