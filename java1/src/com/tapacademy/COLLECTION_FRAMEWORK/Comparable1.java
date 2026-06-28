package com.tapacademy.COLLECTION_FRAMEWORK;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{

	private int id;
	private String name;
	private int salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	


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




	public int getSalary() {
		return salary;
	}




	public void setSalary(int salary) {
		this.salary = salary;
	}

	


	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", salary=" + salary ;
	}

//	@Override
//	public int compareTo(Employee thor) {
//		Employee hulk = this;
//		Integer id1 = hulk.getId();
//		Integer id2 = thor.getId();
//		
//		if(id1 > id2) {
//			return 1;
//		}else if(id1 < id2) {
//			return -1;
//		}else {
//			return 0;
//		}
//		
//	}
	
	
	@Override
	public int compareTo(Employee e2) {
		Employee e1 = this;
		String s1 = e1.getName();
		String s2 = e2.getName();
		
		return s1.compareTo(s2);
	}
	
}


public class Comparable1 {
	public static void main(String[] args) {
		Employee e1 = new Employee(1556565,"Hulk",2000);
		Employee e2 = new Employee(2,"Thor",3000);
			
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		
		Collections.sort(al);
		
		System.out.println(al);
		
	}
}
