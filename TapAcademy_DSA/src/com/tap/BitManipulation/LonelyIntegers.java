package com.tap.BitManipulation;

import java.util.HashSet;
import java.util.Scanner;

public class LonelyIntegers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(findLonelyInt(arr));
		System.out.println(lonelyIntUsingSet(arr));
	}
	
	public static int lonelyIntUsingSet(int[] arr) {
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i : arr) {
			if(hs.contains(i)) {
				hs.remove(i);
			}else {
				hs.add(i);
			}
		}
		
		for(int i : hs) {
			return i;
		}
		
		return -1;
	}

	public static int findLonelyInt(int[] arr) {
		int lonelyInt = 0;
		for(int i : arr) {
			lonelyInt = lonelyInt ^ i;
		}
		
		return lonelyInt;
	}
}
