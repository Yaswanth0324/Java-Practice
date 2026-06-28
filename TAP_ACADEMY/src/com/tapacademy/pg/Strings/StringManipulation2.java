package com.tapacademy.pg.Strings;

import java.util.Scanner;

class Day4{

	public void removeLeadingTrailingSpaces(String s) {
		int si=0,ei=s.length();       //starting and ending indexes
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != ' ') {
				si=i;
				break;
			}
		}
		for (int i = s.length()-1; i >= 0; i--) {
			if(s.charAt(i) != ' ') {
				ei=i;
				break;
			}
		}
		for (int i = si; i <= ei; i++) {
			System.out.print(s.charAt(i));
		}
		
	}

	public void removeSpace(String s) {
		int si=0,ei=s.length();       //starting and ending indexes
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != ' ') {
				si=i;
				break;
			}
		}
		for (int i = s.length()-1; i >= 0; i--) {
			if(s.charAt(i) != ' ') {
				ei=i;
				break;
			}
		}
		for (int i = si; i <= ei; i++) {
			if(s.charAt(i) != ' ' || s.charAt(i) == ' ' && s.charAt(i+1) != ' ' ) {
				System.out.print(s.charAt(i));
			}
		}
		
	}

	public String addExctraChar(String s) {
		String str = "";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) != 'a') {
				str += s.charAt(i);
			}else {
				str += "*"+s.charAt(i);
			}
		}
		
		return str;
	}

	public int indexOfChar(String s, char ch) {
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == (char) ch) {
				return i;
			}
		}
		
		
		return -1;
	}

	public void checkStringPresentInAnotherStr(String s1, String s2) {

	    int i = 0, j = 0;

	    while (i < s1.length() && j < s2.length()) {

	        if (s1.charAt(i) == s2.charAt(j)) {
	            j++;   
	        }

	        i++;       
	    }

	    if (j == s2.length()) {
	        System.out.println("Yes");
	    } else {
	        System.out.println("No");
	    }
	}
	
}

public class StringManipulation2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
//		char ch = sc.next().charAt(0);
		String s1 = sc.nextLine();
		Day4 d4 = new Day4();
		
//		d4.removeLeadingTrailingSpaces(s);
//		d4.removeSpace(s);
//		System.out.println(d4.addExctraChar(s));
//		System.out.println(d4.indexOfChar(s,ch));
		d4.checkStringPresentInAnotherStr(s,s1);
	}
}
