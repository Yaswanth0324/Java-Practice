package collection_framework;

import java.util.*;

public class linkedlist {

	public static void main(String[] args) {
		List<String> l = new LinkedList<>();
		l.add("gangotri");
		l.add("arya");
		l.add("arya2");             //adding
		l.add("bunny");
		System.out.println(l);
		System.out.println(l.remove("bunny"));       //removing
		
		l.add("Desamuduru");
		
		System.out.println(l.contains("arya"));             //verification
		l.set(3, "Bunny");                        //updation
		System.out.println(l);  
		
		String[] str = new String[] {"Desamuduru","varudu","vedam","rudramadevi"};
		LinkedList<String> l2=new LinkedList<>(Arrays.asList(str));            
		l.addAll(l2);
		for(String lists:l) {
			System.out.println("," + lists + ",");

		}
		System.out.println(l.get(4));      //retrieval
		System.out.println(l.size());
		l.removeFirst();
		System.out.println(l);






		

	}

}
