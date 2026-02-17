package com.tapacademy.INHERITENCE;

class const5{
	int a,b;
	
	public const5() {
		a=10;
		b=20;
	}
	const5(int a ,int b){
		this();
		this.a=a;
		this.b=b;
	}
}
class constr6 extends const5{
	int x,y;
	public constr6() {
		super(100,110);
		x=30;
		y=40;
	}
	constr6(int x, int y){
		this();
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

public class constr_chaining3 {
	public static void main(String[] args) {
		constr6 c4 = new constr6(9,99);
		c4.disp();
	}
}
