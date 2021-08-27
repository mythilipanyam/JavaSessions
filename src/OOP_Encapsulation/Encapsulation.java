package OOP_Encapsulation;

public class Encapsulation {
	
//public methods or variables can be accessed outside the class by creating an object of the class
	//private variables or methods can not be accessed outside of the class by creating an object
	//user will not have direct access to the private variables or method
	//user can access the private variables or methods via a public layer
	//the process of accessing the private variables and methods through public methods is called encapsulation
	//in the below example, the variables salary and age are private but these can be accessed outside of the class through public methods like getters and setters.
	// Constructors will act as setters in the below example
	//encapsulation can be achieved by constructors also
	
	
	//employee info
 public String name;
 private double salary;
 private int age;
 
 
 
 public Encapsulation(String name, double salary, int age) {
	this.name = name;
	this.salary = salary;
	this.age = age;
}
public String getName() {
	return name;
}
//public void setName(String name) {
	//this.name = name;
//}
public double getSalary() {
	return salary;
}
//public void setSalary(double salary) {
//	this.salary = salary;
//}
public int getAge() {
	return age;
}
//public void setAge(int age) {
//	this.age = age;
//}
 
 
}
