package com.exilant.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * 
 * @author trainee
 * @see This package will have only one class which has all static methods which
 *      will return the called DB Connection object and all declaration of
 *      connection types will go here
 */
public class GetConnection {
	// all connectio related variables should go here
	static Connection connection;
	public PreparedStatement ps = null, ps1 = null;
	public ResultSet rs = null;

	public static Connection getOracleConn() {
		// here we will have connection object

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			connection = DriverManager.getConnection("jdbc:oracle:thin:@10.2.0.28:1521:orcl",
					"Orclexi01", "Orclexi01");

			return connection;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public static Connection getMysqlConn() {

		return null;
	}
}





















