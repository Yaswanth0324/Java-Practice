package com.tapacademy.pg.Arrays;

import java.util.Scanner;

class Day8{

	public void sumOfSubArray(int[] arr, int k) {
		
		for (int i = 0; i <= arr.length - k; i++) {
			int sum = 0;
			for (int j = i; j < i+k; j++) {
				sum = sum+ arr[j];
			}
			System.out.println(sum);
			
		}
		
	}

	public int sumOfSubArrayCheck7(int[] arr, int k, int a) {
		int count=0;
		for(int i=0;i<=arr.length-k;i++) {
			int sum=0;
			for (int j = i; j < i+k; j++) {
				sum = sum + arr[j];
			}
			
			if(sum==a) {
				count++;
			}
		}
		
		return count;
	}

	public void printSubArrSumEqToK(int[] arr, int k, int a) {
		for(int i=0;i<=arr.length-k;i++) {
			int sum=0;
			for(int j=i;j<i+k ; j++) {
				sum += arr[j];
			}
			
			if(sum == a) {
				for(int j=i;j<i+k;j++) {
					System.out.print(arr[j] + " ");
				}
				System.out.println();
			}
			
			
		}
		
	}
	
	public void printPairs(int[] ar1, int k) {     //efficient way for any number k
		for(int i=0;i<=ar1.length-k;i++) {
			for(int j=i;j<i+k;j++) {
				System.out.print(ar1[j] + " ");
			}
			System.out.println();
		}
		
	}
	public void printSubArr(int[] arr) {
		for(int i=1;i<=arr.length;i++) {
			printPairs(arr,i);
		}
	}
	public void printSubArr2(int[] arr) {
		for(int i=1;i<=arr.length;i++) {     // i is size here
			for(int j=0;j<=arr.length-i;j++) {
				for(int k=j;k<j+i;k++) {
					System.out.print(arr[k] + " ");
				}
				System.out.println();
			}
		}
	}
	
	public void printSubArrSum(int[] arr) {
		for(int i=1;i<=arr.length;i++) {     // i is size here
			for(int j=0;j<=arr.length-i;j++) {
				int sum=0;
				for(int k=j;k<j+i;k++) {
					sum += arr[k];
				}
				System.out.println(sum);
			}
		}
	}

	public int printCountOfSumOfSubArrEqualToK(int[] arr, int a) {
		int count=0;
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<=arr.length-i;j++) {
				int sum=0;
				for(int k=j;k<j+i;k++) {
					sum += arr[k];
				}
				if(sum==a) {
					count++;
				}
			}
		}
		
		return count;
		
	}

	public void printArrPairOfSumOfSubArrEqualToK(int[] arr, int a) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j <=arr.length-i; j++) {
				int sum=0;
				for (int k = j; k < j+i; k++) {
					sum += arr[k];
				}
				if(sum==a) {
					for (int k = j; k < i+j; k++) {
						System.out.print(arr[k] + " ");
					}
					System.out.println();
				}
				
			}
		}
	}

	public void printRevArrPairOfSumOfSubArrEqualToK(int[] arr, int a) {
		for (int i = arr.length; i >= 1; i--) {
			for (int j = 0; j <=arr.length-i; j++) {
				int sum=0;
				for (int k = j; k < j+i; k++) {
					sum += arr[k];
				}
				if(sum==a) {
					for (int k = j; k < j+i; k++) {
						System.out.print(arr[k] + " ");
					}
					System.out.println();
					
				}
				
			}
		}
		
	}
	public void printMaxLengthArrPairOfSumOfSubArrEqualToK(int[] arr, int a) {
		for (int i = arr.length; i >= 1; i--) {
			for (int j = 0; j <=arr.length-i; j++) {
				int sum=0;
				for (int k = j; k < j+i; k++) {
					sum += arr[k];
				}
				if(sum==a) {
					for (int k = j; k < j+i; k++) {
						System.out.print(arr[k] + " ");
					}
					System.out.println();
					return;
				}
				
			}
		}
		
	}
	
	
	
	
	
	
	
}


public class SubArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		Day8 d8 = new Day8();
		
//		d8.sumOfSubArray(arr , a);
//		System.out.println(d8.sumOfSubArrayCheck7(arr, a , b));
		d8.printSubArrSumEqToK(arr , a , b);
//		d8.printSubArr(arr);
//		d8.printSubArr2(arr);
//		d8.printSubArrSum(arr);
//		System.out.println(d8.printCountOfSumOfSubArrEqualToK(arr , b));
//		d8.printArrPairOfSumOfSubArrEqualToK(arr , b);
//		d8.printRevArrPairOfSumOfSubArrEqualToK(arr , b);
//		d8.printMaxLengthArrPairOfSumOfSubArrEqualToK(arr , b);
	}
}
