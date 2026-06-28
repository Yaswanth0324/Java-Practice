package helloworld;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		fibonacciSeries(n);
	}

	private static void fibonacciSeries(int n) {
		int start = 0;
		int last = 1;
		
		for(int i=0;i<n;i++) {
			System.out.print(start + " ");
			int sum = start+last;
			start = last;
			last = sum;
			
		}
	}
}
