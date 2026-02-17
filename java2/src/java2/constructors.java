package java2;

public class constructors {
	
	constructors(int i){
		System.out.println("jeevan "+i);
	}
	int id;
	String name;
	constructors(int i,String n){
		id=i;
		name=n;
		System.out.println(name + "-" + id);
	}
	constructors(String b){
		name=b;
	}
	constructors(constructors n){
		name=n.name;
	}
	public void display() {
		System.out.println(name);
	}
	public static void main(String[] args) {
		constructors var=new constructors(90);
		constructors var1=new constructors(90,"jeevan");
		constructors var3=new constructors("yash");
		constructors var4=new constructors(var3);
		var3.display();
		var4.display();
	}

}
