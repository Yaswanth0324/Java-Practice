package com.tapacademy.ARRAYS;

import java.util.Scanner;

public class Arr2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number of rows: ");
		int m = sc.nextInt();
		System.out.println("enter number of cols: ");
		int n = sc.nextInt();
		System.out.println("Enter numbers: ");
		int[][] a = new int[m][n];
		for(int i =0;i<m;i++) {
			for(int j =0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println();
		
		for(int i =0;i<m;i++) {
			for(int j =0;j<n;j++) {
				System.out.println("a"+ "[" + i + "]" +"[" + j + "]" + ": " + a[i][j] + " ");
			}
		}
		
	}
}
