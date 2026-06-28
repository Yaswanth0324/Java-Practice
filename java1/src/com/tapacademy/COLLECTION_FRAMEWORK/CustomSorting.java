package com.tapacademy.COLLECTION_FRAMEWORK;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class SortById implements Comparator<Employeee>{
	@Override
	public int compare(Employeee e1, Employeee e2) {
		return Integer.compare(e1.getId(), e2.getId());
	}
}

class SortByName implements Comparator<Employeee>{
	
	@Override
	public int compare(Employeee e1, Employeee e2) {
		return (e1.getName()).compareTo(e2.getName());
	}
}

class SortBySalary implements Comparator<Employeee>{
	@Override
	public int compare(Employeee e1, Employeee e2) {
		return Integer.compare(e1.getSalary(), e2.getSalary());
	}
}


class Employeee{
	private int id;
	private String name;
	private int salary;
	
	public Employeee() {
		// TODO Auto-generated constructor stub
	}

	public Employeee(int id, String name, int salary) {
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
		return "id=" + id + ", name=" + name + ", salary=" + salary;
	}
	
	
}

public class CustomSorting {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Employeee[] emp = new Employeee[n];
		for(int i=0;i<emp.length;i++) {
			System.out.println("Enter the Details of Employee " + i+1);
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			int salary = sc.nextInt();
			
			emp[i] = new Employeee(id,name,salary);
		}
		
		SortById si = new SortById();
		
		TreeSet<Employeee> tm1 = new TreeSet<Employeee>(si);
		for(int i=0;i<emp.length;i++) {
			tm1.add(emp[i]);
		}
		System.out.println();
		System.out.println();
		
		System.out.println("SortByID: ");
		
		for(Object obj : tm1) {
			System.out.println(obj);
		}
		
		SortByName sn = new SortByName();
		
		TreeSet<Employeee> tm2 = new TreeSet<Employeee>(sn);
		for(int i=0;i<emp.length;i++) {
			tm2.add(emp[i]);
		}
		
		System.out.println("SortByNAME: ");
		for(Object obj : tm2) {
			System.out.println(obj);
		}
		
		SortBySalary ss = new SortBySalary();
		
		TreeSet<Employeee> tm3 = new TreeSet<Employeee>(ss);
		for(int i=0;i<emp.length;i++) {
			tm3.add(emp[i]);
		}
		
		System.out.println("SortBySALARY: ");
		for(Object obj : tm3) {
			System.out.println(obj);
		}
		
		
		
		
		
		
	}
}
