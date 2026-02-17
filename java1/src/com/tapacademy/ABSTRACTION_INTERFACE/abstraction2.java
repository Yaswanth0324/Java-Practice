package com.tapacademy.ABSTRACTION_INTERFACE;

import java.util.Scanner;

abstract class Shape{
	double area;
	abstract void acceptInput();
	abstract void calcArea();
	
	void dispArea() {
		System.out.println("area: " + area);
	}
}
class Square extends Shape{

	int side;
	@Override
	void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side: ");
		side = sc.nextInt();

	}

	@Override
	void calcArea() {
		area= side * side;

	}
	@Override
	void dispArea() {
		System.out.println("Area of Square: "+area);
	}
}
class Rectangle extends Shape{
	int length;
	int breadth;
	@Override
	void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length: ");
		length=sc.nextInt();
		System.out.println("Enter the Breadth: ");
		breadth = sc.nextInt();
	}

	@Override
	void calcArea() {
		area = length * breadth;

	}
	@Override
	void dispArea(){
		System.out.println("Area of Rectangle : "+area);
	}

}
class Circle extends Shape{
	int radius;
	@Override
	void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		radius=sc.nextInt();

	}

	@Override
	void calcArea() {
		area = Math.PI * radius * radius;

	}
	@Override
	void dispArea() {
		System.out.println(String.format("Area of Circle: %.3f" , area));
	}

}
class Factory{
	public static Shape getShape(String choice) {
		if(choice.equalsIgnoreCase("Square")) {
			return new Square();
		}else if(choice.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}else if(choice.equalsIgnoreCase("Circle")) {
			return new Circle();
		}
		return null;

	}
}
public class abstraction2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the shpae: \nSquare\nRectangle\nCircle");
		String choice = sc.next();
		
		Shape shape = Factory.getShape(choice);
		
		shape.acceptInput();
		shape.calcArea();
		shape.dispArea();



	}
}
