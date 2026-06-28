package com.tapacademy.pg.Strings;

import java.util.Scanner;

class Day3{

	public String removeSpec(String s) {
		String specRemove="";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9') {
				specRemove += ch;
			}
		}
		
		return specRemove;
	}

	public String charFirstNumLast(String s) {
		String chars = "";
		String nums = "";
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch >='a' && ch <= 'z' || ch >= 'A' && ch <='Z') {
				chars += ch;
			}else if(ch >= '0' && ch <= '9') {
				nums += ch;
			}
		}
		return chars + nums;
	}

	public String charsFirstNumSum(String s) {
		int sum=0;
		String chars = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch >='a' && ch <= 'z' || ch >= 'A' && ch <='Z') {
				chars += ch;
			}else if(ch >= '0' && ch <= '9') {
				sum += (int)ch - 48;;
			}
		}
		
		return chars+sum;
	}

	public String lowerToUpper(String s) {
		String lower = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch >= 'A' && ch <= 'Z' ) {
				ch = (char)(ch + 32);
				lower += ch;
			}else {
				lower += ch;
			}
		}
		
		return lower;
	}

	public String converter(String s) {
		String upper ="";
		String lower = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch >= 'A' && ch <= 'Z' ) {
				ch = (char)(ch + 32);
				lower += ch;
			}else if(ch >= 'a' && ch <= 'z' ) {
				ch = (char)(ch - 32);
				lower += ch;
			}
			else {
				lower += ch;
			}
		}
		return lower+upper ;
	}
	
	
	
}

public class StringManipulation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Day3 d3 = new Day3();
		
		String s = sc.nextLine();
		
//		System.out.println(d3.removeSpec(s));
//		System.out.println(d3.charFirstNumLast(s));
//		System.out.println(d3.charsFirstNumSum(s));
//		System.out.println(d3.lowerToUpper(s));
		System.out.println(d3.converter(s));
	}
}
