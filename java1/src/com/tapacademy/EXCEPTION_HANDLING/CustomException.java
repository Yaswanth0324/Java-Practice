package com.tapacademy.EXCEPTION_HANDLING;

import java.util.Scanner;

class InvalidPin extends Exception{
	@Override
	public String getMessage() {
		
		return "Incorrect pin, try Again...";
	}
}
class Atm{
	int accountNo=454545;
	int pinNo=9456;
	int acNo;
	int pin;
	void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter bank account number: ");
		acNo=sc.nextInt();
		System.out.println("Enter pin: ");
		pin=sc.nextInt();
		
	}
	
	void validate() throws Exception{
		if(acNo==accountNo && pin == pinNo) {
			System.out.println("collect your money");
		}else {
			InvalidPin inp = new InvalidPin();
			System.out.println(inp.getMessage());
			throw inp;
		}
	}
}

class Bank1{
	Atm atm = new Atm();
	void intiateAccount()   {
		try {
			atm.acceptInput();
			atm.validate();
		}catch(Exception e) {
			try {
				atm.acceptInput();
				atm.validate();
			}catch(Exception e1) {
				try {
					atm.acceptInput();
					atm.validate();
				}catch(Exception e2) {
					System.out.println("your card blocked ");
				}
			}
		}
	}
	
}
public class CustomException {
	

	public static void main(String[] args) {
		Bank1 b = new Bank1();
		b.intiateAccount();
		
		
	}
}
