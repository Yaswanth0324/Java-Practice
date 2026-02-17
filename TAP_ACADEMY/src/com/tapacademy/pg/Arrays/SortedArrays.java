package com.tapacademy.pg.Arrays;

import java.util.Scanner;


class Day5{
	void sortedNumRepeatCount(int[] ar){
		int count=1;
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i] == ar[i+1]) {
				count++;
			}else {
				System.out.println(ar[i] + "-" + count);
				count=1;
			}
		}
		System.out.println(ar[ar.length-1] + "-" + count);
	}
	
	void sortedNumRemoveDup(int[] ar){
		for(int i=0;i<ar.length-1;i++) {
//			if(ar[i] == ar[i+1]) {
//				continue;
//			}else {
//				System.out.print(ar[i] + " ");
//			}
			
			if(ar[i] != ar[i+1]) {
				System.out.print(ar[i] + " ");
			}
		}
		System.out.print(ar[ar.length-1]);
	}
	
	void sortedNumPrintNotRepeatNum(int[] ar){
		int count=1;
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i] == ar[i+1]) {
				count++;
			}else {
				if(count==1) {
					System.out.print(ar[i] + " ");
				}
				count=1;
			}
			
		}
		if(count==1) {
			System.out.println(ar[ar.length-1]);
		}
	}
	
	void sortedNumPrintUniqueNumCount(int[] ar){
		int count=1;
		int uniqueCount=0;
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i] == ar[i+1]) {
				count++;
			}else {
				if(count==1) {
					uniqueCount++;
				}
				count=1;
			}
			
		}
		if(count==1) {
			uniqueCount++;
		}
		System.out.println(uniqueCount);
	}
	
	void sortedNumRepeatBigNum(int[] ar){
		for(int i=ar.length-1;i>=1;i--) {
			if(ar[i] == ar[i-1]) {
				System.out.print(ar[i]);
				break;
			}
		}
		
	}
	
	void sortedNumRepeatSmallNum(int[] ar){
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i] == ar[i+1]) {
				System.out.print(ar[i]);
				break;
			}
		}
		
	}
	
	
}
public class SortedArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the n: ");
		int n = sc.nextInt();
		
		int[] ar = new int[n];
		
		for(int i=0;i<ar.length;i++) {
			ar[i] = sc.nextInt();
		}
		
		Day5 d5 = new Day5();
		
//		d5.sortedNumRepeatCount(ar);
//		d5.sortedNumRemoveDup(ar);
//		d5.sortedNumPrintNotRepeatNum(ar);
//		d5.sortedNumPrintUniqueNumCount(ar);
//		d5.sortedNumRepeatBigNum(ar);
		d5.sortedNumRepeatSmallNum(ar);
		
		
	}
}
