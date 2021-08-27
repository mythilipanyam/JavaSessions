package OOP__Abstractmethods;

public abstract class AppDesign {
// An abstract class can have abstract methods and non abstract methods
//An abstract class object can NOT be created
//An abstract class constructor can be created and it will be called when the object of child class is created
//Top casting is allowed
//Down casting is not allowed even at compile time as the object of abstract class can not be created
//In abstract class when methods are created, we need to add abstract keyword 
//when the object of child class is created, JVM will call parent class constructor first and then child class constructor
//interface--100% abstraction
//abstract class--0% abstraction or partial abstraction or 100% abstarction
//Webdriver is an interface
	
	public AppDesign() {
		System.out.println("parent class--default constructor");
	}

	//Abstract methods
	public abstract void pageLogo();
	
	public abstract void accessibility();
	
	public abstract void usability();
	
	//Non abstract methods
	public static void loginPage(String username, String pwrd) {
		System.out.println("App design---login method "+username+" & "+pwrd);
	}
	
	public final void homePageDesign() {
		System.out.println("App design---homepage design");
	}
	public void pageNavigation() {
		System.out.println("App design--page navigation");
	}
}
