package com.tapacademy.pg.Arrays;

import java.util.Scanner;

public class ConsecutiveSubArrays {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
//		consecutiveSubArrays(arr);
		lengthOfConsecutiveSubArrays(arr);
//		System.out.println(lengthOfMaxConsecutiveSubArrays(arr));
//		maxConsecutiveSubArrays(arr);
	}
	
	private static void lengthOfConsecutiveSubArrays(int[] arr) {
		int count = 1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1] - arr[i] == 1) {
				count++;
			}else {
				System.out.println(count);
				count = 1;
			}
		}
		System.out.println(count);
	}

	public static void consecutiveSubArrays(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1] - arr[i] == 1) {
				System.out.print(arr[i] + " ");
			}else {
				System.out.println(arr[i]);
			}
		}
		System.out.println(arr[arr.length-1]);
	}
	
	public static int lengthOfMaxConsecutiveSubArrays(int[] arr) {
		int count =1,max=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1] - arr[i] == 1) {
				count++;
			}else {
				if(count > max) {
					max =  count;
					count = 1;
				}
			}
		}
		
		if(count > max) {
			max  = count;
		}
		
		return max;
	}
	public static void maxConsecutiveSubArrays(int[] arr) {
		int count =1,max=0;
		int si = 0 , ei =0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1] - arr[i] == 1) {
				count++;
			}else {
				if(count > max) {
					max =  count;
					ei = i;
					count = 1;
				}
			}
		}
		
		if(count > max) {
			max  = count;
			ei = arr.length-1;
		}
		
		si = ei - max + 1;
		for(int i=si;i<=ei;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
}
