package exceptionhandling;

import java.lang.reflect.Method;

class bike{
	void ktm() {
		System.out.println("ktm");
	}
}
public class sample7 {
	public static void main(String[] args) {
		try {
			Class.forName("abcdef");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		try {
			Method a = bike.class.getMethod("duke");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
