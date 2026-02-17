package java2;

class ab {
    void bike() {
        System.out.println("Bike");
    }
}

class bc extends ab {
    void ktm() {
        System.out.println("KTM Bike");
    }
}
class ca extends bc{
	void duke(){
		System.out.println("DUKE Bike");
	}
}
//class ca extends ab{
//	void duke(){
//		System.out.println("DUKE Bike");
//	}
//}
public class inheritance {
    public static void main(String[] args) {
//        bc a = new bc();  
//        a.bike();       
//        a.ktm();     
//    	  ca b =new ca();
//    	  b.ktm();
//    	  b.bike();
//    	  b.duke();
    	  ca a = new ca();
    	  a.bike();
    	  a.duke();
    	  a.ktm();
    	  bc b = new bc();
    	  b.bike();
    	  b.ktm();
    }
}
//interface ab {
//	void bike();
//}
//interface bc extends ab{
//	void ktm();                                                                   
//}
//public class inheritance implements bc{
//
//	@Override
//	public void bike() {
//		// TODO Auto-generated method stub
//		System.out.println("Bike");
//	}
//
//	@Override
//	public void ktm() {
//		// TODO Auto-generated method stub
//		System.out.println(" KTM Bike");
//	}
//	public static void main(String[] args) {
//		inheritance a = new inheritance();
//		a.bike();
//		a.ktm();
//	}
//	
//}

