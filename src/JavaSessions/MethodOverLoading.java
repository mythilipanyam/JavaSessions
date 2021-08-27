package JavaSessions;

public class MethodOverLoading {
	//Method overloading meaning:
	//occurs within the same with different methods with:
	//1.with same method same
	//2.with different type of parameters
	//3.with different no.of parameters
	//4. with different parameter sequence
	//difference between parameters and arguments: parameters are the ones that are defined when the methods 
	//are declared outside the main method eg:int a, int b: a nd b are parameters
	//Arguments are the actual values that are passed inside the main method for the execution of the methods ex:10, 20
	//method overloading is also called as compile time polymorphism and 
	//method overriding is called as run time polymorphism
	//we are passing the arguments(actual values) for the method execution-thats this is called as call by value
	
	//Examples of method overloading in an ecomm website:
	//log in method:
	public void login() {
		
	}
    public void login(String username, String pwd) {//username and pwd are called as parameters
    	System.out.println("log in with username and paswrd");
		
	}
    public void login(long phnum,String pwd) {
    	System.out.println("log in with ph num and paswrd");
		
	}
    
    //serach method:
    public void serach(String searchTerm) {
    	System.out.println("search with searchterm in all");
    	
    }
    public void serach(int referenceNumber) {
    	System.out.println("search with reference number");
    }
    public void serach(String department,String searchTerm) {
    	System.out.println("search with serachterm in specific department ");
    }
    
    //payment method:
    public void payment(String creditcard, String passcode) {
    	System.out.println("pay with cc and passcode");
    }
    public void payment(String debitcard) {
    	System.out.println("pay with debitcard");
    }
    public void payment(String creditcard, int pin) {
    	System.out.println("pay with cc and PIN");
    }
    
    
    
      public static void main(String[] args) {
    	MethodOverLoading mol=new MethodOverLoading();
    	
    	mol.login("Mythili", "password");//"Mythili" and "password" are arguments and this is called as 'call by value'
    	mol.serach("Baby", "cot");//Baby and cot are arguments
    	mol.payment("123456789012");
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
		}
    

}
