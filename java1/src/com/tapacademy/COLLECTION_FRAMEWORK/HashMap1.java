package com.tapacademy.COLLECTION_FRAMEWORK;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap1 {
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put(1, "apple");
		hm.put(2, "mango");
		hm.put("ram", "grapes");
		hm.put(null, "null");
		hm.put(5, "apple");
		hm.put(1.3, null);
		
		
//		Set keySet = hm.keySet();
//		for(Object obj : keySet) {
//			System.out.println(obj);
//		}
		
		
//		Collection values = hm.values();
//		for(Object obj : values) {
//			System.out.println(obj);
//		}
		
		HashMap hm2 = new HashMap();
		hm2.put(10 , "Yash");
		hm2.put(5.2, 1.55);
		
		hm.putAll(hm2);
		
//		Set hm3 = hm.entrySet();
//		Iterator it = hm3.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		
		
		System.out.println(hm.get(5));  // get value 
		
		hm.remove(null);
		System.out.println(hm);   // remove based on key
		
		System.out.println(hm.size());
		
		System.out.println(hm.containsKey(5));
		System.out.println(hm.containsValue("yash"));
		
		hm.replace(10, "Ram");
		System.out.println(hm.get(10));
		
		hm.replace(1, "apple", "banana");
		System.out.println(hm.get(1));
		
		System.out.println(hm.isEmpty());
		
		System.out.println(hm2.isEmpty());
		hm2.clear();
		System.out.println(hm2.isEmpty());
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		Set es = hm.entrySet();
		for(Object obj : es) {
			System.out.println(obj);
		}
	}
	
}
