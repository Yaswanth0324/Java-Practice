package com.tap.BitManipulation;

public class BitwiseOperators {
	public static void main(String[] args) {
		
		System.out.println(5 | 9);
		System.out.println(5 & 9);
		System.out.println(5 ^ 9);
		System.out.println(5 << 1);    // 5 * 2 ^ 1    (a * 2 ^ value)
		System.out.println(5 << 2);    // 5 * 2 ^ 2
		System.out.println(5 << 3);	   // 5 * 2 ^ 3
		 
		System.out.println(5 >> 1);    // a / 2 ^ value
		System.out.println(5 >> 2);
		System.out.println(5 >> 3);
		
		System.out.println(-5 >> 1);
		System.out.println(-5 >> 2);
		
		System.out.println(5 >>> 1);
		System.out.println(5 >>> 2);
		System.out.println(5 >>> 3);
		
		System.out.println(-5 >>> 1);
		System.out.println(-5 >>> 2);
		
		System.out.println(~2);
		System.out.println(~ -2);
	}

}
