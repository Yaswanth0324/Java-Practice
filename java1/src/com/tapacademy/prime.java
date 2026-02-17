package com.tapacademy;

import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		System.out.println("enter the starting number : ");
		int n1 = sc.nextInt();
		
//		if(n<=1) {
//			isPrime = false;
//			
//		}
//		for(int i=2;i<=Math.sqrt(n);i++) {
//			if(n%i == 0) {
//				isPrime = false;
//				break;
//			}
//		}
//		if(isPrime) {
//			System.out.println("Enter number is prime");
//		}else {
//			System.out.println("enter number is not prime");
//		}
//		System.out.println("prime numbers upto n:");
//		for(int i = 1;i<=n;i++) {
//			if(isPrime(i)) {
//				
//			}
//		}
		
		System.out.println("prime numbers upto n:");
		for(int i = n1;i<=n;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	private static boolean isPrime(int n) {
		
		if(n<=1) {
			return false;
			
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i == 0) {
				return false;
			}
		}
		
		return true;
	}


}
