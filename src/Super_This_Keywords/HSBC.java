package Super_This_Keywords;

public class HSBC extends Bank {
	
	//'super' keyword points to the parent class object
	//'this' keyword points to the current class object
	//super keyword can be used to access the parent class variables and parent class methods
	//super keyword can be used inside the child class constructor to call the parent class constructor
	//super keyword should be the first statement in the child class constructor
	
	
	int min_bal=500;
	int min_age=15;
	String customer_name="Chandra";

	public HSBC() {
		System.out.println("HSBC------constr");
	}
	public HSBC(int min_bal) {
		super(200,19);
		this.min_bal=min_bal;
		System.out.println("HSBC------constr" +min_bal);
	}
	
	
	public void showTheBalance() {
		System.out.println("HSBC---showing balance");
		System.out.println(min_bal);
		System.out.println(super.min_bal);
		super.showTheBalance();
		super.account();
		HSBC.account();
		System.out.println(customer_name);
		System.out.println(super.customer_name);
	}
	public static void account() {
		System.out.println("HSBC----Account method");
	}

}
