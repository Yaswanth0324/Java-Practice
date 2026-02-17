package com.tapacademy.INHERITENCE;

class plane{
	void takeOff() {
		System.out.println("plane takeoff....");
	}
	void fly() {
		System.out.println("plane takeoff....");
	}
	void land() {
		System.out.println("plane land....");     //inherited methods
	}
}
class passengerPlane extends plane{         
	void fly() {
		System.out.println("passenegr plane fly.......");   //overriden method
	}
	void carryPassenger() {
		System.out.println("this plane carries passengers......");     //specialized method
	}
}
class cargoPlane extends plane{
	void fly() {
		System.out.println("cargo plane fly.....");
	}
	void carryGoods() {
		System.out.println("this plane carries Goods.....");
	}
}
class fighterPlane extends plane{
	void fly(){
		System.out.println("fighter plane fly......");
	}
	void carryWeapons() {
		System.out.println("this plane carries weapons");
	}
}
public class inherit_meth {
	public static void main(String[] args) {
		passengerPlane p = new passengerPlane();
		p.takeOff();
		p.fly();
		p.land();
		p.carryPassenger();
		
		System.out.println();
		
		cargoPlane c = new cargoPlane();
		c.takeOff();
		c.fly();
		c.land();
		c.carryGoods();
		
		System.out.println();
		
		fighterPlane f = new fighterPlane();
		f.takeOff();
		f.fly();
		f.land();
		f.carryWeapons();
		
	}
}
