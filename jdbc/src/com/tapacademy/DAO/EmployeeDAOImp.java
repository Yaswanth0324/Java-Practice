package com.tapacademy.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tapacademy.Connector.ConnectorFactory;
import com.tapacademy.DTO.Employee;

public class EmployeeDAOImp implements EmployeeDAO {

	public List getEmployees() {
		ArrayList<Employee> empList = null;
		
		
		try {
			Connection con = ConnectorFactory.requestConnection();
			
			String query = "select * from employee";
			Statement st = con.createStatement();
			ResultSet res=st.executeQuery(query);
			empList = new ArrayList<Employee>();
			while(res.next()==true) {
				int id = res.getInt(1);
				String name = res.getString(2);
				String design = res.getString(3);
				int sal = res.getInt(4);
				
				Employee e = new Employee(id,name,design,sal);
				
				empList.add(e);
				
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		return empList;
	}

	@Override
	public Employee getId(int id) {
		Employee e1 = null;
		try {
			Connection con = ConnectorFactory.requestConnection();
			String query = "select * from employee where id = ?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, id);
			
			ResultSet res = pst.executeQuery();
			
			res.next();
			
			e1 = new Employee(res.getInt(1) , res.getString(2) , res.getString(3) , res.getInt(4) );
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return e1;
	}

	@Override
	public boolean insertEmployee(int id, String name, String designation, int salary) {
		int i = 0;
		try {
			Connection con = ConnectorFactory.requestConnection();
			String query = "insert into employee(id,name,designation,salary) values (?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setString(3, designation);
			pst.setInt(4, salary);
			
			i =pst.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		if(i==1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateEmployee(Employee e) {
		int i =0;
		try {
			Connection con = ConnectorFactory.requestConnection();
			String query = "update employee set salary = ? where id = ?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, e.getSalary());
			pst.setInt(2, e.getId());
			
			i = pst.executeUpdate();
			
			
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		if(i==1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteEmployee(int id) {
		int i =0;
		try {
			Connection con = ConnectorFactory.requestConnection();
			String query = "delete from employee where id =?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, id);
			i = pst.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		if(i==1) {
			return true;
		}
		return false;
	}

	
	
	
	
	
	

}
