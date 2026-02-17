package com.tapacademy.ABSTRACTION_INTERFACE;

interface Test{
	int AGE=20;
	void add();
	private void sub() {
		System.out.println("substraction using private keyword");
	}
	static void mul() {
		
		System.out.println("multiplication using static keyword");
	}
	default void div() {
		sub();
		System.out.println("division method using default");
	}
	
}
class Test1 implements Test{

	@Override
	public void add() {
		System.out.println("adding method");
		System.out.println("age: " + AGE);
		
	}
	
	
}
public class interf3 {
	public static void main(String[] args) {
		Test test = new Test1();
		test.add();
		Test.mul();
		test.div();
	}
}
