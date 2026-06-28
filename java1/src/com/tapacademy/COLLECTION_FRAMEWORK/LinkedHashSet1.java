package com.tapacademy.COLLECTION_FRAMEWORK;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
	public static void main(String[] args) {
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(100);
		lhs.add("yash");
		lhs.add(10);
		lhs.add(200);
		lhs.add(10.23);
		lhs.add(null);
		lhs.add(true);
		
		System.out.println(lhs);
		
		System.out.println(lhs.contains(null));
		System.out.println(lhs.getFirst());
		System.out.println(lhs.getLast());
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.remove(null));
		System.out.println(lhs);
		
		
	}
}
