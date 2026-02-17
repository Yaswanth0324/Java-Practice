package com.tapacademy.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class QuerySelectAcid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Connection con=null;
		PreparedStatement pst=null;
		
		String url="jdbc:mysql://localhost:3306/university";
		String userName="root";
		String pwd="24YashL03@";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver connected Successfully!");
			
			con = DriverManager.getConnection(url, userName, pwd);
			System.out.println("Database connected Successfully!");
			
			String query="INSERT INTO faculty (faculty_id,name,email) VALUES (?,?,?)";
			
			pst=con.prepareStatement(query);
			System.out.println("Enter number of rows inserted: ");
			int n = sc.nextInt();
			
//			con.setAutoCommit(false);
			
			for(int i=1;i<=n;i++) {
				System.out.println("Enter comma seperated values: ");
				String input = sc.next();
				String[] arr = input.split(",");
				
				pst.setInt(1, Integer.parseInt(arr[0]));
				pst.setString(2, arr[1]);
				pst.setString(3, arr[2]);
				
				pst.addBatch();
				
			}
//			con.commit();
			pst.executeBatch();
			System.out.println("query executed successfully");
			
		}catch(ClassNotFoundException e) {
			System.out.println("Driver not connected !");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		try {
			pst.close();
			con.close();
			sc.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
