package exceptionhandling;
import java.util.Scanner;

public class simple1 {
	public static void main(String[] args) {
		try {
			   Scanner sc = new Scanner(System.in);
			   System.out.print("Enter a NUmber:" );
			   int num = sc.nextInt();
			// user enters a string -> InputMismatchException
			} catch (Exception e) {
			   System.out.println(e);
			}

		finally {
			System.out.println("executed successfully");
		}
	}

}
