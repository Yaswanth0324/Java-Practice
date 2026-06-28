package helloworld;

import java.util.Scanner;

public class FrequencyOfChar {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String n = sc.nextLine().toLowerCase();
		
		printFrequencyOfChar(n);
	}

	private static void printFrequencyOfChar(String n) {
		
		int freq[] = new int[26];
		
		for(char ch : n.toCharArray()) {
			if(ch >= 'a' && ch <= 'z') {
				freq[ch - 'a']++;
			}
		}
		
		for (int i = 0; i < freq.length; i++) {
			if(freq[i] > 0) {
				System.out.println((char)(i+'a') + " -- " + freq[i]);
			}
		}
		
		
	}
	
	

}
