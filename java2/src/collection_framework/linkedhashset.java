package collection_framework;

import java.util.*;

public class linkedhashset {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(5);
		lhs.add(15);
		lhs.add(25);
		lhs.add(35);
		lhs.add(45);
		lhs.add(55);
		lhs.add(65);
		lhs.add(75);
		System.out.println(lhs);
		lhs.remove(35);
		System.out.println(lhs.contains(45));
		System.out.println(lhs.size());
		for(Integer num:lhs) {
			System.out.println(num);

		}
		System.out.println(lhs.isEmpty());

	}

}
