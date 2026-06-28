package com.tapacademy.pg.maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Map1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		printCHarFreq(s);
	}

	private static void printCHarFreq(String s) {
		
		Map<Character, Integer> charFreq = new LinkedHashMap<Character , Integer>();
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(charFreq.containsKey(ch)) {
				charFreq.put(ch, charFreq.get(ch) + 1);
			}else {
				charFreq.put(ch, 1);
			}
		}
		
		Set<Entry<Character, Integer>> es = charFreq.entrySet();
		
		
		for(Entry<Character , Integer> entry : es) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
	}
}
