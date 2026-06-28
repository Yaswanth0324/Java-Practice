package com.tapacademy.COLLECTION_FRAMEWORK;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet2 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		 hs.add(150);
		 hs.add(250);
		 hs.add(70);
		 hs.add(30);
		 hs.add(260);
		 hs.add(160);
		 hs.add("yash");
		 hs.add(10.3);
		 
//		 for(Object obj : hs) {
//			 System.out.println(obj);
//		 }
		 
		 
//		Iterator cursor1 = hs.iterator();
//		
//		while(cursor1.hasNext()) {
//			System.out.println(cursor1.next());
//		}
		
//		Spliterator sp = hs.spliterator();
//		
//		sp.forEachRemaining(System.out::println);  //stream api
		 
//		descending not works because order is not preserved , so no order for reverse
//		 for loop not worked , because no indexing
		 
		 
		 ArrayList al = new ArrayList();
		 al.add(120);
		 al.add(120);
		 al.add("yash");
		 al.add(10.2);
		 
		 HashSet hs2 = new HashSet(al);  //its automatically removed duplicates
		 System.out.println(hs2);
	}
}
