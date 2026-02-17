package java2;

/*class parent1{
	final void show() {
		System.out.println("final method");
	}
}
//class child extends parent{
//	void show() {        //shows error because final method cannot override
//		 
//	}
//}
public class final1{
	public static void main(String[] args) {
		parent1 a = new parent1();
		a.show();
	}
}*/

final class per{
	void show() {
		System.out.println("final class");
	}
}
//class chil extends per{
//	 shows error because The type chil cannot subclass the final class per
//}
public class final1{
	public static void main(String[] args) {
		per a= new per();
		a.show();
	}

}
//public class final1 {
//	final int a=10;
//	int b=20;
//	void show() {
//		System.out.println(a+b);
//	}
//	public static void main(String[] args) {
//		final1 d=new final1();
//		d.show();
//	//	System.out.println(d.a=30);       shows error because final variable
//		System.out.println(d.b=30);
//	}
//
//}
