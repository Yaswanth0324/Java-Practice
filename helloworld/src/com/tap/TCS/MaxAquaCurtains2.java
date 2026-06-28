package com.tap.TCS;

import java.util.Scanner;

public class MaxAquaCurtains2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		int n = sc.nextInt();

		System.out.println(countOfAquaCurtains(str , n));
	}
	private static int countOfAquaCurtains(String str, int n) {
	    int count = 0;

	    // First window"
	    for(int i = 0; i < n; i++){
	        if(str.charAt(i) == 'a') count++;
	    }

	    int max = count;

	    // Sliding window
	    for(int i = n; i < str.length(); i++){
	        if(str.charAt(i) == 'a') count++;       // add new char
	        if(str.charAt(i - n) == 'a') count--;   // remove old char

	        max = Math.max(max, count);
	    }

	    return max;
	}
	
}
