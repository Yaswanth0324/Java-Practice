package exceptionhandling;

class Login {
    static void validate(String username, String password) {
        if (!username.equals("admin") || !password.equals("1234")) {
            throw new IllegalArgumentException("Invalid Login Details");
        }
        System.out.println("Login Successful");
    }
}

public class realWorldEx2 {
	public static void main(String[] args) {
		Login a = new Login();
		try {
			a.validate("admin","123");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
