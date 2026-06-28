package com.tapacademy.COLLECTION_FRAMEWORK;

import java.util.HashSet;
import java.util.LinkedList;

public class HashSet1 {
	public static void main(String[] args) {
		 HashSet hs = new HashSet();
		 hs.add(150);
		 hs.add(250);
		 hs.add(70);
		 hs.add(30);
		 hs.add(260);
		 hs.add(160);
		 hs.add(1750);
		 hs.add(15);
		 hs.add(7);
		 
//		 System.out.println(hs);
//		 
//		 System.out.println(hs.contains(157));
//		 System.out.println(hs.isEmpty());
//		 System.out.println(hs.remove(17));
//		 System.out.println(hs.size());
		 
//		 Object clone = hs.clone();
//		 System.out.println(clone);
		 
		 LinkedList list = new LinkedList();
		 list.add("Yash");
		 list.add(13);
		 list.add(15.3);
		 
		 hs.addAll(list);
		 System.out.println(hs);
		 
//		 hs.retainAll(list);
//		 System.out.println(hs);
//		 
		 hs.removeAll(list);
		 System.out.println(hs);
		 
//		 hs.clear();
//		 System.out.println(hs);
		
		
		 
		 
	}
}
