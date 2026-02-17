package com.tapacademy.ARRAYS;

import java.util.Scanner;

class student{
	int id;
	String name;
	int age;
}
public class Arry_obj {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of students : ");
		int n = sc.nextInt();
		student std[] = new student[n];
		
		for(int i=0;i<n;i++) {
			std[i] = new student();
			System.out.println("Enter the details of student NO: " + (i+1));
			System.out.println("Student ID: ");
			std[i].id=sc.nextInt();
			sc.nextLine();
			System.out.println("Student Name: ");
			std[i].name=sc.nextLine();
			System.out.println("Student Age: ");
			std[i].age=sc.nextInt();			
		}
		
		System.out.println();
		System.out.println();
		for(int i=0;i<n;i++) {
			System.out.println((i+1) + "." + "ID: " +
			std[i].id + "," + " Name: " + std[i].name + "," + " Age: " + std[i].age);
		}
		
		int highest=std[0].age;
		for(int i=1;i<std.length;i++) {
			if(std[i].age > highest) {
				highest = std[i].age;
			}
		}
		System.out.println("highest age is : " + highest);
		
		
	}
}
