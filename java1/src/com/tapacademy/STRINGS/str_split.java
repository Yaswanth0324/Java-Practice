package com.tapacademy.STRINGS;

import java.util.Arrays;
import java.util.StringTokenizer;

public class str_split {
	public static void main(String[] args) {
		String s = "Tap Academy";
		String[] arr =s.split(" ");
		for(String s1:arr) {
			System.out.println(s1);
		}
		
		System.out.println(Arrays.toString(arr));
		 StringTokenizer st = new StringTokenizer(s , " ");
		 while(st.hasMoreElements()) {
			 System.out.println(st.nextToken());
		 }
		
		String s1 = "Yahs]/zbzhhhbdhe";
		 String[] s2 = s1.split("]/+");
		 for(String arr1:s2) {
			 System.out.println(arr1);
		 }
		
		
		
	}	
	
	
}
