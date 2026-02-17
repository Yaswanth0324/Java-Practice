package collection_framework;

import java.util.*;

public class arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> AL = new ArrayList<> ();
		AL.add(15);
		AL.add(52);
		AL.add(89);
		AL.add(7);                               //adding
		AL.add(46);
		AL.add(15);
		System.out.println(AL);
		System.out.println(AL.remove(5));        //deletion
		AL.remove(3);
		System.out.println(AL);
		System.out.println(AL.contains(89));
		AL.add(1,100);
		System.out.println(AL);
		Vector<Integer> v2 = new Vector<> ();
		v2.add(23);
		v2.add(35);
		AL.addAll(v2);                           //adding one collection to other
		System.out.println(AL);
		for(Integer nums : AL) {           //for-each loop
			System.out.println(nums);

		}

		System.out.println(AL.get(3));      //retrieval
		System.out.println(AL.contains(20));   //verification
		System.out.println(AL.containsAll(v2));
		
		Integer[] arr1=new Integer[] {12,24,3336,448,555};
		ArrayList<Integer> AL2 = new ArrayList<>(Arrays.asList(arr1));
		for(Integer nums : AL2) {
			System.out.println(nums + " ");

		}
		for(int i=0;i<(AL.size());i++ ) {
			System.out.println(AL.get(i) + ",");

		}
		
		System.out.println(Collections.synchronizedList(AL));

		
		
		
		System.out.println();
		System.out.println();
		System.out.println(AL.size());
//		System.out.println(AL.capacity());

	}

}
