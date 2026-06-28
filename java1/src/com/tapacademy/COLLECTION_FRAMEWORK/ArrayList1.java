package com.tapacademy.COLLECTION_FRAMEWORK;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(6);
		al1.add(4);
		System.out.println(al1);
		
		System.out.println(al1.indexOf(4));
		System.out.println(al1.lastIndexOf(4));
		
		ArrayList al2 = new ArrayList();
		al2.add(6);
		al2.add(7);
		al2.add(8);
		al2.add(9);
		
//		al1.retainAll(al2);
		al1.removeAll(al2);
		System.out.println(al1);
//		System.out.println(al2);
//		
//		
////		al1.addAll(al2);
////		System.out.println(al1);
//		
//		al1.addAll(2,al2);
//		System.out.println(al1);
//		
//		al1.add(null);
//		System.out.println(al1);
//		
////		al1.retainAll(al2);
////		System.out.println(al1);
//		
//		al1.removeAll(al2);
//		System.out.println(al1);
//		
//		List subList = al1.subList(1 , 4);
//		System.out.println(subList);
		
		
		al1.add(5);
		al1.add(6);
		al1.add(4);
		al1.add(5);
		
		System.out.println(al1.contains(50));
		System.out.println(al1.indexOf(4));
		System.out.println(al1.indexOf(100));
		
//		al1.trimToSize();
		
//		al1.add(2, 22);
//		System.out.println(al1);
//		al1.set(2, "Yash");
//		System.out.println(al1);
//		
//		System.out.println(al1.size());
//		System.out.println(al1.remove(2));
//		System.out.println(al1.isEmpty());
//		System.out.println(al1.get(3));
//		
//		al1.clear();
//		System.out.println(al1);
		
	}
}
