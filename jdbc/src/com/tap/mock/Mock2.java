package com.tap.mock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Mock2 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		String url = "jdbc:mysql://localhost:3306/mock";
		String userName = "root";
		String pwd = "24YashL03@";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url , userName ,pwd);
			
			System.out.println("Enter operation: \n adding \n updating");
			
			String userInput = sc.nextLine();
			
			if(userInput.equals("adding")) {
				addUser(connection , sc);
			}else {
				updateUser(connection , sc);
			}
			
			
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static void addUser(Connection connection, Scanner sc) {

		String checkQuery = "select * from user where email=?";
		String insertQuery = "insert into user(id,name,email,password) values(?,?,?,?)";

		try {
			
			System.out.println("Enter your details  by comma seperated : ");
			String input = sc.nextLine();
			String s[] = input.split(",");
			
			PreparedStatement checkStatement = connection.prepareStatement(checkQuery);
			checkStatement.setString(1,s[2] );

			ResultSet resultSet = checkStatement.executeQuery();

			
			if (resultSet.next()) {

				System.out.println("Email already exists");
				System.out.println("Going to update operation...");

				updateUser(connection, sc);

			} 
			
			else {

				PreparedStatement insertStatement = connection.prepareStatement(insertQuery);

				insertStatement.setInt(1, Integer.parseInt(s[0]));
				insertStatement.setString(2, s[1]);
				insertStatement.setString(3, s[2]);
				insertStatement.setString(4, s[3]);

				int rows = insertStatement.executeUpdate();

				System.out.println(rows + " added successfully");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void updateUser(Connection connection, Scanner sc) {
		
		String updateQuery = "update user set password = ? where email = ?";
		
		try {
			PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
			System.out.println("Enter your email and password by comma seperated : ");
			String input = sc.nextLine();
			String s [] = input.split(",");
			
			updateStatement.setString(1 , s[1]);
			updateStatement.setString(2 , s[0]);
			
			int rows = updateStatement.executeUpdate();
			
			System.out.println(rows + " updated successfully");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
