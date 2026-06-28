package com.tapacademy.pg.Arrays;

import java.util.Arrays;
import java.util.Scanner;

class Day6{

	public void printCommonElement(int[] ar1, int[] ar2) {
		int i=0 , j=0;
		while(i<ar1.length && j<ar2.length) {
			if(ar1[i] == ar2[j]) {
				System.out.print(ar1[i] + " ");
				i++;
				j++;
			}else if(ar1[i] > ar2[j]) {
				j++;
			}else {
				i++;
			}
		}
	}

	public void printCommonElementInDesc(int[] ar1, int[] ar2) {
		int i=ar1.length-1 , j=ar2.length-1;
		while(i>=0 && j>=0) {
			if(ar1[i] == ar2[j]) {
				System.out.print(ar1[i] + " ");
				i--;
				j--;
			}else if(ar1[i] < ar2[j]) {
				j--;
			}else {
				i--;
			}
		}
	}

	public void printCommonElementInAscDesc(int[] ar1 , int[] ar2) {
		int i=0 , j=ar2.length-1;
		while(i<ar1.length && j>=0) {
			if(ar1[i] == ar2[j]) {
				System.out.print(ar1[i]+" ");
				i++;
				j--;
			}else if(ar1[i] > ar2[j]) {
				j--;
			}else {
				i++;
			}
		}


	}

	public void printSortMergeArray(int[] ar1, int[] ar2, int[] arr) {
		int i=0,j=0,k=0;

		while(i<ar1.length && j<ar2.length) {
			if(ar2[j] <= ar1[i]) {
				arr[k] = ar2[j];
				k++;
				j++;
			}else if(ar2[j] >ar1[i]) {
				arr[k] = ar1[i];
				k++;
				i++;
			}
		
		}
		
		while(j<ar2.length) {
			arr[k] = ar2[j];
			k++;
			j++;
		}
		while(i<ar1.length) {
			arr[k] = ar1[i];
			k++;
			i++;
		}

		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}



	}





}
public class MultipleArray1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n: ");
		int n = sc.nextInt();

		int[]  ar1 = new int[n];
		for(int i=0;i<ar1.length;i++) {
			ar1[i] =sc.nextInt();
		}

		System.out.println("Enter m: ");
		int m = sc.nextInt();

		int[] ar2 = new int[m];
		for(int i=0;i<ar2.length;i++) {
			ar2[i] =sc.nextInt();
		}

		int[] mergedArr = new int[n+m];

		//				for(int i=0;i<ar1.length;i++) {
		//					mergedArr[i] = ar1[i];
		//				}
		//				
		//				for(int i=0;i<ar2.length;i++) {
		//					mergedArr[n+i] = ar2[i];
		//				}
		//				

		//		Arrays.sort(mergedArr);
		//		for(int i=0;i<mergedArr.length;i++) {
		//			System.out.print(mergedArr[i] + " ");
		//		}


		Day6 d6 = new Day6();

//				d6.printCommonElement(ar1,ar2);
		//		d6.printCommonElementInDesc(ar1, ar2);
		//		d6.printCommonElementInAscDesc(ar1, ar2);
		d6.printSortMergeArray(ar1, ar2 , mergedArr);


		sc.close();
	}
}
