package com.tapacademy.ARRAYS;

import java.util.Scanner;

public class JaggedArr_3d {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of blocks: ");
		int m = sc.nextInt();
		
		int[][][] a= new int[m][][];
		
		for(int i=0;i<m;i++) {
			System.out.println("Enter the number of rows for block " + i + ": " );
			int n = sc.nextInt();
			a[i] = new int[n][];
		
			for(int j=0;j<n;j++) {
				System.out.println("Enter the number of cols for row " + j + " in block " + i + ": ");
				int o = sc.nextInt();
				a[i][j] = new int[o];
			
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.println("block " + i + " row " + j + " col " + k +": ");
					a[i][j][k] = sc.nextInt();
				}
			}
		}
		
		System.out.println();
		System.out.println();
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.print(a[i][j][k] + " ");
					
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		
		
	}
}
