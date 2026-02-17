package java2;

public class calculator1 implements calculator{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int substract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int divide(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}
	public static void main(String[] args) {
		calculator1 c=new calculator1();
		System.out.println("after addition: " + c.add(10, 20));	
		System.out.println("after substarction: " + c.substract(10, 20));	
		System.out.println("after multiplication: " + c.multiply(10, 20));	
		System.out.println("after division : " + c.divide(10, 20));	
	}

}
