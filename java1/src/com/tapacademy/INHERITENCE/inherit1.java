package com.tapacademy.INHERITENCE;

class Parent{
	float height = 5.8f;
	String assets = "3 acres and 10 laks cash , 1kg gold";
	String NoseStructure="normal";                                 //single inheritance

	void farming() {
		System.out.println("i have  feild with full of water resource");
	}
	void helpingNature() {
		System.out.println("i have a habbit of helping to others");
	}
} 
class child extends Parent{

}


public class inherit1 {
	public static void main(String[] args) {
		child c = new child();
		
		System.out.println(c.height);
		System.out.println(c.assets);
		System.out.println(c.NoseStructure);
		c.farming();
		c.helpingNature();
		System.out.println(c.getClass());

	}
}
