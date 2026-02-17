package exceptionhandling;

public class sample5 {
	
	public static void main(String[] args) {
		int i=2;
		int j=0;
		try {
			if(j==0) {
				throw new ArithmeticException("i is not devided by zero");
			}
			System.out.println(i/j);
			
		}
		catch(ArithmeticException e){
			j=i/1;
			System.out.println("reason for  exception : " + e);
			throw e;
		}
		System.out.println(j);
	}

//	public static void valid(int age) {
//		if(age<18) {
//			throw new ArithmeticException("your not eligible to vote");
//		}else {
//			System.out.println("you are eligible to vote");
//		}
//	}
//	public static void main(String[] args) {
//		valid(15);
//		System.out.println("rest of code");
//	}
}
