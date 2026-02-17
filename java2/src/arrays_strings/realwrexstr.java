package arrays_strings;


public class realwrexstr {
	public static void main(String[] args) {
		//email validation
		String email="yash95632@gmail.com";
		if(email.endsWith("@gmail.com")) {
			System.out.println("valid email id : " +email);

		}else {
			System.out.println("email id is not valid pls re enter ");

		}

	
	//splitting csv data
	String employ="yash,21,frontend developer";
	String[] data=employ.split(",");
	System.out.println("name : "+data[0] );
	System.out.println("age : "+data[1] );
	System.out.println("role : "+data[2] );
	
	//username check
	
	String name = "     yash  ";
	if(!name.trim().isEmpty()) {
		System.out.println("Welcome "+name.trim());

	}else {
		System.out.println("name is empty");

	}
	
	//password case sensitivity
	
	String pass="MBu123";
	if(pass.equals("mbu123")){   //also use equalsIgnoreCase 
		System.out.println("password matched welcome to your page");
	}else {
		System.out.println("password does not match re enter the password");

	}
	
	
	//search feature
	
	String artcle="java is programming language";
	if(artcle.contains("java")) {
		System.out.println("Key word found");
	}else {
		System.out.println("there is no java in the artcle");

	}
	
	//auto correcting or formatting
	
	String pass1="MBu123";
	if(pass1.toLowerCase().equals("mbu123")){   //also use equalsIgnoreCase 
		System.out.println("password matched welcome to your page");
	}else {
		System.out.println("password does not match re enter the password");

	}
	
	
	//character level security check
	
	String passw="admin123";
	char[] c=passw.toCharArray();
	for(char d:c) {
		if(Character.isDigit(d)) {
			System.out.println("password contains digit");
			break;

		}
	}
	
	
	
	
	}
	

}
