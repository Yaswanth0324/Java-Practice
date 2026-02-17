package com.tapacademy.pg.loops;

class Swap1{
	void calcSwap1() {
		int a = 15;
		int b = 30;
		int t=a;
		a=b;
		b=t;
		System.out.println("a: " + a+ "   b: " + b);
	}
	void calcSwap2() {
		int a = 15;
		int b = 25;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a: " + a+ "   b: " + b);
	}
}


public class Swap {
	public static void main(String[] args) {
		Swap1 s= new Swap1();
		s.calcSwap1();
		s.calcSwap2();
	}
}
