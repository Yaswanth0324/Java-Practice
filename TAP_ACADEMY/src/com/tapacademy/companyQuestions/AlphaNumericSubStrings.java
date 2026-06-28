package com.tapacademy.companyQuestions;

import java.util.Scanner;


public class AlphaNumericSubStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		printAlphaNumSubStr(s);
	}

	private static void printAlphaNumSubStr(String s) {
		int len=1;
		while(len<=s.length()) {
			for(int i=0;i<s.length();i++) {
				if(i+len <= s.length()) {
					String subStr = s.substring(i , i+len);
					if(isAphaNum(subStr)) {
						System.out.println(subStr);
					}
				}
			}
			len++;
		}
	}

	private static boolean isAphaNum(String s) {
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i))) {
				return true;
			}
		}
		
		return false;
		
	}
}
