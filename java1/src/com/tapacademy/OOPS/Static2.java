package com.tapacademy.OOPS;

class Demo11{
	static void miletokm() {
		System.out.println("mile to kilometer");
	}
	void milage() {
		System.out.println("Milage of the car");
	}
}


public class Static2 {
	static {
		System.out.println("IND");   
	}
	public static void main(String[] args) {
		System.out.println("NZ");
		Demo11 d=new Demo11();
		Demo11.miletokm();
		d.milage();
		
	}
}
