package java2;
//
//class parent{                               //method overriding
//	void show() {
//		System.out.println("parent ni ra nenu");
//	}
//}
//class child extends parent{
//	void show() {
//		super.show();
//		System.out.println("nenu child ni");
//	}
//}
public class overloadingriding {
	
//	public static void main(String[] args) {
//		parent a = new child();
//		a.show();
//	}
//	
//}
	static int add(int a,int b) {   //method overloading
		return a+b;
	}
	static double add(double a,double b) {
		return a+b;
	}
	public static void main(String[] args) {
		int a= add(2,3);
		System.out.println(a);
		double b= add(23.5,655.5);
		System.out.println(b);
	}

}
