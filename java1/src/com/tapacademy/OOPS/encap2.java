package com.tapacademy.OOPS;

public class encap2 {
	public static void main(String[] args) {
		Login l = new Login("Yash", 8247302169L,"hgyef64eede@");
		System.out.println(l.getName());
		System.out.println(l.getphNo());
		System.out.println(l.getpwd());
		
	}
}

class Login{
	private String uName ;
	private long phNo;
	private String pwd;
	
//	public Login() {
//		                 // this will give default values
//	}
//	
	public Login(String uName , long phNo , String pwd) {
		this.uName = uName;
		this.phNo = phNo;
		this.pwd = pwd;   //this will return values provided inside object
	}
//	public Login() {
//		uName="Yash";     // thius will print values inside this constructor or developer provided values
//		phNo=8247302169L;
//		pwd = "jgdhev4848";
//	}
	public String getName() {
		return uName;
		
	}
	public long getphNo() {
		return phNo;
		
	}
	public String getpwd() {
		return pwd;
		
	}
	
}