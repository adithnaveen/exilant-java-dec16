package com.exilant;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBTest {
	public static void main(String[] args) {

		Connection connection = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@10.2.0.28:1521:orcl", "Orclexi01",
					"Orclexi01");

			System.out.println("done ");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println();
	}
}
