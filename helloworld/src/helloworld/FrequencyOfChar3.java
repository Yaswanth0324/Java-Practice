package helloworld;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class FrequencyOfChar3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String n = sc.nextLine().toLowerCase();
		
		printFrequencyOfChar(n);
	}

	private static void printFrequencyOfChar(String n) {
		
		LinkedHashMap<Character , Integer> chars = new LinkedHashMap<>();
		
		for(char ch : n.toCharArray()) {
			chars.put(ch , chars.getOrDefault(ch, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : chars.entrySet()) {
			System.out.println(entry.getKey() + " -- " + entry.getValue());
		}
	}
}
