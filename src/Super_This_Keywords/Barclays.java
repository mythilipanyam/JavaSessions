package Super_This_Keywords;

public class Barclays {
	
	//this keyword is used to initialise the current class variables
	//this keyword is also used inside the parameterised constructor of the class to call the default constructor
	//this keyword can also be used with methods in builder pattern
	//this keyword always refers to the current class object
	
	String name;
	String city;
	String accountType;
	
	
	public Barclays() {
		this("Chandra","Pune","Savings");
		System.out.println("default constru of Barclays");
	}


	public Barclays(String name, String city) {
		this();//default constructor of the current class will be called
		this.name = name;
		this.city = city;
		System.out.println(name +":"+city);
	}


	public Barclays(String name, String city, String accountType) {
		this.name = name;
		this.city = city;
		this.accountType = accountType;
		System.out.println(name +":"+city+":"+accountType);
	}
	
	
	
	
	
	
	

}
