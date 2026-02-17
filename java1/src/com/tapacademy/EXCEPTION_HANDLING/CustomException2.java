package com.tapacademy.EXCEPTION_HANDLING;

import java.util.Scanner;

class UnderAgeException extends Exception{
	@Override
	public String getMessage() {
		
		return "You are too young , Have patience!";
	}
}
class OverAgeException extends Exception{
	@Override
	public String getMessage() {
		
		return "You are too old, Calm down!";
	}
}

class User{
	int age;
	Scanner sc = new Scanner(System.in);
	public void acceptInput() {
		System.out.println("Enter your age: ");
		age = sc.nextInt();
	}
	public void validateAge() throws UnderAgeException,OverAgeException {
		if(age>=18 && age<=60) {
			System.out.println("your eligible , please fill your application form");
		}else if(age<18) {
			UnderAgeException uae = new UnderAgeException();
			throw uae;
		}else {
			OverAgeException oae = new OverAgeException();
			throw oae;
		}
	}
}
class RtiApplication{
	User user = new User();
	public void userVerify() {
		try {
			user.acceptInput();
			user.validateAge();
		}catch(UnderAgeException e) {
			System.out.println(e.getMessage());
		}catch(OverAgeException e) {
			System.out.println(e.getMessage());
		}
	}
}

public class CustomException2 {
	public static void main(String[] args) {
		RtiApplication rti = new RtiApplication();
		rti.userVerify();
	}
}
