package OOP__Abstractmethods;

public class AppTest {

	public static void main(String[] args) {
		
		//child class object creation
		WebApp wapp=new WebApp();
		wapp.accessibility();
		wapp.homePageDesign();
		wapp.pageLogo();
		wapp.usability();
		wapp.webAppDesign();
		wapp.pageNavigation();
		WebApp.loginPage("Mythili", "password");
        AppDesign.loginPage("chandra", "panyam");
        
        System.out.println("-------------------------------------");
        //parent class object creation
        //AppDesign ad1=new AppDesign()----not possible, can NOT create an object of abstract class
        
         //top casting:
        AppDesign ad=new WebApp();
        ad.accessibility();
        ad.homePageDesign();
        ad.pageLogo();
        ad.pageNavigation();
        ad.usability();
        AppDesign.loginPage("Hansika", "Panyam");
	}

}
