package com.tapacademy.STRINGS;

import java.util.StringTokenizer;

public class StrTokenizer {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("CoreJAVA ADVJAVA SPRINGBOOT HYBERNATE"," ");
		while(st.hasMoreTokens()) {
			
			System.out.println(st.nextToken());
		}
		
	}
}
