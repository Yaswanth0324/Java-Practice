package com.tapacademy.MultiThreading;
import java.util.Scanner;

//concurrent execution
class Demo11 implements Runnable{
	Scanner sc = new Scanner(System.in);
	@Override
	public void run() {
		
		System.out.println("adding started");
		System.out.println("enter first number: ");
		int a = sc.nextInt();
		System.out.println("enter second number");
		int b = sc.nextInt();
		System.out.println(a/b);
		System.out.println("adding completed");
		
		sc.close();
	}
}
class Demo21 implements Runnable{
	@Override
	public void run() {
		System.out.println("character started");
		for(int i=65;i<=69;i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("characters completed");
	}
}
class Demo31 implements Runnable{
	@Override
	public void run() {
		System.out.println("number started");
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("number completed");
	}
}
public class TheadRunnable {
	public static void main(String[] args) {
		Demo11 d1=new Demo11();
		Demo21 d2 = new Demo21();
		Demo31 d3 = new Demo31();
		
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d2);
		Thread t3 = new Thread(d3);
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println(t1.getName());
	}
}
