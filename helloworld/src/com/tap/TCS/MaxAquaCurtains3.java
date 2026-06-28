package com.tap.TCS;

import java.util.Scanner;

public class MaxAquaCurtains3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		int n = sc.nextInt();

		System.out.println(countOfAquaCurtains(str , n));
	}

	private static int countOfAquaCurtains(String str, int n) {
		int max = 0 ;
		for(int i=0;i<str.length();i += n) {
			int count  = 0;
			
			for (int j = i;j<i+n && j < str.length(); j++) {
				if(str.charAt(j) == 'a') count++;
			}
			
			max = Math.max(max, count);
			
		}
		return max;
		
	}
}
