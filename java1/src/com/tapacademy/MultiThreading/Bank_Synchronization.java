package com.tapacademy.MultiThreading;

class BankAccount{
	private double balance = 5000;
	
	synchronized public void withDraw(int amount) {
	    System.out.println(Thread.currentThread().getName() + " trying to withdraw " + amount);

	    if(balance >= amount) {
	        balance -= amount;
	        System.out.println(amount + " withdrawn successfully");
	        System.out.println("Remaining balance: " + balance);
	    } else {
	        System.out.println("Insufficient balance");
	    }
	}
}

class Atm1 extends Thread{
	BankAccount ba;
	
	public Atm1(BankAccount ba) {
		this.ba=ba;
	}
	
	public void run() {
		ba.withDraw(3000);
	}
}
class Atm2 extends Thread{
	BankAccount ba;
	
	public Atm2(BankAccount ba) {
		this.ba=ba;
	}
	
	public void run() {
		ba.withDraw(3500);
	}
}


public class Bank_Synchronization {
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		
		Atm1 atm1 = new Atm1(account);
		Atm2 atm2 = new Atm2(account);
		
		atm1.setName("ATM-1");
		atm2.setName("ATM-2");
		
		atm1.start();
		atm2.start();
		
	}
}
