package com.tapacademy.ABSTRACTION_INTERFACE;
@FunctionalInterface
interface Demo{
	void add();
}
final class Demo33 implements Demo{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}
	
}
public class interf4 {
	public static void main(String[] args) {
		
		 Demo d = new  Demo(){          //ananymous inner class
			
			 public void add() {
				System.out.println("add");
				
			}
			
		};
		Demo d1 = () -> { System.out.println("ADD");};  //lambda expression
		d.add();
		d1.add();
	}
}
