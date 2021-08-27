package Accessmodifiers_Package1;

public class ClassC {
	
//Within same package and non sub class- public,protected and default methods and variables can be accessed
//Within same package and non sub class-private methods and private variables can not be accessed

	public static void main(String[] args) {
		
		ClassC c=new ClassC();
		ClassA a=new ClassA();
		//System.out.println(a.age);//private variable-can not be accessed out side of the class
		System.out.println(a.city);
		System.out.println(a.name);
		System.out.println(a.salary);
		a.addition();
		//a.substraction();//private method-can not be accessed out side of the class
		a.multiplication();
		a.division();
		

	}

}
