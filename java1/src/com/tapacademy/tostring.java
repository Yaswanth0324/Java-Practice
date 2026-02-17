package com.tapacademy;

import java.util.Arrays;

class parent31{
	int id=20;
	String name="yash";
	
	@Override
	public String toString() {
		return "parent31[id: " + id + " , name: "+ name + "]";
		
	}
	
}
public class tostring {
	public static void main(String[] args) {
		String s = "Java";
		int arr[] = {10,20,30};
		System.out.println(s);
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		parent31 p = new parent31();
		System.out.println(p);
	}
}
