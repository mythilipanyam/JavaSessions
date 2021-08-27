package ExceptionHandling;

public class ThrowKeyword {
	//Throw keyword is used to declare our own exceptions
//use case is: when we are fetching data from some files and if data is not found then this exception can be declared
	public static void main(String[] args) {
		
		String data=null;
		if (data==null) {
		try {
		throw new Exception("NODATAFOUNDEXCEPTION");
		}catch(Exception e) {
			System.out.println("data not found");
			e.printStackTrace();
		}
 }else {
	 System.out.println("data found");
 };

}}
