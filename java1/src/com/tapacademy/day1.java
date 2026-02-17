package com.tapacademy;

public class day1 {
	public static void main(String[] args) {
		int x=001, y=010, z=100;
		int res= --x + y++ - z-- - --z + ++y - --x + y-- - --x;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(res);
	}

}
