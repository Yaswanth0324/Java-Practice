package com.tapacademy.pg.Arrays;

import java.util.Arrays;
import java.util.Scanner;

class Day2{
	Scanner sc = new Scanner(System.in);
	
	void maxIndex(int n) {
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		int maxIndex = 0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
				maxIndex = i;
			}
			
		}
		System.out.println(maxIndex);
		
	}
	
	void numOccurance(int n) {
		
			int arr[] = new int[n];
			for(int i=0;i<arr.length;i++) {
				arr[i] = sc.nextInt();
			}
			int num = sc.nextInt();
			int count=0;
			for(int i=1;i<arr.length;i++) {
				if(num==arr[i]) {
					count++;
				}
				
			}
			System.out.println(count);
			
	}
	
	int numIndexFind(int n) {
		
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int num = sc.nextInt();
		for(int i=1;i<arr.length;i++) {
			if(num==arr[i]) {
				return  i;
			}
			break;
		}
		return -1;
		
}
	
	
}

public class Array2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int n =sc.nextInt();
		
		Day2 d2 = new Day2();
		
//		d2.maxIndex(n);
//		d2.numOccurance(n);
		int res=d2.numIndexFind(n);
		System.out.println(res== -1 ? " element not found" : res);
	}
}
