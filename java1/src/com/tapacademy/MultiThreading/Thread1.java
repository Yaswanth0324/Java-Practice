package com.tapacademy.MultiThreading;
import java.util.*;

//concurrent execution
class Demo1 extends Thread{
	
	Scanner sc = new Scanner(System.in);
	@Override
	public void run() {
		
		System.out.println("adding started");
		System.out.println("enter first number: ");
		int a = sc.nextInt();
		System.out.println("enter second number");
		int b = sc.nextInt();
		System.out.println(a+b);
		System.out.println("adding completed");
		
		sc.close();
	}
}
class Demo2 extends Thread{
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
class Demo3 extends Thread{
	@Override
	public void run() {
		System.out.println("number started");
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}

		System.out.println("number completed");
	}
}
public class Thread1 {
	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		Demo2 d2=new Demo2();
		Demo3 d3=new Demo3();
 //if we call run() , then its run sequentially
		d1.start();
		d2.start();
		d3.start();
	}
}
