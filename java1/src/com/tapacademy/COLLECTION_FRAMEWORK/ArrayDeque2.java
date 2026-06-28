package com.tapacademy.COLLECTION_FRAMEWORK;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeque2 {
	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque();

		ad.add(100);
		ad.addFirst(200);
		ad.addLast(300);
		ad.add(500);
		ad.add(600);
		
		
//		for(Object obj : ad) {
//			System.out.print(obj + " ");
//		}
		
//		Iterator cursor1 = ad.iterator();
//		
//		while(cursor1.hasNext()) {
//			System.out.println(cursor1.next());
//		}
		
		
		Iterator cursor2 = ad.descendingIterator();
		
		while(cursor2.hasNext()) {
			System.out.println(cursor2.next());
		}
	}

}


