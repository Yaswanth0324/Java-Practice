package com.tapacademy.STRINGS;

import java.util.Scanner;

public class rev_str {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder(str);
		String rev = sb.reverse().toString();
		System.out.println(rev);
	}
}
