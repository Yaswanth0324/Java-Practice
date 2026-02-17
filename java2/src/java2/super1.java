package java2;

class bike {
	bike(){
		System.out.println("Bike");
	}
}
class ktm extends bike{
	ktm(){
		System.out.println("KTM" );
	}
}
//class abc{
//	abc(String name){
//		System.out.println("parent name : " + name);
//	}
//}
//class bcd extends abc{
//
//	bcd(String name) {
//		super(name);
//		// TODO Auto-generated constructor stub
//		System.out.println("child name : " + name);
//	}
//	
//}
//class pare{
//	int a=20;
//	
//}
//class chil extends pare{
//	void show() {
//		int a=50;
//		System.out.println("child a : " + a);
//		System.out.println("parent a : " + super.a);
//		
//	}
//}
//class par{                               //method overriding
//	void show() {
//		System.out.println("parent ni ra nenu");
//	}
//}
//class chi extends par{
//	void show() {
//		super.show();
//		System.out.println("nenu child ni");
//	}
//}
public class super1 {
	public static void main(String[] args) {
//		chi a = new chi();
//		a.show();
//		chil var = new chil();
//		var.show();
//		bcd a = new bcd("yash");
		ktm a = new ktm();
	}

}
