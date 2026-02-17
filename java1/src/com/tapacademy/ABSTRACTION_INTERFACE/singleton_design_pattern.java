package com.tapacademy.ABSTRACTION_INTERFACE;

class Singleton{

	//	static Singleton st = new Singleton();
	//	                                           //eager loading
	//	private Singleton() {            
	//		
	//	}
	//	
	//	public static Singleton getSingleton() {
	//		return st;
	//		
	//	}

	static Singleton st;
                                   //lazy loading
	private Singleton(){

	}
	public static Singleton getSingleton() {
		if(st==null) {
			st=new Singleton();
		}
		return st;
	}



}
	public class singleton_design_pattern {
		public static void main(String[] args) {
			Singleton st = Singleton.getSingleton();
			System.out.println(st);
			Singleton st1 = Singleton.getSingleton();
			System.out.println(st1);
			Singleton st2 = Singleton.getSingleton();
			System.out.println(st2);
			Singleton st3 = Singleton.getSingleton();
			System.out.println(st3);
		}
	}
