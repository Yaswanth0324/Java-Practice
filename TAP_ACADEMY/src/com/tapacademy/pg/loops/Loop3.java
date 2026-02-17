package com.tapacademy.pg.loops;

import java.util.Scanner;

class Day3{
	Scanner sc = new Scanner(System.in);
	void prime1() {
		int n = sc.nextInt();
		int count=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				count++;
			}
		}
		
		if(count==0) {
			System.out.println(n + " is a prime");
		}else {
			System.out.println(n + " not a prime");
		}
	}
	
	
	public String prime2(int n) {
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return "not Prime";
			}
		}
		return "prime" ;
		
	}
	
	public String prime3(int n) {
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return "not Prime";
			}
		}
		return "prime" ;
	}
	
	public void primeToN(int n) {
		for(int i=2;i<=n;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	
	public void primeToN2(int n1, int n2) {
		for(int i=n1;i<=n2;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	public static boolean isPrime(int n) {
		if(n==0 || n==1 ) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(n) ; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	
	void multiple(int n1 , int n2) {
		for(int i=1;i<=n2;i++) {
			if(i%n1==0) {
				System.out.println(i);
			}
		}
	}
	
	void commonMultiple(int x , int n1, int n2) {
		for(int i=1;i<=x;i++) {
			if(i%n1==0 && i%n2==0) {
				System.out.println(i);
			}
		}
	}
	
	void commonMultipleToN(int x , int a , int b) {
		int count=0;
		for(int i=1;count<x;i++) {
			if(i%a==0 && i%b==0) {
				System.out.println(i);
				count++;
			}
			if(count==x) {
				break;
			}
		}
		
	}
}
public class Loop3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Day3 d = new Day3();
		System.out.println("enter x: ");
		int x = sc.nextInt();
		System.out.println("Enter starting number: ");
		int n1 = sc.nextInt();
		System.out.println("Enter ending number: ");
		int n2 = sc.nextInt();
		
//		
//		
//		d.primeToN2(n1,n2);
		
//		d.multiple(n1,n2);
		d.commonMultipleToN(x, n1, n2);
		
		sc.close();
	}
}
