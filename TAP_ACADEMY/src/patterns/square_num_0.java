package patterns;

import java.util.Scanner;

public class square_num_0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		int m =1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(m<10) {
					System.out.print("0");
				}
				System.out.print(m+" ");
				m++;
			}
			System.out.println();
		}
	}
}
