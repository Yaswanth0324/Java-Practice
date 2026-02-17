package com.tapacademy.ARRAYS;

import java.util.Scanner;

public class Arr1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a= new int[5];
		System.out.println("Enter numbers: ");
		for(int i=0;i<5;i++) {
			a[i]= sc.nextInt();
		}
		
		System.out.println();
		System.out.println();
		
		for(int i=0;i<a.length;i++) {
			System.out.println("a" + i + ": " + a[i]);
		}
	}
}
