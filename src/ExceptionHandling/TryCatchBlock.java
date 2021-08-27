package ExceptionHandling;

public class TryCatchBlock {
	//runtime exception is also called as unchecked exception
	//compile time exception is also called as checked exception
	//'Exception' class is the super class of all the exceptions like arithmetic,nullpointer,arrayindexoutofbound..etc
	//'Throwable' is the parent class of 'Exception' class
	//'Throwable' has one more child class called as 'Error Class'
	//Error class and Exception class are siblings
	//Exceptions are common, errors are rare
	//examples of errors are stack overflow error, fatal error
	//one try block can have multiple catch blocks
	
        String name="Mythili";
	public static void main(String[] args) {
		
		int a=10;
		int b=0;
	//	System.out.println(a/b);//Arithmetic exception-runtime exception, also called as unchecked exception
		//Thread.sleep(3000);//compile time exception, also called as checked exception
		
	try{
		TryCatchBlock obj=new TryCatchBlock();
		obj=null;
		System.out.println(obj.name);
		System.out.println(a/b);
	}
	catch(NullPointerException e1) {
		System.out.println("NPE handled");
		e1.printStackTrace();
	}
	catch(ArithmeticException e) {//Instead of ArithmeticException, I can write either Exception or Throwable
		//catch(Exception e)
		//catch(Throwable e)
		System.out.println("AE handled");
		e.printStackTrace();
	}
	System.out.println("hii");
	System.out.println("hii");
	System.out.println("hii");

	}

}
