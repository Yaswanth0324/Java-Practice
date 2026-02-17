package com.tapacademy.MultiThreading;


class Atm{
	
	synchronized public void withDraw(int amount) {
		Thread t = Thread.currentThread();
		String name = t.getName();
		
		try {
			System.out.println(name+ " Entered ATM");
			Thread.sleep(3000);
			System.out.println(name+" Withdrawn " + amount);
			Thread.sleep(5000);
			System.out.println(name+" Exited ATM");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}

class Person1 extends Thread{
	Atm atm;
	int amount;
	public Person1(Atm atm , int amount) {
		this.atm=atm;
		this.amount=amount;
	}
	@Override
	public void run() {
		atm.withDraw(amount);
	}
	
}

public class SynchronizationMeth2 {
	public static void main(String[] args) {
		Atm atm = new Atm();
		
		Person1 p1 = new Person1(atm , 5000);
		Person1 p2 = new Person1(atm , 184894);
		Person1 p3 = new Person1(atm , 4848948);

		
		p1.setName("Person1");
		p2.setName("Person2");
		p3.setName("Peson3");
		
		p1.start();
		p2.start();
		p3.start();
		
	}
}
