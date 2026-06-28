package helloworld;

import java.util.HashMap;
import java.util.Scanner;

public class SubArrayLengthK {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		
		subArraysWuthSumK(arr , k);
	}
	
	public static void subArraysWuthSumK(int[] arr , int k) {
		
		HashMap<Integer , Integer> map = new HashMap<>();
		
		int prefixSum = 0;
		
		map.put(0,-1);
		
		for(int i=0;i<arr.length;i++) {
			prefixSum += arr[i];
			
			if(map.containsKey(prefixSum - k)) {
				int start = map.get(prefixSum - k) + 1;
				
				for(int j=start;j<=i;j++) {
					System.out.print(arr[j] + " ");
				}
				
				System.out.println();
			}
			
			map.put(prefixSum, i);
		}
		
		
	}
}
