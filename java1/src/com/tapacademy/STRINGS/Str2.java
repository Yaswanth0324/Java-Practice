package com.tapacademy.STRINGS;

public class Str2 {
	public static void main(String[] args) {
		String s1 = "SAURAV";
		String s2 = "SACHIN";
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s1));
		String s3 = "SAURAV";
		System.out.println(s1.compareTo(s3));
		
		System.out.println();
		System.out.println();
		
		String s4 = "Ram";
		String s5 = "Rama";
		
		System.out.println(s4.compareTo(s5));
		System.out.println(s5.compareTo(s4));
		
		String s6 = "ram";
		System.out.println(s4.compareToIgnoreCase(s6));
		
		
	}
}
