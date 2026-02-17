package collection_framework;
import java.util.*;

public class vector {

	public static void main(String[] args) {
		
		Vector<Integer> v1 = new Vector<> ();
		v1.add(15);
		v1.add(52);
		v1.add(89);
		v1.add(7);                               //adding
		v1.add(46);
		v1.add(15);
		System.out.println(v1);
		System.out.println(v1.remove(5));        //deletion
		v1.remove(3);
		System.out.println(v1);
		System.out.println(v1.contains(89));
		v1.add(1,100);
		System.out.println(v1);
		Vector<Integer> v2 = new Vector<> ();
		v2.add(23);
		v2.add(35);
		v1.addAll(v2);                           //adding one collection to other
		System.out.println(v1);
		for(Integer nums : v1) {           //for-each loop
			System.out.println(nums);

		}

		System.out.println(v1.get(3));      //retrieval
		System.out.println(v1.contains(20));   //verification
		System.out.println(v1.containsAll(v2));
		
		v1.set(0,45555);                 //updation
		v1.add(null);
		System.out.println(v1);
		
		Object[] arr = new Object[] {25,35,654};
		Vector<Object> v3 = new Vector<>(Arrays.asList(arr));
		System.out.println(v3);
		
		System.out.println();
		System.out.println();
		System.out.println(v1.size());
		System.out.println(v1.capacity());










		

	}

}
