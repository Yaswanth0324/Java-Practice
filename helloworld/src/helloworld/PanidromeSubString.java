package helloworld;

import java.util.Scanner;

public class PanidromeSubString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		printPalindromicSubString(s);
		
	}
    
	public static void printPalindromicSubString(String s) {
		String t = "";
		int i=0;
		while(i<s.length()) {
			if(s.charAt(i) != ' ') {
				t += s.charAt(i);
				i++;
			}else if(t.length() > 0){
				if(isPalindrome(t)) {
					System.out.println(t);
				}
				i++;
				t= "";
			}else {
				i++;
			}
		}
		if(t.length() > 0) {
			if(isPalindrome(t)) {
				System.out.println(t);
			}
		}
	}

	public static boolean isPalindrome(String t) {
		int start = 0 , last= t.length() - 1;
		while(start < t.length() && last > 0) {
			if(t.charAt(start) != t.charAt(last) ) {
				return false;
			}else {
				start++;
				last--;
			}
		}
		return true;
	}
}
