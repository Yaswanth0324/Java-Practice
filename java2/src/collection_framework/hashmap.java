package collection_framework;

import java.util.*;
public class hashmap {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<> ();
		hm.put(1, "pushpa");
		hm.put(2, "pushpa2");
		hm.put(3,"ala vaikuntapuramuloo");
		hm.put(4, "DJ");
		hm.put(5,"s%o satyamurthy");
		System.out.println(hm);
		//retrieving keys
		Set<Integer> keys = hm.keySet();
		for(Integer key : keys) {
			System.out.println(key);

		}
		//retrieving values
		Collection<String> values =  hm.values();
		for(String value : values) {
			System.out.println(value);

		}
		
		System.out.println(hm.get(3));
		
		hm.remove(4);
		System.out.println(hm.containsKey(4));
		hm.put(4, "parugu");
		System.out.println(hm);
		for(Integer key:keys) {
			System.out.println(key +"----" + hm.get(key));

		}
		System.out.println(hm.size());
		hm.replace(1,"desamuduru");
		System.out.println(hm);

	}

}
