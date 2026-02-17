package com.tapacademy.OOPS;

class Demo44{
	static void first() {
		System.out.println("first static method");
	}
}
class Demo45 extends Demo44{
//	@Override
//	static void first() {
//		System.out.println("second static method");
//	}
}


public class StaticMethOver {
	public static void main(String[] args) {
		Demo45.first();
		Integer a=10;
		Integer b =10;
		System.out.println(a.equals(b));
		
	
	}
}
