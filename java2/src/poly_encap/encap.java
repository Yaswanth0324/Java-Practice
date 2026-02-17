package poly_encap;

public class encap {
	private String itemName;
	private double price;
	private boolean isVegeterian;
	private boolean isNonVegeterian;
	public encap(String name,double price,boolean isVegeterian, boolean isNonVegeterian) {
		this.itemName=name;
		this.price=price;
		this.isVegeterian=isVegeterian;
		this.isNonVegeterian =isNonVegeterian;
	}
	public String getItemName() {
		return itemName;
	}
	public boolean isNonVegeterian() {
		return isNonVegeterian;
	}
	public boolean isVegeterian() {
		return isVegeterian;
	}
	
	
	
	public double  itemDiscount(double discount) {
		if(discount>0 && discount<=50) { 
			price -= discount;  //price -=(price*discount/100) if u want to calculate discount percentage
			
		}else {
			System.out.println("there is no discount avalaible on this item");
		}
		return discount;
	}
	
	public double getPrice() {
		return price;
	}
	public static void main(String[] args) {
		encap a= new encap("biryani",200,false,true);
		System.out.println("Item name: " + a.getItemName());
		System.out.println("isNonVegeterian: " + a.isNonVegeterian());
		System.out.println("isVegeterian: " + a.isVegeterian());
		
		System.out.println("discount on this item : " + a.itemDiscount(20.0));
		System.out.println("Price Of The item : " + a.getPrice());
		
	}
	
	
	

}
