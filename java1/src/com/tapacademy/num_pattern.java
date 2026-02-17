package com.tapacademy;

import java.util.Scanner;

public class num_pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int n = sc.nextInt();
		int m=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				
				if(m<10) {
					System.out.print( "0"+m + " ");
				}
				m++;
			}
			System.out.println();
		}
	}
}
