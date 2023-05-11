package com.app.bank.BankAppJava;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnection {

	static Connection con;

	public static Connection getConnection() {

		Properties prop = new Properties();

		try {

			FileReader reader = new FileReader("/BankAppJava/DatabaseDetails.properties");
			prop.load(reader);

			Class.forName(prop.getProperty("mysqlJDBCDriver"));
			con = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("user"),
					prop.getProperty("pass"));

		} catch (Exception e) {
			System.out.println("Connection Failed!");
		}

		return con;

	}

}
