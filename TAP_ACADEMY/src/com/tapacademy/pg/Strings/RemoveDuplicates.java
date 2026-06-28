package com.tapacademy.pg.Strings;

import java.util.Scanner;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		removeDupl(s);
	}

	private static void removeDupl(String s) {
		
		boolean[] seen = new boolean[256];
		
		for(int i=0;i<s.length();i++) {
			
			char ch = s.charAt(i);
			
			if(!seen[ch]) {
				System.out.print(ch);
				seen[ch] = true;
			}
		}
	}
}
