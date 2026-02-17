package com.tapacademy.MultiThreading;

class BIMU extends Thread{
	@Override
	public void run() {
		System.out.println(currentThread());
		setName("Ramu");
		setPriority(MAX_PRIORITY);
		
		System.out.println(currentThread());
	}
}
public class ThreadInbuiltMeth extends Thread{
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main thread started");
		Thread t = Thread.currentThread();
		System.out.println(currentThread());
		t.setName("YAsh");
		t.setPriority(6);
		System.out.println(currentThread());
		
		BIMU t1 = new BIMU();
		t1.start();
//		t1.join();      without join main thread will be execute first , after that remaining started
		
		
		Thread t2 = new Thread( () -> {
			System.out.println("first lambda function using thread class");
		});
		t2.start();
		
		Runnable r =(() -> {
			System.out.println("lambda function using throwable class");
		});
		Thread t3 =  new Thread(r , "Pushpa");
		System.out.println(t3);
		t3.start();
		System.out.println("main thread ended");
	}
}
