package helloworld;

import java.util.Scanner;

public class ArmStrong2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		for(int i=n1;i<=n2;i++) {
			if(isArmStrong(i)) {
				System.out.print(i + " ");
			}
		}
		
		
	}

	private static boolean isArmStrong(int n) {
		int count = CountOfDigits(n);
		int arm = 0;
		int last = 0;
		int originalNum = n;
		while(n>0) {
			last = n%10;
			arm += (int)Math.pow(last, count);
			n = n/10;
		}
		
		return originalNum == arm;
		
		
	}

	private static int CountOfDigits(int n) {
		int count = 0;
	
		while(n>0) {
			n = n/10;
			count++;
		}
		return count;
		
		
	}

	

}
