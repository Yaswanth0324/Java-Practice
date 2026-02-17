package com.tapacademy.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BlobDataType {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		Connection con = null;
		PreparedStatement pst = null;

		String url = "jdbc:mysql://localhost:3306/jdbc";
		String userName = "root";
		String pwd = "24YashL03@";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver connected successfully");

			con = DriverManager.getConnection(url, userName, pwd);
			System.out.println("Database connected successfully");

//			String query = "insert into picture (id , image) values (? , ? )";
//			pst = con.prepareStatement(query);
//			int id = sc.nextInt();
//			File file = new File("C:\\Users\\yamun\\OneDrive\\Pictures\\NLP-LOGO.png");
//
//			if (!file.exists()) {
//				System.out.println("File not found!");
//				return;
//			}
//
//			FileInputStream fis = new FileInputStream(file);
//
//			pst.setInt(1, id);
//			pst.setBinaryStream(2, fis, file.length());
//
//
//			int res = pst.executeUpdate();
//			if (res > 0) {
//                System.out.println("Image inserted successfully!");
//            } else {
//                System.out.println("Insert failed!");
//            }
//			
//			fis.close();
			
//			String query1 = "select * from picture"; 
//			Statement st = con.createStatement();
//			ResultSet res = st.executeQuery(query1);
//			
//			res.next();
//			
//			System.out.println(res.getInt(1) + " " + res.getBlob(2));
			
			

		}catch(ClassNotFoundException e) {
			System.out.println("Driver not connected try again");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
