package collection_framework;

import java.util.*;

public class treeset {

	public static void main(String[] args) {
		TreeSet<String> ts= new TreeSet<>();
		ts.add("bunny");
		ts.add("pushpa");
		ts.add("varudu");
		ts.add("arya");
		ts.add("desamuduru");
		System.out.println(ts);
		System.out.println(ts.remove("varudu"));
		System.out.println(ts.contains("varudu"));
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
		System.out.println(ts);
		ts.add("arya2");
		ts.add("vedam");
		System.out.println(ts.subSet("a", "k"));
		System.out.println(ts.descendingSet());

		for(String movies : ts) {
			System.out.println(movies);

		}






	}

}
