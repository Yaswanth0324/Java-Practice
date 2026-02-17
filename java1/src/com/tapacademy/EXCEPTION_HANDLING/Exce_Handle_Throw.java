package com.tapacademy.EXCEPTION_HANDLING;


class Major{
	void voteEligible(int age) throws Exception {
		if(age<18) {
			throw new Exception("Age must be 18+");
		}
		System.out.println("Eligible");
	}
}
public class Exce_Handle_Throw {
	public static void main(String[] args) {
		Major m = new Major();
		try {
			m.voteEligible(16);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}
}
