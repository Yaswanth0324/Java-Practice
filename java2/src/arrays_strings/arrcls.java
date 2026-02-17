package arrays_strings;

import java.util.Arrays;

public class arrcls {
	public static void main(String[] args) {
		int[] num = {9,5,7,3,4,1,6};
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		String name[] = new String[4];
		Arrays.fill(name,"yash");
		System.out.println(Arrays.toString(name));
		int a[]= {1,4,7};
		int b[]= {2,5,8};
		int c[] = {1,4,7};
		System.out.println(Arrays.equals(a,b));
		System.out.println(Arrays.equals(a,c));
		int original[] = {1,3,5,7,9};
		int copy[] = Arrays.copyOf(original, 7);
		System.out.println(Arrays.toString(copy));
		int bin=Arrays.binarySearch(a, 4);
		System.out.println(bin);
		System.out.println(Arrays.binarySearch(a, 9));
		int i[][]= {{1,2},{3,4}};
		int j[][]= {{5,6},{7,8}};
		int k[][]= {{1,2},{3,4}};
		System.out.println(Arrays.deepEquals(i, k));
		System.out.println(Arrays.deepEquals(i, j));
		


	}


}
