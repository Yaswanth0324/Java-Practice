package com.tapacademy.pg.Strings;

import java.util.Scanner;

class Day6{

	public void longestPalindromeSubArray(String s) {
		
		for(int i=s.length();i>=1;i--) {
			for(int j=0;j<=s.length()-i;j++) {
				String t = "";
				for(int k=j;k<i+j;k++) {
					t += s.charAt(k);
				}
				
				if(isPalindrome(t)) {
					System.out.println(t);
					return ;
				}
			}
		}
		
	}

	public boolean isPalindrome(String t) {
		int i=0,j=t.length()-1;
		while(i<j) {
			if(t.charAt(i) ==  t.charAt(j)) {
				i++;
				j--;
			}else {
				return false;
			}
		}
		return true;
	}
	
}

public class SubStrings2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		Day6 d6 = new Day6();
		
		d6.longestPalindromeSubArray(s);
		
	}
}
