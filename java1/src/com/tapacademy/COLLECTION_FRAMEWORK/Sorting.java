package com.tapacademy.COLLECTION_FRAMEWORK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Student implements Comparable<Student>{
	private int id ;
	private String name;
	private int age;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", age=" + age ;
	}
	
	@Override
	public int compareTo(Student s2) {
		return Integer.compare(this.getAge(), s2.getAge());
	}
	
}

public class Sorting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Student[] st = new Student[n];
		for(int i=0;i<st.length;i++) {
			System.out.println("Enter the Details of Student " + i+1);
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			int age = sc.nextInt();
			
			st[i] = new Student(id,name,age);
		}
		
		ArrayList<Student> al = new ArrayList<Student>(n);
		for(int i=0;i<n;i++) {
			al.add(st[i]);
		}
		
		
		Collections.sort(al);
		
		for(Object obj : al) {
			System.out.println(obj);
		}
	}
}
