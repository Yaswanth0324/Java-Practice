package com.tapacademy.EXCEPTION_HANDLING;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exce_Handle {
	public static void main(String[] args) {
		System.out.println("started.................");
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter numerator: ");
			int a = sc.nextInt();
			System.out.println("Enter denominator: ");
			int b = sc.nextInt();
			System.out.println(a/b);

			System.out.println("Enter the size of Array: ");
			int c = sc.nextInt();

			int[] arr = new int[c];
			System.out.println("Enter the data: ");
			int m = sc.nextInt();

			System.out.println("enter the index: ");
			int index = sc.nextInt();
			arr[index] = m;
//			arr=null;           //NullPointerException
			System.out.println(Integer.parseInt("Java"));    //NumberFormatException
			System.out.println(arr[index]);
			sc.close();
		}catch(ArithmeticException e) {
			System.out.println("Do not enter 0 in denominator");
		}catch(NegativeArraySizeException e) {
			System.out.println("there is no negative size in arrays");
		}catch(ArrayIndexOutOfBoundsException e ) {
			System.out.println("arrays index out of size ");
		}catch(InputMismatchException e) {
			System.out.println("Enter correct input");
		}catch(Exception e) {
			System.out.println(e);
		}

		System.out.println("Terminated................");
		
	}
}
