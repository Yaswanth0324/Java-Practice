package com.tap.BitManipulation;

import java.util.Iterator;
import java.util.Scanner;

public class D2B2D {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String b = deciamlToBinary(n);
		int d = binaryToDecimal(b);
		System.out.println(b);
		System.out.println(d);
		
		
		
	}
	
	public static String deciamlToBinary(int n) {
		String b = "";
		
		while(n >= 1) {
			int rem = n % 2;
			n = n/2;
			b = rem + b ;
		}
		return b;
	}
	
	public static int binaryToDecimal(String b) {
		int d = 0;
		int powerOf2 = 1;
		
		for (int i = b.length()-1; i >= 0; i--) {
			if(b.charAt(i) == '1') {
				d += powerOf2;
			}
			
			powerOf2 *= 2;
		}
		
		
		return d;
	}

}
