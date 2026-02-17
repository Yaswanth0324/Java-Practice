package com.tapacademy.EXCEPTION_HANDLING;

import java.util.Scanner;

class Demo{
	void one() throws Exception{
		System.out.println("connection started4");


		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number: ");
			int a = sc.nextInt();
			System.out.println(a);
			sc.close();
			int b = sc.nextInt();
			System.out.println(b);
		}catch(Exception e) {
			System.out.println("Eception handled in method one");
			throw e;
		}

		System.out.println("connction ended4");
	}
}

class Demo1 {
	void two() throws Exception{
		System.out.println("connection started3");

		Demo d = new Demo();
		d.one();


		System.out.println("connction ended3");
	}
}
class Demo2{
	void three() {
		System.out.println("connection started2");

		try {
			Demo1 d1 = new Demo1();
			d1.two();
		}catch(Exception e) {
			System.out.println(e);
		}

		System.out.println("connction ended2");
	}
}
public class Exce_Handle1 {
	public static void main(String[] args) {
		System.out.println("connection started1");

		Demo2 d2 = new Demo2();
		d2.three();


		System.out.println("connction ended1");


	}
}
