package com.tap.BitManipulation;

import java.util.Scanner;

public class PowerOf2Check {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(checkPowOf2(n));
	}

	public static boolean checkPowOf2(int n) {
		if(n == 0) {
			return false;
		}
		
		return (n & (n-1)) == 0;
	}
// brute force method includes if count of set bits is equal to 1 then it is power of 2 
//	because only power of 2 digits only have 1 set bits

	
}
