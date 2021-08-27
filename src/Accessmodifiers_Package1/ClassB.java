package Accessmodifiers_Package1;


//Within same package and child class- public,protected and default methods and variables can be accessed
//Within same package and child class-private methods and private variables can not be accessed

public class ClassB extends ClassA{

	public static void main(String[] args) {
		
		ClassB b=new ClassB();
		ClassA a=new ClassA();
		//System.out.println(b.age);-private variable-can not be accessed out side of the class
		System.out.println(b.city);
		System.out.println(b.name);
		System.out.println(b.salary);
		b.addition();
		//b.substraction();--private method-can not be accessed out side of the class
		b.multiplication();
		b.division();
		
}

}
