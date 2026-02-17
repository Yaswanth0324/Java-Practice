package arrays_strings;
import java.util.Scanner;

public class arr1d {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,};
		for(int b : a) {
			System.out.println("a" + (b) + ": "+ b);
		}
		for(int i =0 ; i<a.length ; i++) {
			System.out.println("a"+(i+1) + ": " + a[i]);
			
		}
	}

}
//public class arr1d {
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		System.out.println("number of elements in array : ");
//		int n =sc.nextInt();
//		
//		int a[] = new int[n];
//		System.out.println(n + "elements");
//		
//		for(int i=0;i< n;i++) {
//			a[i]=sc.nextInt();
//		}
//		System.out.println("you enterd is : ");
//		for(int num : a) {
//			System.out.println(num + " ");
//		}
//		sc.close();
//	}
//}
//public class arr1d {
//	public static void main(String[] args) {
//		String name[] = {"yash","lavanya","lalithamma","thippeswamy"};
//		for(String s:name) {
//			System.out.println(s);
//		}
//	
//	}
//}
	
