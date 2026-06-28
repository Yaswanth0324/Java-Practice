package com.tapacademy.pg.Arrays;

import java.util.Scanner;

class Day9{

	public int missingNum(int[] arr) {
//		int max = Integer.MIN_VALUE;
		int n = arr.length+1;
		int actualSum=0;
		for(int i=0;i<arr.length;i++ ) {
			actualSum=actualSum+arr[i];
//			if(arr[i] > max) {
//				max= arr[i];
//			}
			
		}
		
		int expectedSum = (n * (n+1))/2;
		
		return expectedSum-actualSum;
	}

	public void reArrangeArrayToNegFirst(int[] arr) {
		int[] res = new int[arr.length];
		
		int k=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == -1) {
				res[k] = arr[i];
				k++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != -1) {
				res[k] = arr[i];
				k++;
			}
		}
		
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
		
	}

	public void reArrangeArray(int[] arr) {
		int i=arr.length-1,j=arr.length-1;
		while(i>=0) {
			if(arr[i]== -1) {
				i--;
			}else {
				arr[j] = arr[i];
				i--;
				j--;
			}
		}
		while(j>=0) {
			arr[j] = -1;
			j--;
		}
	}

	public void reArrangeArray2(int[] arr) {
		int i=0,j=0;
		while(i<arr.length) {
			if(arr[i] == 0) {
				i++;
			}else {
				arr[j] = arr[i];
				j++;
				i++;
			}
		}
		
		while(j<arr.length) {
			arr[j]=0;
			j++;
		}
		
	}
	
}

public class ReArrangeArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		 Day9 d9 = new Day9();
		 
//		 System.out.println(d9.missingNum(arr));
////		 d9.reArrangeArrayToNegFirst(arr);
//		 d9.reArrangeArray(arr);
		 d9.reArrangeArray2(arr);
		 
		 for (int i = 0; i < arr.length; i++) {
			 System.out.print(arr[i] + " ");
		 }
	}
}
