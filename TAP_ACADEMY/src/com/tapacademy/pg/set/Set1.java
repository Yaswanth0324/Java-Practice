package com.tapacademy.pg.set;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Set1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
//		SortAndRemoveDup(s);
		
		printOrderPreserveAndSort(s);
		
//		removeDuplicates(s);
		
//		int n = sc.nextInt();
//
//		int[] arr = new int[n];
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		removeDuplicates(arr);
		
		
	}

	private static void printOrderPreserveAndSort(String s) {

		LinkedHashSet<String> lhs2 =new LinkedHashSet<String>();
		
		String[] split = s.split(" ");
		
		for(String word : split) {
			lhs2.add(word);
		}
		
		for(String st : lhs2) {
			System.out.print(st + " ");
		}
		
	}

	private static void SortAndRemoveDup(String s) {
		
		String[] links = s.split(",");
		
		TreeSet<String> ts1 = new TreeSet<String>();
		
//		for(String str : links) {
//			ts1.add(str);
//		}
		
		for(String url : links) {
			String[] split = url.split("\\.");     // . is nor directly work as regular expression , it representrs every char , so we use \\
			ts1.add(split[1]);
		}
		
		for(String url : ts1) {
			System.out.println(url);
		}
	}

	private static void removeDuplicates(int[] arr) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			ts.add(arr[i]);
		}
		
		for(int i : ts) {
			System.out.println(i);
		}
	}

	private static void removeDuplicates(String s) {
		
		LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++) {
			lhs.add(s.charAt(i));
		}
		
		for(Character ch : lhs) {
			System.out.print(ch);
		}
	}
	
}
