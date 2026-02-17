package com.tapacademy.ABSTRACTION_INTERFACE;

abstract class Bird{
	abstract void eat();
	abstract void fly();
}
abstract class Eagle extends Bird{
	@Override
	void fly() {
		System.out.println("Eagles fly in sky");
	}
}
class SerpantEagle extends Eagle{

	@Override
	void eat() {
		System.out.println("serpant Eagle eats serpant");
		
	}
	
}
class GoldenEagle extends Eagle{

	@Override
	void eat() {
		System.out.println("Golden Eagle eats small chickens");
		
	}
	
}
public class abstraction1 {
	public static void main(String[] args) {
		Bird b;
		Eagle e;
		SerpantEagle se = new SerpantEagle();
		b=e=se;
		b.eat();
		e.fly();
		
		GoldenEagle ge = new GoldenEagle();
		b=e=ge;
		e.eat();
		b.fly();
		
	}
}
