package com.tapacademy.pg.Strings;

import java.util.Scanner;

class Day5{

	public void subString(String s, int n) {
		for(int i=0;i<=s.length()-n;i++) {
			for(int j=i;j<i+n;j++) {
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
	}

	public void containsCheck(String s1, String s2) {
		int i=0,j=0,start=0;
		while(i<s1.length() && j <s2.length()) {
			if(s1.charAt(i) == s2.charAt(j) ) {
				i++;
				j++;
				if(j == s2.length()) {	
					System.out.println("Yes");
					return;
				}
			}else {
				start++;
				j=0;
				i=start;
			}
		}
			System.out.println("No");
	}

	public void subStringCount(String s1, String s2) {
		int count=0;
		for(int i=0;i<=s1.length()-s2.length();i++) {
			String t = "";
			for (int j = i; j < i+s2.length(); j++) {
				t += s1.charAt(j);
			}
			if(t.equals(s2)) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	public void subStringPalindrome(String s, int n) {
		for(int i=0;i<=s.length()-n;i++) {
			String t = "";
			for(int j=i;j<i+n;j++) {
				t += s.charAt(j);
			}
			
			if(isPalindrome(t)) {
				System.out.println(t);
			}
			
		}
	}

	private boolean isPalindrome(String t) {
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
	
	public void removeDuplicates(String s) {

	    String result = "";
	    int i = 0;

	    while (i < s.length()) {

	        char ch = s.charAt(i);

	        if (result.indexOf(ch) == -1) {
	            result = result + ch;
	        }

	        i++;
	    }

	    System.out.println(result);
	}
	
	public void removeDuplicates2(String s) {

	    String result = "";
	    int i = 0;

	    while (i < s.length()) {

	        char ch = s.charAt(i);
	        int j = 0;
	        boolean found = false;

	        while (j < result.length()) {
	            if (result.charAt(j) == ch) {
	                found = true;
	                break;
	            }
	            j++;
	        }

	        if (!found) {
	            result = result + ch;
	        }

	        i++;
	    }

	    System.out.println(result);
	}
}


public class SubStrings1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
//		String s1 = sc.nextLine();
		
//		int n  = sc.nextInt();
		Day5 d5 = new Day5();
		
//		d5.subString(s,n);
//		d5.containsCheck(s,s1);
//		d5.subStringCount(s,s1);
//		d5.subStringPalindrome(s, n);
		d5.removeDuplicates(s);
		d5.removeDuplicates2(s);
		
	}
}
