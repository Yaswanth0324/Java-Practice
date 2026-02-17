package exceptionhandling;

class Bank {
    public static void withdraw(int balance, int amount) {
        try {
            if (amount > balance) {
                throw new ArithmeticException("Insufficient Balance");
            }
            balance -= amount;
            System.out.println("Withdrawal Successful");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class realWorldEx1 {
	public static void main(String[] args) {
		Bank a = new Bank();
		a.withdraw(5000, 7000);
	}

}
