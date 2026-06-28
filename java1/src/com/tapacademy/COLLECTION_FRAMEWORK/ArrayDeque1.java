package com.tapacademy.COLLECTION_FRAMEWORK;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class ArrayDeque1 {
	public static void main(String[] args) {
		
		ArrayDeque ad = new ArrayDeque();
		
		ad.add(100);
		ad.addFirst(200);
		ad.addLast(300);
		ad.add(500);
		ad.add(600);
		
		System.out.println(ad);
		
		System.out.println(ad.getFirst());
		System.out.println(ad.getLast());
		
		ArrayDeque clone = ad.clone();
		System.out.println(clone);
		
		System.out.println(ad.contains(500));
		
		System.out.println(ad.peek());
		System.out.println(ad.poll());
		
		System.out.println(ad);
		
		ArrayList al = new ArrayList();
		al.add("Yash");
		al.add(800);
		
		ad.addAll(al);
		System.out.println(ad);
		
		ad.remove();
		System.out.println(ad);
		
		ad.removeFirst();
		System.out.println(ad);
		
		ad.removeLast();
		System.out.println(ad);
		
		System.out.println(ad.size());
		
		
	}
}
