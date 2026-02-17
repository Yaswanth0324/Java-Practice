package arrays_strings;
import java.util.Scanner;

//public class arr2d {
//	public static void main(String[] args) {
//		String[][] name= {
//				{"hulk","superman","spiderman"},
//				{"ironman","thor","antman"}
//		};
//		for(int i=0;i<name.length;i++) {
//			for(int j=0;j<name[i].length;j++) {
//				System.out.println(name[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
//	}
//
//}
public class arr2d{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rows number :");
		int a = sc.nextInt();
		System.out.println("enter cols number :");
		int b=sc.nextInt();
		
		int c[][] = new int[a][b];
		
		System.out.println("ENter elements for matrix :" );
		
		for(int i=0; i<a;i++) {
			for(int j=0;j<b;j++) {
				System.out.print("Element at [" + i + "][" + j + "]: ");
				c[i][j]=sc.nextInt();

			}
		}
		System.out.println("\nthe array elements are : ");
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				System.out.println(c[i][j] + " ");

			}
			System.out.println();

		}
		
		sc.close();

		
	}

}
