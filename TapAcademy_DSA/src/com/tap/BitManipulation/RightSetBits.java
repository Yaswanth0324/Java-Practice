package com.tap.BitManipulation;

import java.util.Scanner;

public class RightSetBits{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(bruteForce(n));
		System.out.println(brianKernighanOptimised(n));
	}

	public static int brianKernighanOptimised(int n) {
		int count = 0;
		while(n > 0) {
			n = n & (n-1);
			count++;
		}
		
		return count;
	}

	public static int bruteForce(int n) {
		String binaryN = decimalTobinary(n);
		int count = 0;
		for(int i=binaryN.length()-1;i>=0;i--) {
			if(binaryN.charAt(i) == '1') {
				count++;
			}
		}
		
		return count;
	}
	

	public static String decimalTobinary(int n) {
		String b = "";
		while(n >= 1) {
			int rem = n % 2;
			n = n/2;
			b = rem + b;
		}
		return b;
	}
}