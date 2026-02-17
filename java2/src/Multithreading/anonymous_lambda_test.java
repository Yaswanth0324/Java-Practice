package Multithreading;

public class anonymous_lambda_test {
	public static void main(String[] args) {
//		Thread t1=new Thread() {    //we can use threads using anonymous classes 
//			//anonymous class is a class without a name that is defined and instantiated in a single statement
//			public void run() {
//				System.out.println("Students thread " + " "+Thread.currentThread().getName() + "   "+ Thread.currentThread().getId());
//
//			}
//		};   
//		t1.start();
//		Runnable r=new Runnable() {   //we can create anonymous classes for both thread and runnable interface
//			public void run() {
//				System.out.println("Students runnable" + " "+Thread.currentThread().getName() + "   "+ Thread.currentThread().getId());
//			}
//		};
//		Thread t2=new Thread(r,"yash@@");  // change the thread name to yash@@
//		t2.start();
		
		
		//using lambda expressions     same examples
		Thread t3 = new Thread( () -> {     // lambda expression cannot be assigned directly to a Thread object.
			System.out.println("Students thread " + " "+Thread.currentThread().getName() + "   "+ Thread.currentThread().getId());
		});
		t3.start();
		Runnable r1=() -> {   //A lambda can be used in place of a Runnable (a functional interface), not directly as a Thread.
			System.out.println("Students runnable" + " "+Thread.currentThread().getName() + "   "+ Thread.currentThread().getId());
		};
		Thread t4 = new Thread(r1,"yash@@");
		t4.start();
	}


}
