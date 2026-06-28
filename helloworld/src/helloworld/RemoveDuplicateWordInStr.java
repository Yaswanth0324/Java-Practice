package helloworld;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicateWordInStr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		removeDuplicates(str);
	}

	private static void removeDuplicates(String str) {
		ArrayList<String> list = new ArrayList<>(NumberOfWords(str));
		
		String t = "";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' ') {
				t += str.charAt(i);
			}else{
				if(t.length() > 0 && !list.contains(t)) {
					list.add(t);
				}	
				t = "";
			}
				
			
			
		}
		
		if(t.length() > 0 && !list.contains(t)) {
			
			list.add(t);
			
		}
		
		for(Object obj : list) {
			System.out.println(obj);
		}
		
		
	}

	private static int NumberOfWords(String str) {
		int count = 0;
		String t = "";
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' ') {
				t += str.charAt(i);
			}else {
				if(t.length() > 0) {
					count++;
				}
				t = "";
			}
		}
		
		if(t.length()>0) {
			count++;
		}
		
		return count;
	}
}
