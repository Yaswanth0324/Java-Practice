package helloworld;

import java.util.Scanner;
//print even index elements from middle of the array to end of the array
public class Demo {
	
	public static void PrintArr(int[] n) {
		
		
		
		for(int i=n.length/2;i<n.length;i++) {
			if(i%2==0) {
				System.out.print(n[i] + " ");
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
//		int[] arr = new int[n];
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = sc.nextInt();
//		}
//		PrintArr(arr);
		
		printPattern1(n);
	}
	
	
	public static void printPattern(int n) {
		for (int i = 0; i < n; i++) {
			for(int k=0;k<n-(i+1);k++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void printPattern1(int n) {
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= n; j++) {
				if(n%2!=0) {
					if (i==1 || i==n || j == n-i+1) {    //z
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}else {
					if (i==1 || i==n || j == (n/2)) {   //v
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
	}
}
