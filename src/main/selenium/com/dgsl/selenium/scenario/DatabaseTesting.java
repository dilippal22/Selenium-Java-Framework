package com.dgsl.selenium.scenario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseTesting {

	public static void main(String[] args) {

		Connection con = null;
		Statement selectStmt = null;
		ResultSet resultSet = null;

		String dbURL = "jdbc:mysql://172.1.254.135:1433/IPP-Client-Test";
		String username = "dilip.pal";
		String password = "Aug@1234";

		String query = "SELECT TOP 2 * FROM [ipm-core].[IPM_EmailDetails]";

		// Load mysql jdbc driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Unable to load jdbc driver");
		}

		// Creating connection to DB
		try {
			con = DriverManager.getConnection(dbURL, username, password);
		} catch (SQLException e) {
			System.out.println("Unable to create connection to DB");
			e.printStackTrace();

		}

		// Create connection statement
		try {
			selectStmt = con.createStatement();
		} catch (SQLException e) {
			System.out.println("Unable to create connection statement to DB");
			e.printStackTrace();
		}

		// Execute the sql query and store the result in result set
		try {
			resultSet = selectStmt.executeQuery(query);
		} catch (SQLException e) {
			System.out.println("Unable to execute query");
			e.printStackTrace();
		}

		// While Loop to iterate through all data and print results
		try {
			while (resultSet.next()) {
				String myName = resultSet.getString(1);
				String myAge = resultSet.getString(2);
				System.out.println(myName + "  " + myAge);
			}
		} catch (SQLException e) {
			System.out.println("unable to print result");
			e.printStackTrace();
		}

		// closing DB Connection
		try {
			con.close();
		} catch (SQLException e) {
			System.out.println("unable to close db connection");
			e.printStackTrace();
		}
	}
}
