package com.tapacademy.pg.Arrays;

import java.util.Scanner;

class Day7{

	public void merge3Array(int[] ar1, int[] ar2, int[] ar3, int[] arr) {
		int i = 0 , k=0 ;
		
		while(k<arr.length) {
			if(i<ar1.length) {
				arr[k] = ar1[i];
				k++;
			}
			if(i<ar2.length) {
				arr[k] = ar2[i];
				k++;
			}
			if(i<ar3.length) {
				
				arr[k] = ar3[i];
				k++;
			}
			i++;
		}
		
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		
	}

	public void print3Pairs(int[] ar1) {
		for(int i=0;i<ar1.length-2;i++) {
			for(int j=i+1;j<=i+1;j++) {
				for(int k=j+1;k<=j+1;k++) {
					System.out.println(ar1[i] + " " + ar1[j] + " " + ar1[k]);
				}
			}
		}
		
	}
	
	public void print3Pairs2(int[] ar1) {
		for(int i=0;i<ar1.length-2;i++) {
			System.out.println(ar1[i] + " " + ar1[i+1] + " " + ar1[i+2]);
		}
		
	}
	
	public void print3Pairs1(int[] ar1, int k) {     //efficient way for any number k
		for(int i=0;i<=ar1.length-k;i++) {
			for(int j=i;j<i+k;j++) {
				System.out.print(ar1[j] + " ");
			}
			System.out.println();
		}
		
	}
	
	
	
}

public class Merge3Arrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		
		int[] ar1 =  new int[l];
		for(int i=0;i<ar1.length;i++) {
			ar1[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
//		int m = sc.nextInt();
//		
//		int[] ar2 =  new int[m];
//		for(int i=0;i<ar2.length;i++) {
//			ar2[i] = sc.nextInt();
//		}
//		
//		int n = sc.nextInt();
//		int[] ar3 =  new int[n];
//		for(int i=0;i<ar3.length;i++) {
//			ar3[i] = sc.nextInt();
//		}
//		
//		int[] mergedArr = new int[l+m+n];
		
		
		Day7 d7 = new Day7();
		
//		d7.merge3Array(ar1,ar2,ar3,mergedArr);
//		d7.print3Pairs2(ar1);
		d7.print3Pairs1(ar1, k);
	}
}
