package com.tapacademy.POLYMORPHISM;

class Charger{
	private String brand;
	private float volt;
	
	Charger(String brand , float volt){
		this.brand=brand;
		this.volt=volt;
		
	}
	
	public String getBrand() {
		return brand;
	}
	public float getVolt() {
		return volt;
	}
}
class Os{
	private String name;
	private int size;
	
	Os(String name , int size){
		this.name=name;
		this.size=size;
	}
	public String getName() {
		return name;
	}
	public int getSize() {
		return size;
	}
}
class Mobile{
	Os os = new Os("Windows" , 8);
	
	public void hasA(Charger c) {
		System.out.println(c.getBrand() + " " + c.getVolt() );
	}
	
	
}
public class aggre_compos {
	public static void main(String[] args) {
		
		Mobile m = new Mobile();
		System.out.println(m.os.getName() + " " + m.os.getSize());
		Charger c = new Charger("IQOOZ9" , 5);
		m.hasA(c);
		
		m=null;
//		System.out.println(m.os.getName() + " " + m.os.getSize());
		
		System.out.println(c.getBrand() + " " + c.getVolt());
		
		
	}
}
