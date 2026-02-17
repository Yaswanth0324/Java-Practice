package com.tapacademy.OOPS;

class Demo1{
	static void miletokm() {
		System.out.println("mile to kilometer");
	}
	void milage() {
		System.out.println("Milage of the car");
	}
}


public class static2 {
	static {
		System.out.println("IND");   
	}
	public static void main(String[] args) {
		System.out.println("NZ");
		Demo1 d=new Demo1();
		Demo1.miletokm();
		d.milage();
		
	}
}
