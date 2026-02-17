package abstraction1;

public abstract class bankAccount implements transaction{
	String accountholder;
	double balance;
	bankAccount(String name ,double intialBalance ){
		this.accountholder=name;
		this.balance=intialBalance;
	}
	void showBalance() {
		System.out.println(accountholder + " balance is : " + balance);
	}
	abstract void calcInterest();
}
