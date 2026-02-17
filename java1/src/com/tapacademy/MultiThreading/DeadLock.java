package com.tapacademy.MultiThreading;

class Warrior1 extends Thread{
	String res1 = "Bramhastra";
	String res2 = "Nagastra";
	String res3 = "Pashupatastra";
	
	@Override
	public void run() {
		
		String name = getName();
		
		if(name.equals("Arjuna")) {
			arjuna();
		}else {
			karna();
		}
		
	}
	
	public void arjuna() {
		
		try {
			Thread.sleep(3000);
			synchronized(res1) {
				System.out.println("arjun acquired " + res1);
				Thread.sleep(3000);
				synchronized(res2) {
					System.out.println("arjuna aqquired " + res2);
					Thread.sleep(3000);
					synchronized(res3){
						System.out.println("arjuna acquired " + res3);
					}
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void karna() {
		try {
			Thread.sleep(3000);
			synchronized(res3) {
				System.out.println("karna acquired " + res3);
				Thread.sleep(3000);
				synchronized(res2) {
					System.out.println("karna aqquired " + res2);
					Thread.sleep(3000);
					synchronized(res1){
						System.out.println("karna acquired " + res1);
					}
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}

public class DeadLock {
	public static void main(String[] args) {
		Warrior1 wr = new Warrior1();
		Warrior1 wr1 = new Warrior1();
		
		wr.setName("Arjuna");
		wr1.setName("Karna");
		
		wr.start();
		wr1.start();
		
	}
}
