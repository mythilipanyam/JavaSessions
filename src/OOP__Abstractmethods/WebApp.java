package OOP__Abstractmethods;

public class WebApp extends AppDesign{
	
	public WebApp() {
		System.out.println("child class-default constructor");
	}
	
//Overridden abstract methods of parent class-inherited methods
	@Override
	public void pageLogo() {
		System.out.println("Webapp---pagelogo");
	}

	@Override
	public void accessibility() {
		System.out.println("Webapp---accissibility");
	}

	@Override
	public void usability() {
		System.out.println("Webapp---usability");
	}
	
	//method hiding
	public static void loginPage(String username, String pwrd) {
		System.out.println("Webapp---login method "+username+" & "+pwrd);
	}
	
	//Inherited overriden non abstract method
	@Override
	public void pageNavigation() {
		System.out.println("Webapp--page navigation");
	}
	
	//Individual method of child class
    public void webAppDesign() {
	System.out.println("webapp---webapp design");
}
	
	

}
