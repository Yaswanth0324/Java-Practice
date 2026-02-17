package com.tapacademy.ARRAYS;

import java.util.Scanner;

public class JaggedArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int m = sc.nextInt();
		
		int[][] a = new int[m][];
		
		for (int i = 0; i < m; i++) {
            System.out.print("Enter number of columns for row " + i + ": ");
            int n = sc.nextInt();
            a[i] = new int[n];
        }
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println("row " + i + " col " + j + ": ");
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println();
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j] + " ");
				
			}
			System.out.println();
		}
		
		
	}

}
