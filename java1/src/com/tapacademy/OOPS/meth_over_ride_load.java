package com.tapacademy.OOPS;


class parent{
	void disp() {
		System.out.println("hi everyone");
	}
}
class child extends parent{
	@Override
	void disp() {         //method overriding
		super.disp();
		System.out.println("hello everyone");
	}
	void disp(int a) {         //method overloading
		System.out.println(a);
	}
	void disp(int a , int b) {
		System.out.println(a+b);
	}
}
public class meth_over_ride_load {
	public static void main(String[] args) {
		child c = new child();
		c.disp();
		c.disp(5);
		c.disp(1,56);
		
	}
}
