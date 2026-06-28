package com.tapacademy.COLLECTION_FRAMEWORK;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList2 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		
		
//		for(int i=0;i<al.size();i++) {
//			System.out.println(al.get(i));
//		}
		
//		for(Object ob : al) {
//			System.out.println(ob);
//		}
		
//		Iterator it = al.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		ListIterator lit = al.listIterator();
		
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		
		System.out.println();
		System.out.println();

		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		
		System.out.println();
		
		ListIterator lit2 = al.listIterator(al.size());
		
		while(lit2.hasPrevious()) {
			System.out.println(lit2.previous());
		}
	}
	
}
