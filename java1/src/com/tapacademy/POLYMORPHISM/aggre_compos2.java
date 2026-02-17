package com.tapacademy.POLYMORPHISM;

class Bird{
	private String name;
	private int age;
	
	public Bird(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
class Mammal{
	private String name;
	private String breed;
	
	Mammal(String name,String breed){
		this.name=name;
		this.breed=breed;
	}
	public String getName() {
		return name;
	}
	public String getBreed() {
		return breed;
	}
}
class Animal{
	private Bird bird;
	
	Animal(){
		bird=new Bird("crow" , 2);
	}
	public Bird getBird() {
		return bird;
	}
	void hasA(Mammal m ) {
		System.out.println(m.getName() + " " + m.getBreed());
	}
}

public class aggre_compos2 {
	public static void main(String[] args) {
		Animal a = new Animal();
		
		System.out.println(a.getBird().getName() + " " + a.getBird().getAge());
		 
		Mammal m= new Mammal("Cow" , "jersey");
		a.hasA(m);
	}
}
