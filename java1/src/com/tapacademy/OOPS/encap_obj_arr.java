package com.tapacademy.OOPS;

import java.util.Scanner;

class Employee1{
	private int id;
	private String name;
	private long salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
}

public class encap_obj_arr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Employees: ");
		int n = sc.nextInt();
		
		Employee1[] arr = new Employee1[n];
		
		for(int i=0;i<n;i++) {
			Employee1 e = new Employee1();
			
			System.out.println("Enter the user "+(i+1)+" details with , seperated : ");
			String details = sc.next();
			String[] a = details.split(",");
			
			e.setId(Integer.parseInt(a[0]));
			e.setName(a[1]);
			e.setSalary(Long.parseLong(a[2]));
			
			arr[i]=e;
			
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i].getId()+ " " + arr[i].getName() + " " + arr[i].getSalary());
		}
	}
}
