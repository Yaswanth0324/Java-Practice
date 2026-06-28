package com.tapacademy.pg.Strings;

import java.util.Scanner;


class Day7{

	public String[] splitWord(String s) {
		int count = countOfWords(s);
		String[] ar = new String[count];
		int j=0;
		String t = "";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != ' ') {
				t += s.charAt(i);
				
			}else if(t.length() > 0){
				ar[j] = t;
				j++;
				t = "";
			}
			
		}
		if(j < ar.length) {
			ar[j] = t;
		}
		return ar;
	}

	public int countOfWords(String s) {
		int count=0;
		for (int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i) == ' ' && s.charAt(i+1) != ' ') {
				count++;
			}
		}
		return (s.charAt(0) == ' ') ?  count:count+1;
	}

	public String reverse(String s) {
		String revStr = "";
		for(int i=s.length()-1;i>=0;i--) {
			revStr += s.charAt(i);
		}
		return revStr;
	}

	public String printSmallestString(String[] res) {
		String minStr = res[0];
		for (int i = 1; i < res.length; i++) {
			
			if(res[i].length() < minStr.length() ) {
				minStr = res[i];
			}else if(minStr.length() == res[i].length()) {
				return minStr;
			}
		}
		
		return minStr;
	}
	
}
public class WordManipulation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s =sc.nextLine();
		
		Day7 d7 = new Day7();
		
//		System.out.println(d7.countOfWords(s));
		String[] res = d7.splitWord(s);
		
//		for (int i = 0; i < res.length; i++) {
//			System.out.print(res[i] + " ");
//		}
//		System.out.println();
//		
//		for (int i = res.length - 1; i >= 0 ; i--) {
//			System.out.print(res[i] + " ");
//		}
//		
//		System.out.println();
//		
//		for (int i = 0; i < res.length; i++) {
//			System.out.print(d7.reverse(res[i]) + " ");
//		}
//		System.out.println();
//		
//		for (int i = res.length - 1; i >= 0 ; i--) {
//			System.out.print(d7.reverse(res[i]) + " ");
//		}
//		
//		System.out.println();
		
		d7.printSmallestString(res);
		System.out.println(d7.printSmallestString(res));
	}
}
