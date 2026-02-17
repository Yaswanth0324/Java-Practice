package abstraction1;

public class savingsAccount extends bankAccount {
	savingsAccount(String name,double balance){
		super(name,balance);
	}
	public void deposit(double amount) {
		balance +=amount;
		System.out.println(amount + "is deposited to your account");
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
		// TODO Auto-generated method stub
		double interest = balance *0.04;
		balance+=interest;
		System.out.println(interest + " interest is added to your account");
		System.out.println("balance in ur account is " + balance);
	}
	public static void main(String[] args) {
		savingsAccount sa = new savingsAccount("Yash", 5000);
		sa.deposit(500);
		sa.withdraw(750);
		sa.calcInterest();
	}
	
}
