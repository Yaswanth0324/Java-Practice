package com.tap.BitManipulation;

import java.util.Scanner;

public class MaskOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = sc.nextInt();
		
		onTheBit(n,i);
		offTheBit(n,i);
		toggleBit(n,i);
		checkBit(n,i);
	}
	public static void onTheBit(int n , int i) {
		int onMask = 1 << i;
		System.out.println(n | onMask);
	}
	private static void offTheBit(int n, int i) {
		int offMask = ~(1 << i);
		System.out.println(n & offMask);
	}
	private static void toggleBit(int n, int i) {
		int toggleMask  = 1 << i;
		System.out.println(n ^ toggleMask);
	}
	private static void checkBit(int n, int i) {
		int mask = 1 << i;
		if((n & mask) == 0) {
			System.out.println("OFF");
		}else {
			System.out.println("ON");
		}
	}

}
