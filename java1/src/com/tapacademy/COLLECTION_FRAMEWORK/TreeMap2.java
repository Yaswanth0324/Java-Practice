package com.tapacademy.COLLECTION_FRAMEWORK;

import java.util.Set;
import java.util.TreeMap;

public class TreeMap2 {
	public static void main(String[] args) {
		
		TreeMap tm = new TreeMap();
		tm.put("one", 1);
		tm.put("two", 2);
		tm.put("three", 3);
		tm.put("four", 4);
		tm.put("five", 5);
		tm.put("six", 6);
		tm.put("seven", 7);
		
		
		Object clone =tm.clone();
		Set es = ((TreeMap) clone).entrySet();
		for(Object obj : es) {
			System.out.println(obj);
		}
		
	}
}
