package com.tapacademy.COLLECTION_FRAMEWORK;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet1 {
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
//		ts.add(null);    // null not inserted 
//		ts.add("yash");   // heterogenous data not allowed 
		
//		ts.addFirst(60);  //no indexing , thats why not supported these two mehods
//		ts.addLast(250);  //Insertion is based on value (comparison), NOT position.
		
		System.out.println(ts);
		
//		System.out.println(ts.size());
//		System.out.println(ts.isEmpty());
//		System.out.println(ts.contains(150));
//		ts.remove(125);
//		System.out.println(ts);
//		
//		System.out.println(ts.first());
//		System.out.println(ts.last());
//		System.out.println(ts.getFirst());
//		System.out.println(ts.getLast());
//		System.out.println(ts.pollFirst());
//		System.out.println(ts.pollLast());
		
//		System.out.println(ts.headSet(55));
//		System.out.println(ts.headSet(150, true));  // included when set it true , by default it is false
//		System.out.println(ts.tailSet(55));
//		System.out.println(ts.tailSet(55, false));// excluded when set it false , by default it is true
//
////		TreeSet subSet = (TreeSet) ts.subSet(100, true, 200 , true);    // its happen becuase  subset return only navigableSet
//		NavigableSet subSet = ts.subSet(100,false, 200 , true);  // by default first elem included , second element excluded
//		System.out.println(subSet);
		
		
		System.out.println(ts.ceiling(200));
		System.out.println(ts.ceiling(210));
		
		System.out.println(ts.floor(140));
		System.out.println(ts.floor(10));
		
		System.out.println(ts.higher(140));
		System.out.println(ts.lower(60));
		
		System.out.println(ts.higher(200));
		System.out.println(ts.lower(20));
		
		
		
		
		
	}
}
