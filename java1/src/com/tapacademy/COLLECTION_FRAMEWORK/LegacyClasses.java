package com.tapacademy.COLLECTION_FRAMEWORK;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Stack;
import java.util.Vector;

public class LegacyClasses {
	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.add(10);
		v.add("yash");
		v.add(1.5);
		v.add(48);
//		System.out.println(v);
		
		Enumeration el = v.elements();
		while(el.hasMoreElements()) {
			System.out.println(el.nextElement());
		}
		
		Stack s = new Stack();
		s.push(12);
		s.push("yash");
		s.push(1.2);
		s.push(45);
		s.push(true);
		s.push(5);
		
		System.out.println(s);
		
		
		Hashtable ht = new Hashtable();
		ht.putIfAbsent(1, "one");
		ht.putIfAbsent(2, "two");
		ht.putIfAbsent(3, "three");
		ht.putIfAbsent(4, "four");
		ht.putIfAbsent(5, "five");
		
		Enumeration el2 = ht.elements();
		while(el2.hasMoreElements()) {
			System.out.println(el2.nextElement());
		}
	}
}
