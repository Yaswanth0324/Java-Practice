package java2;

public class method {
	static void myMethod() {
		System.out.println("hlo world");
	}
	static void meth(int age,String name) {
		System.out.println("i am "+ name+" my age is "+age);
	}
	static void meth1(int age) {
		if(age<18){
			System.out.println("not eligible to vote");
		}else if(age==18){
			System.out.println("perfect age to vote");
		}else {
			System.out.println("you are eligible to vote");
		}
	}
	static int add(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		myMethod();
		meth(21,"yash");
		meth1(15);
		meth1(18);
		meth1(21);
		System.out.println(add(20,30));
	}

}
