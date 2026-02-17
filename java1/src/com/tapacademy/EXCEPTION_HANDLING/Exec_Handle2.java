package com.tapacademy.EXCEPTION_HANDLING;

import java.util.Scanner;

class Test{
	void alpha() throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String name = sc.next();
		System.out.println(Integer.parseInt(name));
	}
}
public class Exec_Handle2 {
	public static void main(String[] args) {
		Test t = new Test();
		try {
			t.alpha();
		}catch(Exception e) {
			System.out.println("Exception handled in main");
		}
	}
}
