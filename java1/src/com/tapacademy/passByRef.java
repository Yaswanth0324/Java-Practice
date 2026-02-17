package com.tapacademy;

class Dog{
	int age;
	String breed;
	String color;
}
public class passByRef {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.age=2;
		d1.breed="husky";
		d1.color="white";
		Dog d2;
		d2 = d1;
		System.out.println(d2.age);
		System.out.println(d2.breed);
		System.out.println(d2.color);
		
		Dog d3;
		d3 = d2;
		d3.age=4;
		d3.breed="pitbull";
		d3.color="black";
		Dog d4;
		d4= d3;
		
		System.out.println(d4.age);
		System.out.println(d4.breed);
		System.out.println(d4.color);
		

	}
	public static int add(int a , int b) {
		return a+b;
		
	}
	

}
