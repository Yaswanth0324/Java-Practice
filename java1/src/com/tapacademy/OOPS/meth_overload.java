package com.tapacademy.OOPS;

public class meth_overload {
	public static void main(String[] args) {
		calculator calc = new calculator();
		int a =14,b=25,c=20;
		float x=13.45f , y=45.44f, z=10.00f;
		System.out.println(calc.add(a, b));
		System.out.println(calc.add(b,a));
		System.out.println(calc.add(x, b));
		System.out.println(calc.add(x, y));
		System.out.println(calc.add(a, b , c));
		System.out.println(calc.add(a, b , x));
		System.out.println(calc.add(a, x , y));
		System.out.println(calc.add(x,y,z));
		
	}
}
class calculator{
	
	public int add(int a , int b) {
		return a+b;
	}
	public float add(float x , int b) {
		return x+b;
	}
	public float add(float x , float y) {
		return x+y;
	}
	public int add(int a , int b , int c) {
		return a+b+c;
	}
	public float add(int a , int b , float x) {
		return a+b+x;
	}
	public float add(int a , float x , float y) {
		return a+x+y;
	}
	public float add(float x , float y , float z) {
		return x+y+z;
	}
}
