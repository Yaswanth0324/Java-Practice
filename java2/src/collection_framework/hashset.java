package collection_framework;

import java.util.*;

public class hashset {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(5);
		hs.add(15);
		hs.add(25);
		hs.add(35);
		hs.add(45);
		hs.add(55);
		hs.add(65);
		hs.add(75);
		System.out.println(hs);
		hs.remove(35);
		System.out.println(hs.contains(45));
		System.out.println(hs.size());
//		Integer[] arr = new Integer[] {85,95,105,115,125};
//		HashSet<Integer> hs1 = new HashSet<>(Arrays.asList(arr));
//		hs.containsAll(hs1);
		for(Integer num:hs) {
			System.out.println(num);

		}
		System.out.println(hs.isEmpty());

		



		
	}

}
