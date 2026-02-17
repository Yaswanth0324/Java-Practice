package com.tapacademy.jdbc;

import java.util.List;
import java.util.Scanner;

import com.tapacademy.DAO.EmployeeDAOImp;
import com.tapacademy.DTO.Employee;

public class DaoDriver {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		EmployeeDAOImp edi = new EmployeeDAOImp();
//		List<Employee> employees = edi.getEmployees();
//		
//		for(Employee e: employees) {
//			System.out.println(e);
//		}
		
		System.out.println("Enter the id: ");
		int id = sc.nextInt();
		Employee e = edi.getId(id);
		System.out.println(e);
		
		System.out.println("Enter the details of new employee");
		System.out.println("Enter the id of new employee: ");
		int eId = sc.nextInt();
		System.out.println("Enter the name of new employee: ");
		String eName = sc.next();
		System.out.println("Enter the designation of new employee: ");
		String eDesign = sc.next();
		System.out.println("Enter the salary of new employee: ");
		int eSal = sc.nextInt();
		
		System.out.println(edi.insertEmployee(eId, eName, eDesign, eSal));
		
		System.out.println("Enter the salary to be update : ");
		int newSal = sc.nextInt();
		e.setSalary(newSal);
		System.out.println(edi.updateEmployee(e));
		
		System.out.println("Enter the id to be delete: ");
		int delId = sc.nextInt();
		System.out.println(edi.deleteEmployee(delId));
		
		
	}
}
