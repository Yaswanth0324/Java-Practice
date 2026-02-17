package Multithreading;

public class lifecycle_thread_test {

	public static void main(String[] args) throws InterruptedException {
		Thread t3 = new Thread( () -> {     // lambda expression cannot be assigned directly to a Thread object.
			for(int i=0;i<5;i++) {
				System.out.println("Students thread " + " "+Thread.currentThread().getName() + "   "+ Thread.currentThread().getId());
			}
		});
		
		Runnable r1=() -> {   //A lambda can be used in place of a Runnable (a functional interface), not directly as a Thread.
			for(int i=0;i<10;i++) {
				System.out.println("Students runnable" + " "+Thread.currentThread().getName() + "   "+ Thread.currentThread().getId());
			}
		};
		Thread t4 = new Thread(r1,"yash@@");
		System.out.println(t4.getState());

		t3.start();
		System.out.println(t3.getState());
		t3.sleep(1000);
		
		t4.start();
		System.out.println(t4.getState());
//		t4.join();

		
		
		System.out.println(t3.getState());
		t4.sleep(1000);
		System.out.println(t4.getState());
//		t3.start();
	}

}
