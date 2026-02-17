package java2;

//interface A {
//    void methodA();
//}
//
//interface B extends A {
//    void methodB();
//}
//
//public class interf implements B {
//    public void methodA() {
//        System.out.println("methodA ");
//    }
//
//    public void methodB() {
//        System.out.println("methodB ");
//    }
//
//    public static void main(String[] args) {
//        interf obj = new interf();
//        obj.methodA();
//        obj.methodB();
//    }
//}

//interface interf1{
//	int a=10;
//	int b=20;
//	 
//}
//public class interf implements interf1 {
//	void find(int c) {
//		if(c>=a && c<=b) {
//			System.out.println("c is in between a and b");
//
//		}else {
//			System.out.println("c is not in between a and b");
//		}
//	}
//	public static void main(String[] args) {
//		interf d=new interf();
//		d.find(12);
//		d.find(22);
//	}
//}
 interface interf1 {
	public void home();
	static void rcc() {
		System.out.println("this is Rcc house");
	}
	default void villa() {
		System.out.println("this is a Villa");
		duplex();
		
	}
	private static void duplex() {
		System.out.println("This is a Duplex");
	}

}
public class interf implements interf1{

	@Override
	public void home() {
		// TODO Auto-generated method stub
		System.out.println("Which house you build?");
	}
	public static void main(String[] args) {
		interf c=new interf();
		c.home();
		interf1.rcc();
		c.villa();
		
	}	
	
}
