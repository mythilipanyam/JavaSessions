package Final_Finally_Finalise;

public class FinallyBlockInterviewQuestion {
	
//return in finally block will override the return of the method
	
	public static int marks(String name) {
		if (name.equals("Mythili")) {
		try {	int a=10/0;
			return 100;
		}catch (ArithmeticException e) {
			System.out.println("AE coming--");
			return -2;
		}
		finally {
			System.out.println("I am in finally block--");
			return 5;
		}
		}
		else if(name.equals("Chandra")) {
			return 90;
		}
		else {
			return -1;
		}
	}

	public static void main(String[] args) {
		
        int m=marks("Mythili");
        System.out.println(m);//overrides the return value of the method and prints '5' that is in finally block
	}

}
