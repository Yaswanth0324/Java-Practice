package com.tapacademy.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
public class QuerySelect2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Connection con = null;
		PreparedStatement pst = null;
		
		String url = "jdbc:mysql://localhost:3306/university";
		String userName = "root";
		String pwd = "24YashL03@";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver connected Successfully!");
			
			con = DriverManager.getConnection(url , userName ,pwd);
			System.out.println("Database connected successfully!");
			String query = "INSERT INTO faculty (`faculty_id`,`name`,`email`) values(?,?,?)";
			pst = con.prepareStatement(query);
			
			String s;
			do {
				System.out.println("Enter comma seperated input: ");
				String input = sc.next();
				String[] arr = input.split(",");
				
				pst.setInt(1,Integer.parseInt(arr[0]));
				pst.setString(2, arr[1]);
				pst.setString(3, arr[2]);
				pst.addBatch();
				
				s = sc.next();
			}while(s.equalsIgnoreCase("Yes"));
			
			int[] result = pst.executeBatch();
			
			for(int i=0;i<result.length;i++) {
				if(result[i] ==1) {
					System.out.println("Query " + (i+1) + " Executed Succussfully!");
				}
			}
			
			System.out.println("query executed!");
		}catch(ClassNotFoundException e) {
			System.out.println("Driver not connected!");
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
