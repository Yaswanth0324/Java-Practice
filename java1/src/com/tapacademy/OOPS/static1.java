package com.tapacademy.OOPS;


class Demo{
	static int a,b;
	static {
		a=10; //intialization of static variables inside static block is good practice
		b=20;
		System.out.println("this is static block");
	}
	static void getStat() {
		System.out.println("This is static method");
	}
	int x,y;
	{
		System.out.println("This is instance block");   //instance block and constructor will run when object is created without ref
	}   
	public Demo() {
		System.out.println("This is constructor");
	}
	void getInst() {
		System.out.println("This is Instance method");
	}
}
public class static1 {
	public static void main(String[] args) {
		Demo.getStat();
		Demo d=new Demo();
//		d.getStat();
//		d.getInst();
	}
}
