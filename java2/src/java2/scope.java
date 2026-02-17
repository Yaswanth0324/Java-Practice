package java2;
import java.util.Scanner;
public class scope {
	int a =20;      //instance scope
	int add(int b) {
		return a+b;
	}
	void add() {    //method scope
		int d1=20;
		int e1=30;
		System.out.println(d1+e1);
	}
    void disp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int f1 = sc.nextInt();
		if(f1<20) {
			System.out.println("less than 20");
			
		}else {
			System.out.println("greater than or equal to 20");
		}
	} 
	public static void main(String[] args) {
		scope c = new scope();
		System.out.println(c.add(55));
		c.add();
		//System.out.println(d1+e1);   its shows error because local variables
		c.disp();
		//System.out.println(f1);    can't accessible because block scope
	}
	
}
//public class scope {             //class scope static variables, methods
//	static int a = 10;
//	static void disp() {
//		System.out.println(a);	
//	}
//	static int add(int b) {
//		return a+b;
//		
//	}
//	public static void main(String[] args) {
//		System.out.println(a);	
//		disp();
//		System.out.println(add(20));	
//	
//	}
//
//}
