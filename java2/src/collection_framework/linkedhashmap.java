package collection_framework;

import java.util.*;


public class linkedhashmap {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<> ();
		lhm.put(1, "pushpa");
		lhm.put(2, "pushpa2");
		lhm.put(3,"ala vaikuntapuramuloo");
		lhm.put(4, "DJ");
		lhm.put(5,"s%o satyamurthy");
		System.out.println(lhm);
		//retrieving keys
		Set<Integer> keys = lhm.keySet();
		for(Integer key : keys) {
			System.out.println(key);

		}
		//retrieving values
		Collection<String> values =  lhm.values();
		for(String value : values) {
			System.out.println(value);

		}
		
		System.out.println(lhm.get(3));
		
		lhm.remove(4);
		System.out.println(lhm.containsKey(4));
		lhm.put(4, "parugu");
		System.out.println(lhm);
		for(Integer key:keys) {
			System.out.println(key +"----" + lhm.get(key));

		}
		System.out.println(lhm.size());
		lhm.replace(1,"desamuduru");
		System.out.println(lhm);

	}

}
