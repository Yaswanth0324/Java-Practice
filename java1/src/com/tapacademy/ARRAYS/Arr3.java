package com.tapacademy.ARRAYS;

import java.util.Scanner;

public class Arr3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of blocks: ");
		int m = sc.nextInt();
		System.out.println("Enter the number of rows in each block: ");
		int n = sc.nextInt();
		System.out.println("Enter the number of cols in each row: ");
		int o = sc.nextInt();
		
		int[][][] a = new int[m][n][o];
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				for(int k=0;k<o;k++) {
					System.out.println("block " + i + " row " + j + " col " + k + " : ");
					a[i][j][k] = sc.nextInt();
				}
			}
		}
		
		System.out.println();
		System.out.println(); 
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				for(int k=0;k<o;k++) {
					System.out.print(a[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
