package com.tapacademy.COLLECTION_FRAMEWORK;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet2 {
	public static void main(String[] args) {
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(100);
		lhs.add("yash");
		lhs.add(10);
		lhs.add(200);
		lhs.add(10.23);
		lhs.add(null);
		lhs.add(true);
		
//		for not works because no indexing
		
//		for(Object obj : lhs) {
//			System.out.println(obj);
//		}
		
//		Iterator it = lhs.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		
		//descending iterator not works even it preserve the order of insertion , because its implementation is still hashtable
		
	}
}
