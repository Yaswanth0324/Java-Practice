package com.tapacademy.INHERITENCE;

class grandParent{
	float height = 5.8f;
	String assets = "3 acres and 10 laks cash , 1kg gold";
	String NoseStructure="normal";                                 //Multi-level inheritance

	void farming() {
		System.out.println("i have  feild with full of water resource");
	}
	void helpingNature() {
		System.out.println("i have a habbit of helping to others");
	}
}
class parent1 extends grandParent{
	
}
class child1 extends parent1{
	
}
class child2 extends parent1{
	
}
class child3 extends parent1{
	
}
public class inherit2 {
	public static void main(String[] args) {
		parent1 p = new parent1();
		System.out.println(p.height);
		System.out.println(p.assets);
		System.out.println(p.NoseStructure);
		p.farming();
		p.helpingNature();
		
		System.out.println();
		System.out.println();
		
		child1 c=new child1();
		System.out.println(c.height);
		System.out.println(c.assets);
		System.out.println(c.NoseStructure);
		c.farming();
		c.helpingNature();
		
	    System.out.println();
	    System.out.println();
	    
	    child2 c2 = new child2();
	    System.out.println(c2.height);
		System.out.println(c2.assets);
		System.out.println(c2.NoseStructure);
		c2.farming();
		c2.helpingNature();
		
		System.out.println();
		System.out.println();
		
		child3 c3 = new child3();
		System.out.println(c3.height);
		System.out.println(c3.assets);
		System.out.println(c3.NoseStructure);
		c3.farming();
		c3.helpingNature();
	    
		
		
	}
}
