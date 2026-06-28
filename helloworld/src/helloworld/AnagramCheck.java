package helloworld;

import java.util.Scanner;

public class AnagramCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		
		System.out.println((isAnagram(str1,str2)) ? "Anagram":"Not anagram");
		
	}

	public static boolean isAnagram(String str1, String str2) {
		if(str1.length() != str2.length()) return false;
		
		int[] count = new int[26];
		for (int i = 0; i < str1.length(); i++) {
			count[str1.charAt(i) - 'a']++;
			count[str2.charAt(i) - 'a']--;
		}
//		for (int i = 0; i < str2.length(); i++) {
//			count[str2.charAt(i) - 'a']--;
//		}
		
		for(int c : count) {
			if(c != 0) {
				return false;
			}
		}
		
		return true;
	}
}
