package ExceptionHandling;

//With 'throws' keyword exception is not handled
//with throws keyword exception is passed from one method to another
public class ThrowsKeyword {
	
	public void m1() throws ArithmeticException{
		m2();
	}
    public void m2() throws ArithmeticException{
	    m3();	
	}
    public void m3() throws ArithmeticException {
    	int i=9/0;
		
	}

	public static void main(String[] args)throws ArithmeticException {
		ThrowsKeyword tk=new ThrowsKeyword();
		tk.m1();

	}

}
