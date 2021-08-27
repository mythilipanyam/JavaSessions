package Accessmodifiers_Package1;

//Within the same class, all the variables and methods are accessible
//Access modofiers are used only to define the class or global variables and methods
//Access modifiers can not be used to define the local variables
//Main method is always public otherwise JVM will not be able to access the public method

public class ClassA {
	
	public String name="Mythili";
	private int age=40;
	protected double salary=40000.00;
	String city="Chelmsford";
	
	public void addition() {
		System.out.println("this is a public method");
	}
	private void substraction() {
		System.out.println("this is a private method");
	}
	protected void multiplication() {
		System.out.println("this is a protected method");
	}
	 void division() {
		System.out.println("this is a default method");
	}

	public static void main(String[] args) {
		ClassA a=new ClassA();
		System.out.println(a.age);
		System.out.println(a.city);
		System.out.println(a.name);
		System.out.println(a.salary);
		a.addition();
		a.substraction();
		a.multiplication();
		a.division();
	}

}
