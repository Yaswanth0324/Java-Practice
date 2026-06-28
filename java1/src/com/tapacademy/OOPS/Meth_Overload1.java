package com.tapacademy.OOPS;

public class Meth_Overload1 {
	public static void main(String[] args) {
		Meth_Overload1 m = new Meth_Overload1();
		m.add();
		m.add(5);
		m.add(10, 5);
		
	}
	
	private void add() {
		System.out.println(10);
	}
	private void add(int a) {
		System.out.println(a);
	}
	private void add(int a , int b) {
		System.out.println(a+b);
	}
}
