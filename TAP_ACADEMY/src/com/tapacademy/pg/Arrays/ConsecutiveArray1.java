package com.tapacademy.pg.Arrays;

import java.util.Scanner;

class Day10{

	public void printConsArr(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i+1]-arr[i] == 1) {
				System.out.print(arr[i] + " ");
			} else {
				System.out.print(arr[i] + " ");
				System.out.println();
			}
			
		}
		System.out.print(arr[arr.length-1]);
	}

	public void countOfConsNumArr(int[] arr) {
		int count=1;
		int maxLength=1;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i+1]-arr[i] == 1) {
				count++;
			} 
		}
	
		System.out.println(count);
	}

	public void maxLengthOfConsArr(int[] arr) {
		int count=1;
		int maxLength=0;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i+1]-arr[i] == 1) {
				count++;
			} else {
				if(count>maxLength) {
					maxLength=count;
				}
				count=1;
			}
		}
		if(count>maxLength) {
			maxLength=count;
		}
		System.out.println(maxLength);
	}
	
}
public class ConsecutiveArray1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Day10 d10 = new Day10();
		
		d10.printConsArr(arr);
//		d10.countOfConsNumArr(arr);
//		d10.maxLengthOfConsArr(arr);
	}
}
