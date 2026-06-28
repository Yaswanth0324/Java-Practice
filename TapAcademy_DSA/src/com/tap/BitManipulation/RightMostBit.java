package com.tap.BitManipulation;

import java.util.Scanner;

public class RightMostBit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//		System.out.println(BFposOfRMB(n));
		System.out.println(optimisedPosOfRMB(n));
	}

	public static int optimisedPosOfRMB(int n) {       //  time complexity : O(1);
		n = n ^ (n & (n-1));
		return (int)(Math.log10(n)/Math.log10(2)) + 1;
	}

	public static int BFposOfRMB(int n) {    //   time complexity : O(log n)
		int pos = 0; 
		int m = 1; 
		
		if(n == 0) {
			return -1;
		}
		
		while((n & m) == 0) {
			m = m << 1;
			pos++;
		}
		
		return pos + 1;
	}
}
