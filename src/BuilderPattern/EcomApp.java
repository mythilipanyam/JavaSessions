package BuilderPattern;

public class EcomApp {
	// 'this' keyword can be used in methods also
	//'this' keyword in the methods returns current class object
	
	public EcomApp login(String un,String pwrd) {
		System.out.println("login with "+un+" & "+pwrd);
		//return this;//can written like this also
		return new EcomApp();//can be written like this also
	}
	public EcomApp search(String searchTerm) {
		System.out.println("search with "+searchTerm);
		return this;
	}
	public EcomApp search(String word,String color) {
		System.out.println("search with "+word+ " & "+color);
		return this;
	}
	public EcomApp addToCart(String productName) {
		System.out.println("add the "+productName+" to the cart");
		return this;
	}
	public EcomApp checkOrderInfo(String product,int price, double shippingPrice, int noOfItems) {
		System.out.println("check the order information");
		return this;
	}
	public EcomApp payment(String cc,int pin){
		System.out.println("Do payment with "+cc+" & "+pin);
		return this;
	}
	public EcomApp payment(long phoneNumber,int otp){
		System.out.println("Do payment with "+phoneNumber+" & "+otp);
		return this;
	}
	public EcomApp shipment(String shippingAddress) {
		System.out.println("Shipping to the "+shippingAddress);
		return this;
	}
	public EcomApp logout() {
		System.out.println("logged out");
		return this;
	}
	
}
