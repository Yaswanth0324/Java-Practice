package com.tapacademy.Connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//utility class , always use static members
public class ConnectorFactory {

	static Connection con = null;
	
	static String url = "jdbc:mysql://localhost:3306/jdbc";
	static String userName = "root";
	static String pwd = "24YashL03@";
	public static Connection requestConnection() throws  ClassNotFoundException , SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url, userName, pwd);
		return con;
	}
	
	
}
