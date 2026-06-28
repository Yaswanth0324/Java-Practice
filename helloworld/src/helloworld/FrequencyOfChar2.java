package helloworld;

import java.util.HashMap;
import java.util.Scanner;

public class FrequencyOfChar2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String n = sc.nextLine().toLowerCase();
		
		printFrequencyOfChar(n);
	}

	private static void printFrequencyOfChar(String str) {
		
		HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println(map);
		
		
		
	}
}
