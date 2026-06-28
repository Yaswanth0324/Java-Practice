package helloworld;

import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		for (int i = n1; i < n2; i++) {
			if(ArmStrong(i)) {
				System.out.println(i);
			}
		}
		
//		System.out.println(count(n1));
		
	}
	
	private static boolean ArmStrong(int n) {
		int count = count(n);
		int res = 0;
		int originalNum = n;
		while(n > 0) {
			int temp = n % 10;
			
			
			int prod = 1;
			for(int i=1;i<=count;i++) {
				prod = prod * temp;
			}
			res += prod;
			n /= 10;
			
		}
		if(originalNum == res) {
			return true;
		}
		
		return false;
	}


	private static int count(int n) {
		int count=0;
		while(n>0) {
			count++;
			n = n/10;
		}
		return count;
	}
}
