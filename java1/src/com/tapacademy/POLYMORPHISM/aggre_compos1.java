package com.tapacademy.POLYMORPHISM;

class Heart{
	private float weight;
	private int bpm;
	
	public Heart(float weight,int bpm) {
		this.weight=weight;
		this.bpm=bpm;
	}
	
	public float getWeight() {
		return weight;
	}
	public int getBpm() {
		return bpm;
	}
}

class Brain{
	private float weight;
	private String color;
	
	public Brain(float weight,String color) {
		this.weight=weight;
		this.color=color;
	}
	public float getWeight() {
		return weight;
	}
	public String getColor() {
		return color;
	}
}

class Bike{
	private String brand;
	private float milage;
	
	Bike(String brand,float milage){
		this.brand=brand;
		this.milage=milage;
	}
	
	public String getBrand() {
		return brand;
	}
	public float getMilage() {
		return milage;
	}
}

class Book{
	private String name;
	private String author;
	
	Book(String name,String author){
		this.name=name;
		this.author=author;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
}

class Student{
	Heart h = new Heart(0.3f,70);
	Brain b = new Brain(1.3f , "grayish-pink");
	
	public void hasA(Bike bike , Book book) {
		System.out.println(bike.getBrand() + " " + bike.getMilage());
		System.out.println(book.getName() + " " + book.getAuthor());
	}
}
public class aggre_compos1 {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.h.getWeight() + " " + s.h.getBpm());
		System.out.println(s.b.getWeight() + " " + s.b.getColor());
		Bike bike = new Bike("KTM" , 30f);
		Book book = new Book("the secret ","Rhonda Byrne");
		s.hasA(bike, book);
		
		s=null;
//		System.out.println(s.h.getWeight() + " " + s.h.getBpm());
//		System.out.println(s.b.getWeight() + " " + s.b.getColor());
		System.out.println(bike.getBrand() + " " + bike.getMilage());
		System.out.println(book.getName() + " " + book.getAuthor());
		
	}
}
