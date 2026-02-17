package collection_framework;

import java.util.*;

public class hashtable {
	public static void main(String[] args) {
		Hashtable<Integer,String> m = new Hashtable<> ();
		m.put(1, "pushpa");
		m.put(2, "pushpa2");
		m.put(3,"ala vaikuntapuramuloo");
		m.put(4, "DJ");
		m.put(5,"s%o satyamurthy");
		System.out.println(m);
		//retrieving keys
		Set<Integer> keys = m.keySet();
		for(Integer key : keys) {
			System.out.println(key);

		}
		//retrieving values
		Collection<String> values =  m.values();
		for(String value : values) {
			System.out.println(value);

		}
		
		System.out.println(m.get(3));
		
		m.remove(4);
		System.out.println(m.containsKey(4));
		m.put(4, "parugu");
		System.out.println(m);
		for(Integer key:keys) {
			System.out.println(key +"----" + m.get(key));

		}
		System.out.println(m.size());
		m.replace(1,"desamuduru");
		System.out.println(m);



				
	}


}
