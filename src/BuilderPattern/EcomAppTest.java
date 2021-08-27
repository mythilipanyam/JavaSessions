package BuilderPattern;

public class EcomAppTest {

	public static void main(String[] args) {
		
		EcomApp ecom1=new EcomApp();
		
		//workflow 1
		ecom1.login("Mythili.Panyam","password")
		.search("Nike")
		.search("tshirt","yellow")
		.addToCart("tshirt")
		.checkOrderInfo("tshirt", 20, 3.50, 2)
		.payment(12345678, 1234)
		.shipment("73 longshots close CM1 7DU")
		.logout();
	System.out.println("--------------------------------------------------");	
		//workflow 2
		ecom1.login("Mp","passwrd")
		.search("kurthi","black")
		.logout();
	System.out.println("--------------------------------------------------");	
	
		//workflow 3
		ecom1.login("mythili","123456")
		.logout();

	}

}
