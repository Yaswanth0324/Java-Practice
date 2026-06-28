package abstraction1;


interface demo1{
	void add();
}

interface demo2{
	void add();
}

class demo3 implements demo1 , demo2{

	@Override
	public void add() {
		System.out.println("adding");
		
	}
	
}
public class demo {
	public static void main(String[] args) {
		demo3 d3 = new demo3();
		d3.add();
		demo2 d2 = new demo3();
		d2.add();
		demo2 d1 = new demo3();
		d1.add();
	}
}
