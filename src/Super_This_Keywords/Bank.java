package Super_This_Keywords;

public class Bank {
	
	int min_bal=100;
	int min_age=18;
	static String customer_name="Mythili";
	
	
	
	public Bank() {
		System.out.println("Bank------constr");
	}
	public Bank(int min_bal) {
		this.min_bal=min_bal;
		System.out.println("Bank------constr" +min_bal);
	}

	public Bank(int min_bal, int min_age) {
		this.min_bal = min_bal;
		this.min_age = min_age;
		System.out.println("Bank---constructor"+min_bal+"&"+min_age);
	}

	public void showTheBalance() {
		System.out.println("Bank---showing balance");
	}
	
	public static void account() {
		System.out.println("Bank----Account method");
	}

}
