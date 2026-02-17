package com.tapacademy.pg.Arrays;

import java.util.Scanner;

class Day3{
	void productOfArray(int[] arr){
		int product = 1;
		for(int i=0;i<arr.length;i++) {
			product =  product * arr[i];
		}

		int res[] = new int[arr.length];
		for(int i=0 ; i< arr.length ; i++) {
			res[i] = product / arr[i];
		}

		for(int i=0 ; i< res.length ; i++) {
			System.out.print(res[i] + " ");
		}

	}

	void secondLargest(int[] arr) {
		int max = arr[0]; // Integer.MIN_VALUE
		int secMax=0 ;   // Integer.MIN_VALUE

		for(int i=1;i<arr.length;i++) {
			if(arr[i] > max) {
				secMax = max;
				max = arr[i];
			}else if(arr[i] > secMax && arr[i] != max) {
				secMax = arr[i];
			}
		}
		System.out.println(secMax);
	}

	void maxPairsSum(int[] arr) {
		int max = arr[0]; // Integer.MIN_VALUE
		int secMax=0 ;   // Integer.MIN_VALUE

		for(int i=1;i<arr.length;i++) {
			if(arr[i] > max) {
				secMax = max;
				max = arr[i];
			}else if(arr[i] > secMax ) {
				secMax = arr[i];
			}
		}
		System.out.println(max + secMax);
	}

	void maxPairsProduct(int[] arr) {
		int max = arr[0]; // Integer.MIN_VALUE
		int secMax=0 ;   // Integer.MIN_VALUE

		for(int i=1;i<arr.length;i++) {
			if(arr[i] > max) {
				secMax = max;
				max = arr[i];
			}else if(arr[i] > secMax ) {
				secMax = arr[i];
			}
		}
		System.out.println(max * secMax);
	}

	void secondMin(int[] arr) {
		int min = Integer.MAX_VALUE , secondMin = Integer.MAX_VALUE;

		for(int i=0;i<arr.length;i++) {
			if(arr[i] <min) {
				secondMin = min;
				min = arr[i];
			}else if(arr[i] < secondMin && arr[i] != min){
				secondMin = arr[i];
			}
		}

		System.out.println(secondMin);
	}

	void minPairsSum(int[] arr) {
		int min = Integer.MAX_VALUE , secondMin = Integer.MAX_VALUE;

		for(int i=0;i<arr.length;i++) {
			if(arr[i] <min) {
				secondMin = min;
				min = arr[i];
			}else if(arr[i] < secondMin){
				secondMin = arr[i];
			}
		}

		System.out.println( min + secondMin);
	}
	
	void minPairsProduct(int[] arr) {
		int min = Integer.MAX_VALUE , secondMin = Integer.MAX_VALUE;

		for(int i=0;i<arr.length;i++) {
			if(arr[i] <min) {
				secondMin = min;
				min = arr[i];
			}else if(arr[i] < secondMin){
				secondMin = arr[i];
			}
		}

		System.out.println( min * secondMin);
	}

}
public class Array3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the n: ");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}


		Day3 d3 = new Day3();

		//		d3.productOfArray(arr);
		d3.secondLargest(arr);

		d3.maxPairsSum(arr);
		d3.maxPairsProduct(arr);
		d3.secondMin(arr);
		d3.minPairsSum(arr);
		d3.minPairsProduct(arr);
	}
}
