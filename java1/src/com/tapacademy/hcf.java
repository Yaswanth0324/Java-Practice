package com.tapacademy;
import java.util.Scanner;
public class hcf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the firt number: ");
		int a = sc.nextInt();
		System.out.println("Enter the Second number: ");
		int b = sc.nextInt();
		
		int res = hcf(a,b);
		System.out.println(res);
		
	}
	public static int hcf(int a, int b) {
		if(b==0) {
			return a;
		}
		return hcf(b , a%b);
	}
}
