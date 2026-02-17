package com.tapacademy.MultiThreading;

import java.util.Scanner;

class OneRun extends Thread{
	
	Scanner sc = new Scanner(System.in);
	@Override
	public void run() {
		
		
		String name = getName();
		
		if(name.equals("ADD")){
			add();
		}else if(name.equals("CHAR")) {
			chars();
		}else {
			nums();
		}
		
	}
	
	
	public void add() {
		
		System.out.println("adding started");
		System.out.println("enter first number: ");
		int a = sc.nextInt();
		System.out.println("enter second number");
		int b = sc.nextInt();
		System.out.println(a+b);
		System.out.println("adding completed");
	}

	public void chars() {
		System.out.println("character started");
		for(int i=65;i<=69;i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("characters completed");
	}

	public void nums() {
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
		
		sc.close();
	}
}

public class SingleRunThread {
	public static void main(String[] args) {
		
		OneRun a = new OneRun();
		OneRun b = new OneRun();
		OneRun c = new OneRun();
		
		a.setName("ADD");
		b.setName("CHAR");
		c.setName("NUM");
		
		a.start();
		b.start();
		c.start();
	}
}
