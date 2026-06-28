package com.tap.mock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Mock {
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
			String query = "insert into user (`id`,`name`,`email` , `password`) values(?,?,?,?)";
			preparedStatement = connection.prepareStatement(query);
			
			String s = sc.nextLine();
			
			String[] values = s.split(",");
			
			preparedStatement.setInt(1, Integer.parseInt(values[0]));
			preparedStatement.setString(2 , values[1]);
			preparedStatement.setString(3 , values[2]);
			preparedStatement.setString(4 , values[3]);
			
			int i = preparedStatement.executeUpdate();
			
			System.out.println(i);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
