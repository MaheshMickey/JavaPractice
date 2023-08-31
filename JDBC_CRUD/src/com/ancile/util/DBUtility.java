package com.ancile.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtility {

	public static String username="root";
	public static String password="root";
	public static String url="jdbc:mysql://localhost:3306/anciletraining";
	public static Connection con = null;
	
	public static Connection getDBConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url,username,password);
		return con;
		
	}
	
	public void getDBClosed() throws SQLException {
		con.close();
	}
	
	
}
