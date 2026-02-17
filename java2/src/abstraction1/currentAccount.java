package abstraction1;

public class currentAccount extends bankAccount {

	currentAccount(String name, double balance) {
		super(name, balance);
		
	}
	public void deposit(double amount) {
		balance +=amount;
		System.out.println(amount + " is deposited to your account");
	}
	public void withdraw(double amount) {
		if (balance>=amount) {
			balance-=amount;
			System.out.println(amount + " is withdrawn from your account");
		}else {
			System.out.println("insufficient balance");
		}
	
	}
	@Override
	void calcInterest() {
		
		System.out.println( " interest isn't added to currentAccount");
	}
	public static void main(String[] args) {
		currentAccount ca = new currentAccount("Yash", 5000);
		ca.deposit(500);
		ca.withdraw(750);
		ca.calcInterest();
	}

}
