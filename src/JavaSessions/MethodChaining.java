package JavaSessions;

public class MethodChaining {
	
	//non static methods can not be called directly from the static methods -need to create an object to call a non static method from sttaic method
	//but static methods can be called directly from non static methods within the class
	//calling m2 from m1 or s2 from s1 is called method chaining concept
	//method chaining can happen with static methods also and also with non static methods

	public static void main(String[] args) {
		
		MethodChaining c=new MethodChaining();
		c.m1();
		MethodChaining.s1();
		
		
	}
	public void m1() {
		m2();
		MethodChaining.s2();
		s1();//static methods can be called either directly or with the class name
	}
	public void m2() {
		System.out.println("method m2");
	}
	public static void s1() {
		s2();
	}
	public static void s2() {
		System.out.println("static method s2");
	}

}
