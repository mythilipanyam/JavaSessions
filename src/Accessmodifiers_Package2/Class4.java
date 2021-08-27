package Accessmodifiers_Package2;

import Accessmodifiers_Package1.ClassA;

//Different package-non sub class-public variables and methods are accessible
//Different package-non sub class-private,protected and default variables and methods are not accessible

public class Class4 {

	public static void main(String[] args) {
		
		ClassA c4=new ClassA();
		//System.out.println(c3.age);//private variable-not accessible
		//System.out.println(c3.city);//Default variable-not accessibile
		System.out.println(c4.name);
		//System.out.println(c4.salary);//protected variable-not accessible
		c4.addition();
		//c3.substraction();//private method-not accessible
		//c3.multiplication();//protected method-not accessible
		//c3.division();//Default method-not accessibile
		

	}

}
