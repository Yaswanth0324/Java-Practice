package com.tapacademy.INHERITENCE;

class const1{
	int a,b;
	
	public const1() {
		a=10;
		b=20;
	}
	public const1(int a ,int b){
		this.a=a;
		this.b=b;
	}
}
class constr2 extends const1{
	int x,y;
	public constr2() {
		x=30;
		y=40;
	}
	constr2(int x, int y){
		super(300,400);	
		this.x=x;
		this.y=y;
	}
	void disp() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
}


public class constr_chaining1 {
	public static void main(String[] args) {
		constr2 c2 = new constr2(100,200);
		c2.disp();
	}
}
