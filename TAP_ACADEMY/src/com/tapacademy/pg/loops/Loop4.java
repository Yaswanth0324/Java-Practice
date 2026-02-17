package com.tapacademy.pg.loops;

import java.util.Scanner;

class Day4{
	
	void commonFactor(int a, int b) {
		for(int i=1;i<=Math.min(a, b);i++) {
			if(a%i==0 && b%i==0) {
				System.out.print( i + " ");
				
			}
		}
	}
	int HCF(int a , int b) {
		for(int i=Math.min(a, b);i>=1;i--) {
			if(a%i==0 && b%i==0) {
				return i;
				
			}
		}
		return 1;
	}
	
	int GCD(int a , int b) {
		if(b==0) {
			return a;
		}
		return GCD(b, a%b);
	}
	
	int LCM(int a , int b) {
		return a*b/GCD(a,b);
		
	}
	int countDigits(int a) {
		int count=0;
		while(a!=0) {
			a=a/10;
			count++;
		}
		return count;
		
	}
	int sumDigits(int a) {
		int sum=0;
		while(a!=0) {
			sum= sum+a%10;
			a=a/10;
		}
		
		return sum;
	}
	int revNum(int a) {
		
		int rev=0,last=0;
		while(a!=0) {
			last=a%10;
			rev=rev*10 + last;
			a=a/10;
		}
		return rev;
		
	}
	
	void palindrome(int a) {
		int original = a;
		int rev=0,last=0;
		while(a!=0) {
			last=a%10;
			rev=rev*10 + last;
			a=a/10;
		}
		System.out.println(original == rev ? "palindrome": "not palindrome" );
	}
}


public class Loop4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Day4 d4 = new Day4();
		System.out.println("Enter a: ");
		int a = sc.nextInt();
//		System.out.println("Enter b: ");
//		int b = sc.nextInt();
		
//		d4.commonFactor(a, b);
//		System.out.println(d4.HCF(a, b));
//		System.out.println(d4.GCD(a, b));
//		System.out.println(d4.LCM(a, b));
//		System.out.println(d4.countDigits(a));
//		System.out.println(d4.sumDigits(a));
//		System.out.println(d4.revNum(a));
		d4.palindrome(a);
	}
}
