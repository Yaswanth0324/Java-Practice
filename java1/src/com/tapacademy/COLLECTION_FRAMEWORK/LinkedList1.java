package com.tapacademy.COLLECTION_FRAMEWORK;

import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(null);
		l1.add("Yash");
		l1.add(30);
		l1.add(2,100);
		l1.add(30);
		LinkedList l2 = new LinkedList();
		l2.add(50);
		l2.add(40);
		l2.add(60);
		l2.add(30);
		l2.add(null);
		System.out.println(l2);
//		l1.add(l2);
//		LinkedList l3 = new LinkedList();
//		l3.add(500);
//		l3.add("Java");
//		
//		l1.addAll(4,l3);
		
		System.out.println(l1);
		
		l1.set(3, 300);
		System.out.println(l1);
		
////		l2.retainAll(l1);
//		l2.removeAll(l1);
//		System.out.println(l2);
//		System.out.println(l2.size());
//		System.out.println(l2.isEmpty());
//		System.out.println(l2.remove(1));
//		System.out.println(l2.size());
		
		System.out.println(l1.get(3));
		
		List li = l1.subList(2, 5);  // 5 excluded
		System.out.println(li);
		
		System.out.println(l1.contains(null));
		System.out.println(l1.contains(25));
		
		System.out.println(l1.indexOf("Yash"));
		System.out.println(l1.indexOf("yash"));
		
		System.out.println(l1.lastIndexOf(30));
		
		l1.addFirst("Java");
		l1.addLast("MySQL");
		
		System.out.println(l1);
		
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		l1.removeFirst();
		l1.removeLast();
		System.out.println(l1);
		
		System.out.println(l1.peek());  // retrieve first element
		System.out.println(l1.poll());  // retrieve first element and remove from list 
		System.out.println(l1);
		
		System.out.println(l1.offer(null));  // add element at rear end of list
		System.out.println(l1.offer("Spring"));
		System.out.println(l1);
		
		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());
		
		System.out.println(l1.pollFirst());
		System.out.println(l1.pollLast());
		
		System.out.println(l1);
		
		
	}
}


// duplicates allowed 
// null allowed
// stores heterogeneous data 
// preserve the insertion order
// no need of contiguous memory