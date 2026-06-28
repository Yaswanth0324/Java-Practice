package helloworld;

import java.util.Scanner;

public class longestWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		
		System.out.println(printLongestWord(str));
	}

	private static String printLongestWord(String str) {
		String longestStr = "" , t = "";
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i) != ' ') {
				t += str.charAt(i);
			}else if(t.length() > longestStr.length()) {
				longestStr = t;
				t = "";
			}else {
				t = "";
			}
		}
		
		if(t.length() > longestStr.length() ) {
			longestStr = t;
		}
		
		
		return longestStr;
	}
}
