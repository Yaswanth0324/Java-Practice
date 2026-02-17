package java1;

public class typecasting {
	public static void main(String[] args) {
		byte a=20;
		int b=a;
		System.out.println(b);
		System.out.println(((Object)a).getClass().getSimpleName());
		System.out.println(((Object)b).getClass().getSimpleName());
		int c=566;
		byte d = (byte)c;
		System.out.println(d);
		System.out.println(((Object)d).getClass().getSimpleName());
		float e=(float)c;
		System.out.println(e);
		System.out.println(((Object)e).getClass().getSimpleName());
		char f=(char)c;
		System.out.println(f);
		System.out.println(((Object)f).getClass().getSimpleName());
	}

}
