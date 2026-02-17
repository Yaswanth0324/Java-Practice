package com.tapacademy.INHERITENCE;

class animal{
	void breath() {
		System.out.println("animal take breath to live");
	}
	void eat() {
		System.out.println("animal collect food to eat");
	}
	void sleep() {
		System.out.println("animal sleep 6 hrs per day");
	}
}
class Deer extends animal {
	void eat() {
		System.out.println("deer only eat leafs and grass");
	}
	void sleep() {
		System.out.println("deer sleep 7 hrs per day");
	}
	void grunting() {
		System.out.println("Grunting is one of the most common noises that deer make");
	}
	void running() {
		System.out.println("deer capable of running speed 50 kmph");
	}
}
class Lion extends animal{
	void breath() {
		System.out.println("Lions breath....");
	}
	void eat() {
		System.out.println("Loins likes eating non-veg food");
	}
	void roar() {
		System.out.println("Loin Roars Loudly .......");
	}
}
class Monkey extends animal{
	void jump() {
		System.out.println("monkey jumps easily from one tree to another");
	}
	void sound() {
		System.out.println("monkey makes sounds like scream, chatter, gecker, howl");
	}
	void live() {
		System.out.println("monkey lives in forests, villages , houses ....");
	}
}
public class inherit_meth1 {
	public static void main(String[] args) {
		Deer d = new Deer();
		d.breath();
		d.eat();
		d.sleep();
		d.grunting();
		d.running();
		System.out.println("-----------------------------------------------------------------");
		
	    Lion l= new Lion();
		l.breath();
		l.eat();
		l.sleep();
		l.roar();
		System.out.println("-----------------------------------------------------------------");
		
	    Monkey m = new Monkey();
		m.breath();
		m.eat();
		m.sleep();
		m.jump();
		m.sound();
		m.live();
		System.out.println("-----------------------------------------------------------------");
	    
		
	}
}
