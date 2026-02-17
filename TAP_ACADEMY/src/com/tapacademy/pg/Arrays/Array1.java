package com.tapacademy.pg.Arrays;

import java.util.Scanner;

class Day1{
	Scanner sc = new Scanner(System.in);
	
	public void evenIndex(int n ) {
		int[] arr = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.print(arr[i] + " ");
			}
		}
	}
	
	public void oddIndex(int n ) {
		int[] arr = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=1;i<arr.length;i=i+2) {
			
				System.out.print(arr[i] + " ");
			
		}
	}
	
	public int sumArray(int n ) {
		int[] arr = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int sum=0; 
		for(int i=0;i<arr.length;i++) {
			
			sum = sum+arr[i];
		}
		
		return sum;
	}
	
	public long productArray(int n ) {
		int[] arr = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		long product=1; 
		for(int i=0;i<arr.length;i++) {
			
			product = product * arr[i];
		}
		
		return product;
	}
	public int largeElem(int n ) {
		int[] arr = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int max=arr[0]; 
		for(int i=1;i<arr.length;i++) {
			if(arr[i] > max) {
				max=arr[i];
			}
		}
		
		return max;
	}
	
	public void minMaxElem(int n ) {
		int[] arr = new int[n];
		
		
		if(n<2) {
			System.out.println("give atleast two numbers");
		}
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		int min=sum - arr[0], max = sum - arr[0];
		for(int i=1;i<arr.length;i++) {
			if(sum-arr[i] > max) {
				max = sum-arr[i];
			}else if(sum-arr[i] < min) {
				min = sum - arr[i];
			}
		}
		
		System.out.println("min sum: " + min + "  " + " max sum: " + max);
		
		
	}
	
	
}

public class Array1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		
		Day1 d1 = new Day1();
//		d1.evenIndex(n);
//		d1.oddIndex(n);
//		System.out.println(d1.sumArray(n));
//		System.out.println(d1.productArray(n));
//		System.out.println(d1.largeElem(n));
		d1.minMaxElem(n);
	}
}
