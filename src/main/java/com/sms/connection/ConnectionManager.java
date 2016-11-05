package com.sms.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.sms.util.JdbcUtil;

/**
 * 
 * @author 339994 26/7/2003
 */
public final class ConnectionManager {
    public static final Logger LOG = Logger.getLogger(ConnectionManager.class);
    private static Connection connection;

    private ConnectionManager() {

    }

    /**
     * This method will be used to establish connection with database
     * 
     * @return connection
     */
    public static Connection getConnection() {
	LOG.info("Called to give connection");

	final String driver = JdbcUtil.getProperty("driver");
	final String url = JdbcUtil.getProperty("url");
	final String user = JdbcUtil.getProperty("user");
	final String password = JdbcUtil.getProperty("password");

	try {
	    Class.forName(driver);
	    connection = DriverManager.getConnection(url, user, password);
	    // System.out.println(connection);
	} catch (SQLException e) {
	    LOG.error("fail to give connection");
	} catch (ClassNotFoundException e) {
	    LOG.error("fail to find the class");
	}
	return connection;
    }

    /**
     * This method is used to close the connection variable
     */
    public static void close() {
	try {
	    connection.close();
	} catch (SQLException e) {
	    // TODO Auto-generated catch block
	    LOG.error("fail to close the Connection");
	}
    }

}
