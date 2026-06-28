package com.tap.Math;

import java.util.Scanner;

public class Divisors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//		bruteDivisors(n);
		optimizedDivisors(n);
	}

	private static void optimizedDivisors(int n) {
		
		int i=0;
		for(i=1;i*i<=n;i++) {
			if(n%i==0) {
				
				System.out.println(i);
			}
		}
		i--;
		for(;i>=1;i--) {
			if(n%i==0) {
				if(i*i != n) {
					System.out.println(n/i);
				}
			}
		}
	}

	private static void bruteDivisors(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}
}
