package com.tapacademy.ABSTRACTION_INTERFACE;

interface Calculator1{
	void add();
}
interface Calculator2{
	void sub();
}
interface Calculator3 extends Calculator1,Calculator2{
	void mul();
}
class Calculator implements Calculator3{

	@Override
	public void add() {
		System.out.println("Adding method");
		
	}

	@Override
	public void sub() {
		System.out.println("subtaction method");
		
	}

	@Override
	public void mul() {
		System.out.println("multiplication method");
		
	}
	void div() {
		System.out.println("division method");
	}
	
}

public class interf2 {
	public static void main(String[] args) {
		
		Calculator3 calc = new Calculator();
		calc.add();
		calc.sub();
		calc.mul();
		((Calculator)calc).div();
	}
}
