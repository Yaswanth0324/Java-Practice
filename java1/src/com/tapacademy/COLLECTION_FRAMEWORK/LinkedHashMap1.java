package com.tapacademy.COLLECTION_FRAMEWORK;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMap1 {
	public static void main(String[] args) {
		
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put(1, "banana");
		lhm.put(2, 1.2);
		lhm.put("mango", true);
		lhm.put(40, "null");
		lhm.put(false, "null");
		lhm.put(null, "banana");
		lhm.put(null, "banana");
		
		Set es = lhm.entrySet();
		Iterator it = es.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
