package collection_framework;

import java.util.*;

public class treemap {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap<> ();
		tm.put(1, "pushpa");
		tm.put(2, "pushpa2");
		tm.put(3,"ala vaikuntapuramuloo");
		tm.put(4, "DJ");
		tm.put(5,"s%o satyamurthy");
		System.out.println(tm);
		//retrieving keys
		Set<Integer> keys = tm.keySet();
		for(Integer key : keys) {
			System.out.println(key);

		}
		//retrieving values
		Collection<String> values =  tm.values();
		for(String value : values) {
			System.out.println(value);

		}
		
		System.out.println(tm.get(3));
		
		tm.remove(4);
		System.out.println(tm.containsKey(4));
		tm.put(4, "parugu");
		System.out.println(tm);
		for(Integer key:keys) {
			System.out.println(key +"----" + tm.get(key));

		}
		System.out.println(tm.size());
		tm.replace(1,"desamuduru");
		System.out.println(tm);

	}

}
