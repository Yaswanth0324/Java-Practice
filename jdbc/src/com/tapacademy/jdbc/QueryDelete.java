package com.tapacademy.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryDelete {
	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		
		String url="jdbc:mysql://localhost:3306/company";
		String userName="root";
		String pwd="24YashL03@";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver connected Successfully!");
			
			con = DriverManager.getConnection(url, userName, pwd);
			System.out.println("Database connected Successfully!");
			
			String query="DELETE FROM employee WHERE E_FNAME REGEXP '^[j]'";
			
			st=con.createStatement();
			
			System.out.println("Number of rows updated: " + st.executeUpdate(query));
		}catch(ClassNotFoundException e) {
			System.out.println("Driver not connected !");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		try {
			st.close();
			con.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
