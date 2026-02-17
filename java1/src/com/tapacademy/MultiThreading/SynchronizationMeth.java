package com.tapacademy.MultiThreading;

class BathRoom{
	synchronized public void use() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		
		try {
			System.out.println(name + " Entered into Bathroom");
			Thread.sleep(3000);
			System.out.println(name + " Stared using Bathroom");
			Thread.sleep(5000);
			System.out.println(name + " Exited from Bathroom");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}

class Boy extends Thread{
	BathRoom br;
	public Boy(BathRoom br) {
		this.br=br;
	}
	
	@Override
	public void run() {
		br.use();
	}
}

class Girl extends Thread{
	BathRoom br;
	public Girl(BathRoom br) {
		this.br=br;
	}
	
	@Override
	public void run() {
		br.use();
	}
}

class Others extends Thread{
	BathRoom br;
	public Others(BathRoom br) {
		this.br=br;
	}
	
	@Override
	public void run() {
		br.use();
	}
}

public class SynchronizationMeth {
	public static void main(String[] args) {
		BathRoom br = new BathRoom();
		
		Boy b = new Boy(br);
		Girl g = new Girl(br);
		Others o = new Others(br);
		
		b.setName("Boy");
		g.setName("Girl");
		o.setName("Others");
		
		b.start();
		g.start();
		o.start();
		
	}
}
