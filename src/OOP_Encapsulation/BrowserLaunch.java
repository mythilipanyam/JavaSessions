package OOP_Encapsulation;

public class BrowserLaunch {
	
	//encapsulation can be done on methods also
	//private methods can be accessed via a public method-below example
	
	public void browserLaunched() {
		click();
		checkRamSpace();
		checkNetworkConnection();
		remainingChecks();
		System.out.println("browserLaunched");
	}
	private void click() {
		System.out.println("user clicked on browser button");
	}
	private void checkRamSpace() {
		System.out.println("Ram space checked");
	}
	private void checkNetworkConnection() {
		System.out.println("network connection checked");
	}
	private void remainingChecks() {
		System.out.println("All the remaining checks were done");
	}

}
