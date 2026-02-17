package poly_encap;


class payment{
	void pay(double amount) {
		System.out.println(amount + " paid using cash");	
	}
	void pay(double amount , String cardType) {
		System.out.println(amount + " paid using " + cardType);
	}
	void pay(double amount, String upiId,boolean IsUPI) {
		System.out.println(amount + " paid using " + upiId + " UPIID");
	}
}
public class poly1overload {
	public static void main(String[] args) {
		payment a = new payment();
		a.pay(2000);
		a.pay(3000,"debit card");
		a.pay(32000,"yash@2403",true);
		
	}

}
