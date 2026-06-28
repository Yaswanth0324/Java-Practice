package com.tapacademy.COLLECTION_FRAMEWORK;

import java.util.TreeSet;

public class TreeSet3 {
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		ts.add("yash");
		ts.add("lavanya");
		ts.add("bhumika");
		ts.add("amrutha");
		ts.add("sreehari");
		ts.add("sundar");
		
		for(Object obj:ts) {
			System.out.println(obj);
		}
	}
}
