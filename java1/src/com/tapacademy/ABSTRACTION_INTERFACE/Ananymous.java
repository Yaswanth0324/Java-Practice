package com.tapacademy.ABSTRACTION_INTERFACE;

@FunctionalInterface
interface Beta{
	void disp();
}

public class Ananymous {
	public static void main(String[] args) {
		class Alpha implements Beta{

			@Override
			public void disp() {
				System.out.println("anaymous inner class");
			}
			
		}
		
		Alpha alpha = new Alpha();
		alpha.disp();
	}
}
