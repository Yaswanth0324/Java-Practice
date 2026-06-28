package com.tapacademy.COLLECTION_FRAMEWORK;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList3 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(200);
		al.add(400);
		al.add(500);

		LinkedList li = new LinkedList(al);
		
		
		ArrayList al2 = new ArrayList(li);
		
		System.out.println(al2);
		
		System.out.println(li);
		
		//	li.offer(100);
		//	li.offer(200);
		//	li.offer(300);
		//	li.offer(400);.

		//	li.push(100);    //stack implementation
		//	li.push(200);
		//	li.push(300);
		//	li.push(400);
		//	
		//	System.out.println(li.pop());
		//	
		//	System.out.println(li);

	}
}
