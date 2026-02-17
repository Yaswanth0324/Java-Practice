package arrays_strings;

//public class jagarr {
//	public static void main(String[] args) {
//		int[][] a = {
//				{1,2},{3,4,5},{2}
//				
//		};
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a[i].length;j++) {
//				System.out.print(a[i][j] + "  ");
//
//			}
//			System.out.println();
//
//		}
//	}
//}
import java.util.Scanner;

public class jagarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int[][] jagged = new int[rows][];

        for (int i = 0; i < rows; i++) {
            System.out.print("Enter number of columns in row " + i + ": ");
            int cols = sc.nextInt();
            jagged[i] = new int[cols];

            for (int j = 0; j < cols; j++) {
                System.out.print("Enter value at [" + i + "][" + j + "]: ");
                jagged[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nJagged Array Output:");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

