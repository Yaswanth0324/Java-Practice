package com.tapacademy.pg.loops;

import java.util.Scanner;


class Day2{
	Scanner sc = new Scanner(System.in);
	void code1() {
		
		System.out.println("enter n: ");
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i =1;i<n;i++) {
			if(i%a==0 || i%b==0) {
				System.out.print(i + " ");
			}
		}
		
	}
	//-------------------------------------------------------
	void code2() {
		for(int i=10 ; i<100;i++) {
			System.out.println(i);
		}
	}
	//-------------------------------------------------------
	void code3() {
		System.out.println("enter n: ");
		int n = sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n +" * "+ i + " = " + n*i);
		}
	}
	//-------------------------------------------------------
	void code4() {
		System.out.println("enter n: ");
		int n = sc.nextInt();
		int count=0;
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+ " ");
				count++;
			}
		}
		System.out.println();
		System.out.println(count);
	}
	//--------------------------------------------------------
	public void prime() {
		System.out.println("enter n: ");
		int n = sc.nextInt();
		
		boolean isPrime = true;
		if(n==0 || n==1) {
			isPrime = false;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				isPrime=false;
			}
		}
		
		if(isPrime==true) {
			System.out.println(n + " is a prime number");
			
		}else {
			System.out.println(n + " is not a prime number");
		}
		
	}
	//----------------------------------------------------------
	public void prime2() {
		int n = sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		
		if(count==2) {
			System.out.println(n + " is a prime");
		}else {
			System.out.println(n + " not a prime");
		}
	}
	
}

public class Loop2 {
	public static void main(String[] args) {
		Day2 d= new Day2();
		d.code1();
		
		
	}
}
