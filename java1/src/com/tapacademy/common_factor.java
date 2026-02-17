package com.tapacademy;

import java.util.Scanner;

public class common_factor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number:");
		int a = sc.nextInt();
		System.out.println("enter second number:");
		int b = sc.nextInt();
		cfactors(a,b);
	}
	public static void cfactors(int a , int b) {
		if(a==0 && b==0) {
			System.out.println("no factors");
			
		}
		if(a==0) {
			factors(b);
			return;
		}
		if(b==0) {
			factors(a);
			return;
			
		}
		a=Math.abs(a);
		b=Math.abs(b);
		for(int i=1;i<=Math.min(a, b);i++) {
			if(a%i==0 && b%i==0) {
				System.out.print(i + " ");
			}
		}
	}
	private static void factors(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i + " ");
			}
		}
		
	}
	
}
