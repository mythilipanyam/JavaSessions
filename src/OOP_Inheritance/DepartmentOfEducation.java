package OOP_Inheritance;

public class DepartmentOfEducation {
//Multilevel inheritance is allowed-child class can inherit the methods from parents and grand parents
//Multiple inheritance is not allowed from class to class
//a child class can not have more than one parent class-this is called diamond problem
//sibling classes can not inherit from each other
//parent class is also called as super class
//child class is also called as sub class
//'extends' keyword is used to create the relationship between parent class and child class
//when parent class has one method and child class also has same method, 
//then the preference is given to the child class method
//method overriding-when we have a method in parent class and as well as in child class 
	//with the same method name and same parameters and same return type then it is called method overriding
	//method overriding can be shown by '@Override' annotation
	//method over riding is called as run time polymorphism or dynamic polymorphism
	//method overloading is called as compile time polymorphism or static polymorphism
	//static methods can NOT be overridden
	//parent class can NOT inherit methods of child class
	//Private methods can NOT be overridden
	//'final'methods can NOT be overridden
	//'final' keyword is used to prevent method over riding
	//if a class is declared as 'final' then it can not be parent class of any other class
	//'final' is used to declare constant variables
	
	public DepartmentOfEducation() {
		System.out.println("grandparent constructor");
	}
	public static void freeEducation() {//static methods can NOT be overridden
		System.out.println("DOE--Free education");
	}
	
	public final void freeMeals() {//final methods can NOT be overridden
		System.out.println("DOE--Free meals");
	}
	
	public int freeBooks() {
		System.out.println("DOE--Free books");
		return 10;
	}

	
	
}
