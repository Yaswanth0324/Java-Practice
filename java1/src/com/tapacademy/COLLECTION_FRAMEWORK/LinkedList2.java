package com.tapacademy.COLLECTION_FRAMEWORK;

import java.util.LinkedList;
import java.util.ListIterator;


public class LinkedList2 {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		
		l1.add(100);
		l1.add(10.2f);
		l1.add("Yash");
		l1.add(100);
		l1.add(null);
		l1.add(200);
		
		System.out.println(l1);
		
//		for (int i = 0; i < l1.size(); i++) {
//			System.out.println(l1.get(i));
//		}
		
//		for(Object obj : l1) {
//			System.out.println(obj);
//		}
		
//		Iterator it =l1.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		ListIterator lit =l1.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		
		System.out.println();
		System.out.println();
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
	}
}
