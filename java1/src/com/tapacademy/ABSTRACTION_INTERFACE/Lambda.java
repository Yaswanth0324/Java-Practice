package com.tapacademy.ABSTRACTION_INTERFACE;
@FunctionalInterface
interface Demo11{
	void show();
}


public class Lambda implements Runnable {
	public static void main(String[] args) {
		
		Runnable r = ()->{
			System.out.println("hello lambda expression");
		};
		
		Thread t = new Thread(r);
		t.start();
		
		Demo11 d = ()->{
			System.out.println("show functionality of interface");
		};
		
		d.show();
	}

	
}
