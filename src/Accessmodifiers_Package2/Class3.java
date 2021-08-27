package Accessmodifiers_Package2;

import Accessmodifiers_Package1.ClassA;

//Different package-child class-public and protected variables and methods are accessible
//Different package-child class-private and default variables and methods are not accessibile
public class Class3 extends ClassA{

	public static void main(String[] args) {
		
		Class3 c3=new Class3();
		ClassA a=new ClassA();
		//System.out.println(c3.age);//private variable-not accessible
		//System.out.println(c3.city);//Default variable-not accessibile
		System.out.println(c3.name);
		System.out.println(c3.salary);
		c3.addition();
		//c3.substraction();////private method-not accessible
		c3.multiplication();
		//c3.division();//Default method-not accessibile
		

	}

}
