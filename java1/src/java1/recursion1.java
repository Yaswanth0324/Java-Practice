package java1;

//public class recursion1 {
//	
//	   public static int factorial(int n) {
//		   if(n==0 || n==1) {
//			   return 1;
//		   }else {
//			   return n * factorial(n-1);
//		   }
//		   
//	   }
//	   public static void main(String[] args) {
//		   System.out.println("factorial of 4: " + factorial(4));
//	   }
//}
public class recursion1 {
	
 public static int sum(int n) {
     if (n == 1) return 1;
     return n + sum(n - 1);
 }

 public static void main(String[] args) {
     System.out.println("Sum of first 5 numbers: " + sum(5));
 }

}
