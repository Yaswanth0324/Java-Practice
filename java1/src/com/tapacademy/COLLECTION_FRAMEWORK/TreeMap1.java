package com.tapacademy.COLLECTION_FRAMEWORK;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
		
		TreeMap tm = new TreeMap();
		tm.put(1, "yash");
		tm.put(5, "mango");
		tm.put(4, "yash");
		tm.put(15, 1.5);
		tm.put(2, true);
		tm.put(8, null);
		
		
//		Set es = tm.entrySet();
//		Iterator it = es.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
//		System.out.println(tm.get(5));
//		System.out.println(tm.getOrDefault(9, 0));  
//// if key is present then corresponding value is the output otherwise default value is output
//		
//		System.out.println(tm.containsKey(9));
//		System.out.println(tm.containsValue("yash"));
//		System.out.println(tm);
//		System.out.println(tm.remove(3));
//		System.out.println(tm);
//		 
//		System.out.println(tm.isEmpty());
//		System.out.println(tm.size());
//		tm.clear();
//		System.out.println(tm);
		
//		Set ks = tm.keySet();
//		for(Object obj : ks) {
//			System.out.println(obj);
//		}
		
//		NavigableSet dks = tm.descendingKeySet();
//		for(Object obj : dks) {
//			System.out.println(obj);
//		}
		
//		NavigableSet nks = tm.navigableKeySet();
//		for(Object obj : nks) {
//			System.out.println(obj);
//		}
		
//		Collection v1 = tm.values();
//		for(Object obj : v1) {
//			System.out.println(obj);
//		}
		
//		System.out.println(tm.ceilingEntry(16));  
////		if key present , then key=value given otherwise next largest key=value given , if key is above max , returns null
//		System.out.println(tm.ceilingKey(10));
		
//		System.out.println(tm.floorEntry(10));
////		if key present , then key=value given otherwise next smallest key=value given , if key is below min , returns null
//		System.out.println(tm.floorKey(9));
		
//		System.out.println(tm.pollFirstEntry());
//		//return first key and delete from TreeMap
//		System.out.println(tm.pollLastEntry());
//		//return last key and delete from TreeMap
		
		
//		System.out.println(tm.firstKey());
//		System.out.println(tm.firstEntry());
//		System.out.println(tm.lastKey());
//		System.out.println(tm.lastEntry());
		
	
//		tm.putFirst(9, "ram");  //not supported 
//		System.out.println(tm);
		
		
		
		
		
	}
}
