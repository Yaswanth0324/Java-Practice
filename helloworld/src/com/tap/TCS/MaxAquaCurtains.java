package com.tap.TCS;

import java.util.Scanner;

public class MaxAquaCurtains {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int n = sc.nextInt();
		
		System.out.println(countOfAquaCurtains(str , n));
		
	}

	private static int countOfAquaCurtains(String str, int n) {
		int count  = 0;
		for (int i = 0; i < str.length()-n; i++) {
			String t = str.substring(i , i+n);
			int sCount = 0 ;
			for(int j=0;j<t.length();j++) {
				if(t.charAt(j) == 'a') {
					sCount ++;
				}
			}
			if(sCount >= count ) {
				count = sCount;
			}
		}
		
		return count;
	}
}
