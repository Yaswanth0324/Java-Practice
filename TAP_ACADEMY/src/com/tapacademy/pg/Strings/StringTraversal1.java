package com.tapacademy.pg.Strings;

import java.util.Scanner;

class Day1{

	public void revString(String str) {
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}

	}

	public void revString2(String str) {
		System.out.println();
		String revString = "" ;
		for(int i=str.length()-1;i>=0;i--) {
			revString += str.charAt(i);
		}

		System.out.println(revString);

	}

	public String checkPalindrome(String str) {
		String revStr = "";

		for(int i=str.length()-1;i>=0;i--) {
			revStr += str.charAt(i);
		}

		return revStr;
	}

	public String checkPalindrome2(String str) {

		int i=0,j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)== str.charAt(j)) {
				i++;
				j--;
			}else {
				return "Not Palindrome";
			}
		}
		return "Palindrome";
	}

	public int countSpace(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ' ') {
				count++;
			}
		}
		
		return count;
	}

	public int countwords(String str) {    // not efficient
		int count=1; 
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ' ') {
				count++;
			}
		}
		
		return count;
	}
	public int countwords2(String str) {    // not efficient
		int count=0; 
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i) == ' ' && str.charAt(i+1) != ' ') {
				count++;
			}
		}
		return str.charAt(0)!=' ' ? count+1 : count;
	}
}

public class StringTraversal1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Day1 d1 = new Day1();

		String str = sc.nextLine();

		//		d1.revString(str);
		//		d1.revString2(str);
		//		String reverseString=d1.checkPalindrome(str);
		//		if(str.equals(reverseString)) {
		//			System.out.println("palindrome");
		//		}else {
		//			System.out.println("not palindrome");
		//		}

//		System.out.println(d1.checkPalindrome2(str));
//		System.out.println(d1.countSpace(str));
//		System.out.println(d1.countwords(str));
		System.out.println(d1.countwords2(str));

	}
}
