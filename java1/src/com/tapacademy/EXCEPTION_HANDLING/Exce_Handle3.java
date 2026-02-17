package com.tapacademy.EXCEPTION_HANDLING;

import java.util.Scanner;

class Demo3{
	void method1() throws Exception{
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of array: ");
			int size = sc.nextInt();
			int[] arr = new int[size];
		}catch(Exception e) {
			throw e;
		}
		
	}
	
	
}
public class Exce_Handle3 {
	public static void main(String[] args) {
		Demo3 d = new Demo3();
		try {
			d.method1();
		} catch (Exception e) {
			System.out.println("arrays doesn't have negative size , so enter correct size");
		}
	}
}
