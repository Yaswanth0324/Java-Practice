package com.tapacademy.OOPS;

public class local_constr_chain {
	public static void main(String[] args) {
		Login1 l = new Login1("Yaswanth", 7702928135L,"ihruygfy64@");
		System.out.println(l.getName());
		System.out.println(l.getphNo());
		System.out.println(l.getpwd());
		
	}
}

class Login1{
	private String uName ;
	private long phNo;
	private String pwd;
	
	public Login1() {
		uName="Yash";
		phNo=8247302169L;
		pwd = "jgdhev4848";
	}
	public Login1(String uName) {
		this();
		this.uName="IronMan";
	}
	public Login1(String uName , long phNo , String ped) {
		this(uName);
		this.phNo=phNo;
	}

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
