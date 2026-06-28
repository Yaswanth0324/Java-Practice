package com.tap.TCS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountSundays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String day = sc.next().toLowerCase();
		int n = sc.nextInt();
		
		System.out.println(PrintNoOfSundays(day , n));
		
		
	}

	private static int PrintNoOfSundays(String day, int n) {
	    Map<String, Integer> map = new HashMap<>();
	    map.put("sun", 0);
	    map.put("mon", 1);
	    map.put("tue", 2);
	    map.put("wed", 3);
	    map.put("thu", 4);
	    map.put("fri", 5);
	    map.put("sat", 6);

	    int start = map.get(day);

	    if (start == 0) {
	        return 1 + (n - 1) / 7;
	    } else {
	        int firstSunday = 7 - start;

	        if (firstSunday > n) return 0;

	        return 1 + (n - firstSunday-1) / 7;
	    }
	}
}
