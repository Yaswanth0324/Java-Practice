package com.tapacademy.OOPS;

import java.util.Scanner;

class Businessman{
	float pAmount;
	float time;
	static float rate;
	float si;
	
	static {
		rate=1.27f;
	}
	void takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principle Amount: ");
		pAmount=sc.nextFloat();
		System.out.println("Enter the Principle Time in years: ");
		time=sc.nextFloat();
		
	}
	void calcInterest() {
		si=(pAmount*rate*time)/100;
	}
	void Display() {
		System.out.println(si);
	}
}

public class static3_var {
	public static void main(String[] args) {
	Businessman	b1 = new Businessman();
	b1.takeInput();
	b1.calcInterest();
	b1.Display();
	Businessman	b2 = new Businessman();
	b2.takeInput();
	b2.calcInterest();
	b2.Display();
	Businessman	b3 = new Businessman();
	b3.takeInput();
	b3.calcInterest();
	b3.Display();
	}
}
