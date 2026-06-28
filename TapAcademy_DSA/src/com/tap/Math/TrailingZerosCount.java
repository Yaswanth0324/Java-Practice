package com.tap.Math;

import java.util.Scanner;


//count of trailing zeros in factorial of number


public class TrailingZerosCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(countOfTrailZeros(n));
	}

	private static int countOfTrailZeros(int n) {
		
		int res = 0;
		int powOf5 = 5;
		
		while(n >= powOf5) {
			res += n/powOf5;
			powOf5 *= 5;
		}
		
		return res;
	}
}
