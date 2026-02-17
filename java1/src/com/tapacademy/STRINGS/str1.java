package com.tapacademy.STRINGS;

public class str1 {
	public static void main(String[] args) {
		String s1="java";   //inside constant pool
		String s2="java";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		String s3 = new String("Ram");   //outside constant pool
		String s4 = new String("Ram");
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		                             
		System.out.println();
		
		String s5 = new String("java");    //in constant pool duplicates are not allow
		System.out.println(s1 == s5);   //outside of constant pool duplicates are allowed
		System.out.println(s1.equals(s5));
		
		System.out.println();
		
		String s6 = "arjun";
		String s7 = "ARJUN";
		
		System.out.println(s6 == s7);     
		System.out.println(s6.equals(s7));  //compared based on case
		System.out.println(s6.equalsIgnoreCase(s7));   //doesn't compared based on case
		//equalsIgnoreCase is also compare values
		
		System.out.println();
		System.out.println();
		
		String s8 = "Java";
		String s9 = "Python";
		String s10 = s8 + s9;  // if we concztinate using refrences , object will be stored in outside of constant pool
		System.err.println(s10);   //so references are unequal
		String s11 = s8 + s9;
		System.out.println(s10 == s11);
		System.out.println(s10.equals(s11));
		
		System.out.println();
		System.out.println();
		
		String s12 = "Java" + "Python"; // memory will be allocated in constant pool
		String s13 = "Java" + "Python";
		System.out.println(s12 == s13);
		System.out.println(s12.equals(s13));
	
		System.out.println();
		System.out.println();
		String s14 = s8 + "Python"; //if usse of one reference , memory will be allocated in out side of constant pool
		String s15 = "Java" + s9;
		System.out.println(s14 == s15);
		System.out.println(s14.equals(s15));
		
		System.out.println();
		
		String s16 = s8.concat(s9);  //when u use concat() methos , then always memory will be allocated
		String s17 = "Java".concat("Python");  //in outside of constant pool , no matter ref or literal
		System.out.println(s16 == s17);
		System.out.println(s16.equals(s17));
		
		
		
	}
	

}
