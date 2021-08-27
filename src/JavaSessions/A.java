package JavaSessions;

public class A {
	
	//B-main method is called in class A
	//A-main method is called in class B
	//whenever two methods are called back to back, it will generate an infinite loop and will throw 'StackOverflowError'

	public static void main(String[] args) {
		System.out.println("A-main method");
		B.main(args);

	}

}
