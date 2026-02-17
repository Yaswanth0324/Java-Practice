package com.tapacademy.ARRAYS;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrMethods {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] a= new int[5];
		System.out.println("Enter numbers: ");
		for(int i=0;i<5;i++) {
			a[i]= sc.nextInt();
		}
		
		int[] b= new int[5];
		System.out.println("Enter numbers: ");
		for(int i=0;i<5;i++) {
			b[i]= sc.nextInt();
		}
		
		//toString method
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		//equals
		System.out.println(a.equals(b));       //check references
		
		//sort
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		
		//copyOf
		int[] copyArr = Arrays.copyOf(a, 4);
		System.out.println(Arrays.toString(copyArr));
		
		//binarySearch
		int index = Arrays.binarySearch(a, 5);
        System.out.println("binarySearch(30): index = " + index);
        
        //asList
        Integer[] arr3 = {1, 2, 3, 4, 5};
        List<Integer> list = Arrays.asList(arr3);
        System.out.println("asList(): " + list);
	}
}
