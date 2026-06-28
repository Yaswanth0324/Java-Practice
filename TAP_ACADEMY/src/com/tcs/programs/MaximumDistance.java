package com.tcs.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaximumDistance {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of arrays: ");
        int n = sc.nextInt();

        List<List<Integer>> arrays = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter size of array " + (i + 1) + ": ");
            int size = sc.nextInt();

            List<Integer> list = new ArrayList<>();

            System.out.println("Enter elements (sorted): ");
            for (int j = 0; j < size; j++) {
                list.add(sc.nextInt());
            }

            arrays.add(list);
        }

        int result = maxDistance(arrays);

        System.out.println("Maximum Distance: " + result);

        sc.close();
	}

	private static int maxDistance(List<List<Integer>> arrays) {
		int maxVal = arrays.get(0).get(arrays.get(0).size()-1);
		int minVal = arrays.get(0).get(0);
		
		int result = 0;
		for(int i=1;i<arrays.size();i++) {
			List<Integer> list = arrays.get(i);
			
			int curMin = list.get(0);
			int curMax = list.get(list.size()-1);
			
			result = Math.max(result, curMax-minVal);
			result = Math.max(result , maxVal - curMin);
			
			minVal = Math.min(curMin, minVal);
			maxVal = Math.max(maxVal, curMax);
			
			
			
		}
		return result;
	}
}
