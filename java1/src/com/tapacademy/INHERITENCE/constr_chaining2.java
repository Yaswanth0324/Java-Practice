package com.tapacademy.INHERITENCE;

class const3{
	int a,b;
	
	public const3() {
		a=10;
		b=20;
	}
	const3(int a ,int b){
		this.a=a;
		this.b=b;
	}
}
class constr4 extends const3{
	int x,y;
	public constr4() {
		this(50,60);
		x=30;
		y=40;
	}
	constr4(int x, int y){
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

public class constr_chaining2 {
	public static void main(String[] args) {
		constr4 c4 = new constr4();
		c4.disp();
	}
}
