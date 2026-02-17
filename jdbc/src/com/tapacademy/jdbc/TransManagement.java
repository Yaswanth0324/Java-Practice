package com.tapacademy.jdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.Scanner;
import java.sql.Connection;


public class TransManagement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String url="jdbc:mysql://localhost:3306/jdbc";
		String user_name = "root";
		String pwd = "24YashL03@";
		Connection con = null;
		PreparedStatement pst1 = null;
		PreparedStatement pst2 = null;
		PreparedStatement pst3 = null;
		PreparedStatement pst4 = null;
		PreparedStatement pst5 = null;
		ResultSet res1 = null;
		ResultSet res2 = null;
		ResultSet res3 = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver connected successfully!");

			con = DriverManager.getConnection(url, user_name, pwd);
			System.out.println("database connected successfully!");
			System.out.println("jdbc database started ");
			System.out.println("Enter account number: ");
			int anum = sc.nextInt();
			System.out.println("ENter pin number: ");
			int pin = sc.nextInt();

			String query1 = "SELECT * from account where acc_num = ? and pin = ?";
			pst1 = con.prepareStatement(query1);
			pst1.setInt(1, anum);
			pst1.setInt(2, pin);
			res1 = pst1.executeQuery();
			res1.next();
			String name = res1.getString(2);
			float bal = res1.getFloat(4);
			System.out.println("Welcome "+ name);
			System.out.println("Your Balance is : " + bal);

			System.out.println("<--------Transfer Started------->");

			System.out.println("Enter the reciever account number: ");
			int racc_num = sc.nextInt();
			System.out.println("Enter transfer amount : ");
			int t_amount = sc.nextInt();
			
			con.setAutoCommit(false);
			
			Savepoint s = con.setSavepoint();
			
			
			String query2 = "UPDATE account SET Balance = Balance - ?" +" where acc_num = ?";
			pst2 = con.prepareStatement(query2);
			pst2.setFloat(1,t_amount);
			pst2.setInt(2, anum);
			pst2.executeUpdate();

			System.out.println("Incoming Credit Request.......");
			System.out.println(name  + " account  no : " + anum + " wants to send " + t_amount + " to your account no: " + racc_num);
			System.out.println("Enter Y to accept");
			System.out.println("Enter N to reject");
			String choice = sc.next();

			if(choice.equalsIgnoreCase("Y")) {

				String query3 = "UPDATE account SET Balance = Balance + ?" + " where acc_num = ?";
				pst3 = con.prepareStatement(query3);
				pst3.setFloat(1, t_amount);
				pst3.setInt(2, racc_num);
				pst3.executeUpdate();
				
				String query4 = "SELECT * FROM account WHERE acc_num = ?";
				pst4 = con.prepareStatement(query4);
				pst4.setInt(1, racc_num);
				res2 = pst4.executeQuery();
				res2.next();
				System.out.println("updated balance is : " + res2.getFloat(4));
			}else {
				
				con.rollback(s);
				
				String query5 = "SELECT * FROM account WHERE acc_num = ?";
				pst5 = con.prepareStatement(query5);
				pst5.setInt(1, racc_num);
				res3 = pst5.executeQuery();
				res3.next();
				System.out.println("Your balance is : " + res3.getFloat(4));
			}
			con.commit();


		}catch(ClassNotFoundException e) {
			System.out.println("driver not connected");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		try {

		    if(res3 != null) res3.close();
		    if(res2 != null) res2.close();
		    if(res1 != null) res1.close();
		    
		    if(pst5 != null) pst5.close();
		    if(pst4 != null) pst4.close();
		    if(pst3 != null) pst3.close();
		    if(pst2 != null) pst2.close();
		    if(pst1 != null) pst1.close();
		    
		    if(con != null) con.close();

		    sc.close();

		} catch(Exception e) {
		    e.printStackTrace();
		}

	}
}
