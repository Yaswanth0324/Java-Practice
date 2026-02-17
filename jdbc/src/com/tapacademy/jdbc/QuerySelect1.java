package com.tapacademy.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class QuerySelect1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Connection con=null;
		Statement st=null;
		
		String url="jdbc:mysql://localhost:3306/university";
		String userName="root";
		String pwd="24YashL03@";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver connected Successfully!");
			
			con = DriverManager.getConnection(url, userName, pwd);
			System.out.println("Database connected Successfully!");
			
			st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,0);
			
			
			String query1="INSERT INTO course (`course_code`,`course_title`,`credit_value`,`faculty_id`) VALUES(109,'React',4,91)";
			String query2="INSERT INTO course (`course_code`,`course_title`,`credit_value`,`faculty_id`) VALUES(110,'Express',3,92)";
			String query3="INSERT INTO course (`course_code`,`course_title`,`credit_value`,`faculty_id`) VALUES(111,'MongoDb',3,93)";
			st.addBatch(query1);
			st.addBatch(query2);
			st.addBatch(query3);
			
//			int result=st.executeUpdate(query1);
			int[] result=st.executeBatch();
			for(int i=0;i<result.length;i++) {
				if(result[i] ==1) {
					System.out.println("Query " + (i+1) + " Executed Succussfully!");
				}
			}
			
		}catch(ClassNotFoundException e) {
			System.out.println("Driver not connected !");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		try {
			st.close();
			con.close();
			sc.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
