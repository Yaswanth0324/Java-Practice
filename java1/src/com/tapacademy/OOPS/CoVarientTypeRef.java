package com.tapacademy.OOPS;

class Animal{
	
}
class Child extends Animal{
	
}
class Demo1{
	Animal disp() {
		System.out.println("parent ref");
		Animal animal = new Animal();
		return animal;
	}
}
class Demo2 extends Demo1{
	@Override
	Child disp() {
		System.out.println("child ref");
		Child child = new Child();
		return child;
		
	}
}

public class CoVarientTypeRef {
	public static void main(String[] args) {
		Demo2 demo2 = new Demo2();
		demo2.disp();
	}
}
