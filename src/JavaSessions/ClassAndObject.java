package JavaSessions;

public class ClassAndObject {
	//The variables declared at class level are class variables or global variables
	//Class is the blue print/template for the object
	//object is the physical entity that is created  from the template
	//objects are always created inside the heap memory and their reference variables are in stack memory
	//class variables or global variables are class data members
	
	
	String name; //default value is null
	int age;  //default value is zero
	char gender;  //default value is space
	double salary;  //default value is 0.0
	boolean permanent;  //default value is false
	
	
   public static void main(String[] args) {
	   
	  //if the variables are declared inside the main method then they are local variables and their scope is just for that method only
	  
	   ClassAndObject cao1=new ClassAndObject(); //cao1 is the reference variable used to refer the object 'ClassAndObject'
	   cao1.name="Chandra";
	   
	   
	   ClassAndObject cao2=new ClassAndObject();
	   cao2.name="Steve";
	   
	   ClassAndObject cao3=new ClassAndObject();
	   cao3.name="Mythili";
	   
	   System.out.println(cao1.name); //Chandra
	   System.out.println(cao2.name); //Steve
	   System.out.println(cao3.name); //Mythili
	   
	   
	   cao1=cao2;
	   System.out.println(cao1.name); //Steve
	   System.out.println(cao2.name); //Steve
	   System.out.println(cao3.name); //Mythili
	   
       cao2=cao3;
       System.out.println(cao1.name); //Steve
       System.out.println(cao2.name); //Mythili
       System.out.println(cao3.name); //Mythili

       cao3=cao1;
       System.out.println(cao1.name); //Steve
       System.out.println(cao2.name); //Mythili
       System.out.println(cao3.name); //Steve  
	   

	}

}
