package com.tap.Math;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(bruteForceGCD(a,b));
		System.out.println(euclidGCD(a,b));
		System.out.println(lameEuclidGCD(a,b));   //Garbiel Lame
		System.out.println(lameEuclidGCD2(a,b));   //Garbiel Lame
		
		
	
	}

	private static int lameEuclidGCD2(int a, int b) {
		
		while(b!=0) {
			int temp =b;
			b = a%b;
			a=temp;
		}
		return a;
	
	}

	private static int lameEuclidGCD(int a, int b) {

		while(a != 0 && b != 0) {
			if(a>b) {
				a = a%b;
			}else if(a<b){
				b = b%a;
			}else {
				return a;
			}
		}
		
		if(a != 0) {
			return a;
		}else {
			return b;
		}
	}

	private static int euclidGCD(int a, int b) {

		while(a != b) {
			if(a<b) {
				b = b-a;
			}else {
				a =a-b;
			}
		}
		
		return a;
	
	}

	private static int bruteForceGCD(int a, int b) {
		
		int min = Math.min(a, b);
		
		for(int i=min;i>=1;i--) {
			if(a%i==0 && b%i==0) {
				return i;
			}
		}
		
		return 1;
		
	}
}

//time complexity : O(log(min(a,b)));
//space complexity : O(1);