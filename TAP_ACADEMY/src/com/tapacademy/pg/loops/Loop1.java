package com.tapacademy.pg.loops;

import java.util.Scanner;

class Loop{
	Scanner sc = new Scanner(System.in);
	void loop1() {
		
		System.out.println("EMter the size of array: ");
		int n=sc.nextInt();
		int a[] =new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the "+(i+1) + " ELement: ");
			a[i] = sc.nextInt();
		}
		int max = a[0];
		for(int i=0;i<n;i++) {
			if(a[i] >max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}
	
	void loop2() {
		System.out.println("enter n: ");
		int n = sc.nextInt();
		
		for(int i=0;i<=n;i=i+2) {
			System.out.print(i + " ");
		}
	}
}
public class Loop1 {
	public static void main(String[] args) {
		
		Loop l = new Loop();
//		l.loop1();
		l.loop2();
		
		
	}
}
