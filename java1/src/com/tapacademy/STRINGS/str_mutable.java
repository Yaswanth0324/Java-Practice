package com.tapacademy.STRINGS;

public class str_mutable {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Java");
		System.out.println(s);
		s.append("Script");
		System.out.println(s);
		System.out.println(s.capacity());
		System.out.println(s.length());
		System.out.println(s.insert(10,5));
		s.trimToSize();
		System.out.println(s);
		System.out.println(s.capacity());
		System.out.println(s.length());
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		StringBuilder s1 = new StringBuilder("Java");
		System.out.println(s1);
		s1.append("Script");
		System.out.println(s1);
		System.out.println(s1.capacity());
		System.out.println(s1.length());
		System.out.println(s1.insert(10,5));
		s1.trimToSize();
		System.out.println(s1);
		System.out.println(s1.capacity());
		System.out.println(s1.length());
		
		StringBuffer s2 = new StringBuffer();
		System.out.println(s2.capacity());
		
		System.out.println(s.equals(s1));   // check references not values
		
		
	}
}

