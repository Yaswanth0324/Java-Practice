package exceptionhandling;

public class sample2 {
	public static void main(String[] args) {
		String a=null;
		String b="Pushpa";
	
		try {
		System.out.println(a.length());
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		System.out.println(b);
		try {
		int c=Integer.parseInt(b);
		System.out.println(c);
		}
		catch(Exception ae) {
			System.out.println(ae);
		}
		int d[]=new int[5];
		try {
		System.out.println(d[10]);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
