package com.tapacademy.OOPS;

import java.util.Scanner;

class Employee{
	private int Eid;
	private String name;
	private int salary;
	
	public Employee() {
		
	}
	public Employee(int Eid,String name,int salary) {
		this.Eid=Eid;
		this.name=name;
		this.salary=salary;
	}
	public void setEid(int Eid) {
		this.Eid = Eid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getEid() {
		return Eid;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	
	
}

public class constr1 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of Employees: ");
		int n = sc.nextInt();
		
		Employee[] emp = new Employee[n];
	
		
		for(int i=0;i<n;i++) {
			emp[i]=new Employee();
			System.out.println("Enter the user details of " + (i+1) + " employee with comma seperated: ");
			String details = sc.next();
			
			String[] a = details.split(",");
			
			emp[i].setEid(Integer.parseInt(a[0]));
			emp[i].setName(a[1]);
			emp[i].setSalary(Integer.parseInt(a[2]));
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(emp[i].getEid()+ " " + emp[i].getName() + " " + emp[i].getSalary());
		}
		
	}
}
