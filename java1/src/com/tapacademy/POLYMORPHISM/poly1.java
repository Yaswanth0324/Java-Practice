package com.tapacademy.POLYMORPHISM;

class Plane{
	void fly() {
		System.out.println("plane flies");
	}
}
class cargoPlane extends Plane{
	@Override
	void fly() {

		System.out.println("cargo plane flies");
	}
	void carryCargo(){
		System.out.println("carries the Goods");
	}
}
class passengerPlane extends Plane{
	@Override
	void fly() {
		System.out.println("passenger plane flies");
	}
	void carryPassengers() {                  //specialized methods
		System.out.println("carries the passengers");
	}
}
class fighterPlane extends Plane{
	@Override
	void fly() {
		System.out.println("fighter plane flies");
	}
	void carryWeapons() {
		System.out.println("carries the weapons");
	}
}

public class poly1 {
	public static void main(String[] args) {
		Plane ref;
		cargoPlane cp = new cargoPlane();
		passengerPlane pp = new passengerPlane();
		fighterPlane fp = new fighterPlane();
		
		ref=cp;
		ref.fly();
		((cargoPlane) ref).carryCargo();
		ref=pp;
		ref.fly();
		((passengerPlane) ref).carryPassengers();     //downcasting
		ref=fp;
		ref.fly();
		((fighterPlane) ref).carryWeapons();
	}
}
