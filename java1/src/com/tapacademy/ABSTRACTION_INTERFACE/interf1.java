package com.tapacademy.ABSTRACTION_INTERFACE;
interface Animal{
	void eat();
	void run();
}
class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("Dog eats veg and non veg ");
		
	}

	@Override
	public void run() {
		System.out.println("Dog can run fastly");
		
	}
	
}
public class interf1 {
	public static void main(String[] args) {
		Animal d = new Dog();
		d.eat();
		d.run();
	}
}
