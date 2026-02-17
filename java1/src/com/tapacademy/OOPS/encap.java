package com.tapacademy.OOPS;
class deposit{
	private String name;
	private int amount;
	private int accountNum;
	public void setAccount(String x,int y, int z) {
		name = x;
		amount = y;
		accountNum = z;
	}
	public String getName() {
		return name;
	}
	public int getamount() {
		return amount;
	}
	public int getACN() {
		return accountNum;
	}
	
	
}


public class encap{
	public static void main(String[] args) {
		deposit dp = new deposit();
		dp.setAccount("Yash", 1000 , 48455480);
		System.out.println(dp.getName());
		System.out.println(dp.getACN());
		System.out.println(dp.getamount());
		
	}
}
