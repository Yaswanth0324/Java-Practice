package com.tapacademy.pg.Strings;

import java.util.Scanner;

class Day2{

	public int printVowelCount(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' || ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U') {
				count++;
			}
		}
		
		return count;
		
	}
	public int printConsCount(String s ) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch !='a' && ch !='e' && ch !='i' && ch !='o' && ch !='u' && ch !='A' && ch !='E' && ch !='I' && ch !='O' && ch !='U') {
				count++;
			}
		}
		
		return count;
		
	}
	public int vowCons(String s) {
		int vow=0,cons=0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch >='a' && ch <= 'z' || ch >='A' && ch <= 'Z') {
				if (ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' || ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U') {
					vow++;
				} else {
					cons++;
				}
			}
		}
		
		
		return cons;
	}
	public void countVowConsNumSpecChar(String s) {
		int vow=0,con=0,num=0,spec=0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch >='a' && ch <= 'z' || ch >='A' && ch <= 'Z') {
				if (ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' || ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U') {
					vow++;
				} else {
					con++;
				}
			}else if(ch>=48 && ch <= 57) {
				num++;
			}else if(ch == ' '){
				continue;
			}else {
				spec++;
			}
		}
		
		System.out.println("Vowels: " + vow);
		System.out.println("Consonants: " + con);
		System.out.println("Numbers: " + num);
		System.out.println("Special Chars: " + spec);
	}
	
	
	
	
	
}

public class StringTraversal2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Day2 d2 = new Day2();
		
		String s = sc.nextLine();
		
//		System.out.println(d2.printVowelCount(s));
//		System.out.println(d2.printConsCount(s));
//		System.out.println(d2.vowCons(s));
		d2.countVowConsNumSpecChar(s);
		
		
	}
}
