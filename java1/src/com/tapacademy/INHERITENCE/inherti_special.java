package com.tapacademy.INHERITENCE;

class parent21{
	static {
		System.out.println("inside static block of parent");
	}
	{
		System.out.println("inside instance block of parent");
	}
	parent21(){
		System.out.println("inside parent constr......");
	}
	static void disp(){
		System.out.println("static method");
	}
	void display() {
		System.out.println("hii");
	}
}
class child21 extends parent21{
	static {
		System.out.println("inside static block of child");
	}
	{
		System.out.println("inside instance block of child");
	}
	child21(){
		System.out.println("inside child constr......");
	}
	
	static void disp(){
		System.out.println("inherited static method");
	}
	@Override
	void display() {
		super.display();
		System.out.println("hlo");
	}
	
	
}
public class inherti_special {
	public static void main(String[] args) {
		child21 c = new child21();
		child21.disp();
		child21.disp();
		c.display();
		System.out.println(c);
		System.out.println(c.toString());
	}
}
