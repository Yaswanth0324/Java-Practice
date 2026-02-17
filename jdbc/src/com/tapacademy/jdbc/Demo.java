package com.tapacademy.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
	public static void main(String[] args) {
		
		Connection con=null;
		Statement st=null;
		ResultSet res=null;
		String url = "jdbc:mysql://localhost:3306/myntra";
		String userName="root";
		String pwd="24YashL03@";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class loaded successfully!");
			
			con=DriverManager.getConnection(url, userName, pwd);
			System.out.println("Database Connected Successfully!");
			
			st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,0);
			
			String query = "SELECT * FROM user";
			res = st.executeQuery(query);
			System.out.println("Query executed!");
//			System.out.println(res);
			
			
			ResultSetMetaData metadata = res.getMetaData();
			int colCount = metadata.getColumnCount();
			for(int i=1;i<=colCount;i++) {
				System.out.println(metadata.getColumnName(i)+" " + metadata.getColumnTypeName(i));
				
			}
			System.out.println();
			while(res.next()==true) {
				System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getString(4)+" "+res.getString(5)+" "+res.getString(6));
			}
//			while(res.next()==true) {
//				System.out.println(res.getInt("user_id")+" "+ res.getString("firstname"));
//			}
			System.out.println();
			res.absolute(7);
			System.out.println(res.getInt("user_id")+" "+ res.getString("firstname"));
			
			}catch(ClassNotFoundException e) {
			System.out.println("driver not loaded!");
		}catch(SQLException e) {
			System.out.println(e);
		}
		
		try {
			con.close();
			st.close();
			res.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
