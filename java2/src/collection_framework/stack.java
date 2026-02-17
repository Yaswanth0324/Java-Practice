package collection_framework;

import java.util.*;

public class stack {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<> ();
		s.push(15);
		s.push(52);
		s.push(89);
		s.push(7);                               //adding
		s.push(46);
		s.push(15);
		System.out.println(s);
		System.out.println(s.pop());        //deletion
		s.remove(3);
		System.out.println(s);
		System.out.println(s.contains(89));
		s.push(36);
		System.out.println(s);
		Vector<Integer> v2 = new Vector<> ();
		v2.add(23);
		v2.add(35);
		s.addAll(v2);                           //adding one collection to other
		System.out.println(s);
		for(Integer nums : s) {           //for-each loop
			System.out.println(nums);

		}

		System.out.println(s.peek());      //retrieval
		System.out.println(s.search(20));   //verification
		System.out.println(s.containsAll(v2));
		System.out.println(s.search(36));
		System.out.println(s.isEmpty());
		
		
		



	}

}
