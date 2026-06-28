package com.tap.Math;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(lcm(a,b));
		
	}

	private static int lcm(int a, int b) {

		return a*b/gcd(a,b);
	}

	private static int gcd(int a, int b) {

		while(b!=0) {
			int temp = b;
			b = a%b;
			a = temp;
		}
		return a;
	}
}


//time complexity : O(log(min(a,b)));
//space complexity : O(1);