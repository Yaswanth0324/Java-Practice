package com.tapacademy.COLLECTION_FRAMEWORK;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;


public class TreeSet2 {
	public static void main(String[] args) {
		TreeSet ts= new TreeSet();

		ts.add(100);
		ts.add(125);
		ts.add(25);
		ts.add(150);
		ts.add(55);
		ts.add(200);
		ts.add(200);
		ts.add(110);

//		System.out.println(ts);
		
		ArrayList al = new ArrayList();  //TreeSet(Collection
		al.add(120);
		al.add(100);
		al.add(170);
		al.add(70);
		al.add(55);
//		al.add("yash");  //throw classcast exception
		
		
		TreeSet ts2 = new TreeSet(al);
		System.out.println(ts2);
		
//		
//		for(Object obj : ts) {
//			System.out.println(obj);
//		}
		
		
//		Iterator cursor1 = ts.iterator();
//		while(cursor1.hasNext()) {
//			System.out.println(cursor1.next());
//		}
		
//		Iterator cursor2 = ts.descendingIterator();
//		
//		while(cursor2.hasNext()) {
//			System.out.println(cursor2.next());
//		}
//		
		

	}

}
