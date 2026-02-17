package com.tapacademy.pg.Arrays;

import java.util.Scanner;

class Day4{

	int productOfMaxPairsEdgeCase(int[] arr){
		int max = Integer.MIN_VALUE; // Integer.MIN_VALUE
		int secMax=Integer.MIN_VALUE ;   // Integer.MIN_VALUE

		for(int i=1;i<arr.length;i++) {
			if(arr[i] > max) {
				secMax = max;
				max = arr[i];
			}else if(arr[i] > secMax ) {
				secMax = arr[i];
			}
		}
		int p1 = max * secMax;

		int min = Integer.MAX_VALUE , secondMin = Integer.MAX_VALUE;

		for(int i=0;i<arr.length;i++) {
			if(arr[i] <min) {
				secondMin = min;
				min = arr[i];
			}else if(arr[i] < secondMin){
				secondMin = arr[i];
			}
		}
		int p2 = min * secondMin ;
		return p1>p2 ? p1:p2;
	}

	int productOfMinPairsEdgeCase(int[] arr){
		int max = Integer.MIN_VALUE; // Integer.MIN_VALUE
		int secMax=Integer.MIN_VALUE ;   // Integer.MIN_VALUE

		for(int i=1;i<arr.length;i++) {
			if(arr[i] > max) {
				secMax = max;
				max = arr[i];
			}else if(arr[i] > secMax ) {
				secMax = arr[i];
			}
		}
		int p1 = max * secMax;

		int min = Integer.MAX_VALUE , secondMin = Integer.MAX_VALUE;

		for(int i=0;i<arr.length;i++) {
			if(arr[i] <min) {
				secondMin = min;
				min = arr[i];
			}else if(arr[i] < secondMin){
				secondMin = arr[i];
			}
		}
		int p2 = min * secondMin ;

		int p3= max * min ;
		if(p1<p2 && p1<p3) {
			return p1;
		}else if(p2<p1 && p2<p3) {
			return p2;
		}else {
			return p3;
		}


	}
     
	void printPairs(int[] arr){
		for(int i=0;i<arr.length-1 ; i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				System.out.println(arr[i] + " " + arr[j]);
			}
			
		}
	}
	
	void printPairsSum(int[] arr , int k) {
		for(int i=0;i<arr.length-1 ; i++) {
			for(int j=i+1;j<arr.length;j++) {
			    if(arr[i] + arr[j] == k) {
			    	System.out.println(arr[i] + " " + arr[j]);
			    }
			}
			
		}
	}
	
	void printPairsDifferenece(int[] arr , int k) {
		for(int i=0;i<arr.length-1 ; i++) {
			for(int j=i+1;j<arr.length;j++) {
			    if(arr[i] - arr[j] == k || arr[j] - arr[i] == k) {
			    	System.out.println(arr[i] + " " + arr[j]);
			    }
			}
			
		}
	}
	void printPairsFIrstNumOdd(int[] arr) {
		for(int i=0;i<arr.length-1 ; i++) {
			for(int j=i+1;j<arr.length;j++) {
			    if(arr[i] % 2 != 0 ) {
			    	System.out.println(arr[i] + " " + arr[j]);
			    }
			}
			
		}
	}
	void printPairsBothNumOdd(int[] arr) {
		for(int i=0;i<arr.length-1 ; i++) {
			for(int j=i+1;j<arr.length;j++) {
			    if(arr[i] % 2 != 0 && arr[j] %2 != 0 ) {
			    	System.out.println(arr[i] + " " + arr[j]);
			    }
			}
			
		}
	}
	


}

public class AeeayPairs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
//		System.out.println("Enter the element: ");
//		int k = sc.nextInt();
		Day4 d4 = new Day4();

//		System.out.println(d4.productOfMaxPairsEdgeCase(arr));
//		System.out.println(d4.productOfMinPairsEdgeCase(arr));
		
//		d4.printPairs(arr);
//		d4.printPairsSum(arr , k);
//		d4.printPairsDifferenece(arr, k);
//		d4.printPairsFIrstNumOdd(arr);
		d4.printPairsBothNumOdd(arr);
	}
}
