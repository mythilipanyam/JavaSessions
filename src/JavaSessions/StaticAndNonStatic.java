package JavaSessions;

public class StaticAndNonStatic {
	
	//static keyword is used when there are any common variables or common methods
	//Static variables or methods can be called directly or with a class name,we do not need to create an object to call the static variables or methods
	// non static variables or methods can only be called by creating an object
	//within a class, the static variables or methods can be called directly.
	//static variables and static methods are stored in common memory allocation aclled as permanent generation, also called as 'Metaspace'
//permanent generation is a static memory, when this memory is filled it will start throwing stackoverflow errors
	//Metaspace is dynamic memory
	//when static variables or methods are called using the object name, a warning is given
	//main method is always a static method as JVM does not need to create an object for this method
	//main method will be stored in metaspace as it is a static method
	
	//creating static and non static variables
	//for exmple for a car
	String name;//non static variable as its value is different from car to car
	int price;//non static variable as its value is different from car to car
	String model;//non static variable as its value is different from car to car
	String colour;//non static variable as its value is different from car to car
	static int wheels;//static variable as its value is same for all the cars
	
	//creating static and non static methods
	public void login() { //non static method
		System.out.println("non static method for login");
	}
	public static void sendmail() { // static method
		System.out.println("static method for sending mail");
	}
	
	
	public static void main(String[] args) {
		
		//in all the below 4 objects the property value for wheels is 4 and it is common for all the objects, that is why it is declared as static
		
		StaticAndNonStatic stAndNst=new StaticAndNonStatic();
		stAndNst.name="Audi";//calling the non static variables using the object reference
		stAndNst.price=40;
		stAndNst.colour="red";
		stAndNst.model="Q7";
		wheels=4;//calling the static variable directly
		StaticAndNonStatic.wheels=4;//static variables can be called using the class name also
		stAndNst.wheels=4;//can also be called with object name but will get a warning
		
		StaticAndNonStatic stAndNst1=new StaticAndNonStatic();
		stAndNst1.name="bmw";
		stAndNst1.price=50;
		stAndNst1.colour="black";
		stAndNst1.model="Q5";
		wheels=4;
		
		StaticAndNonStatic stAndNst2=new StaticAndNonStatic();
		stAndNst2.name="mercedz";
		stAndNst2.price=50;
		stAndNst2.colour="silver";
		stAndNst2.model="Q3";
		wheels=4;
		
		StaticAndNonStatic stAndNst4=new StaticAndNonStatic();
		stAndNst4.name="toyota";
		stAndNst4.price=50;
		stAndNst4.colour="grey";
		stAndNst4.model="chr";
		wheels=4;
		
	System.out.println(stAndNst.name+" "+stAndNst1.name+" "+stAndNst2.name+" "+stAndNst4.name+ " "+wheels);
	
	StaticAndNonStatic methods=new StaticAndNonStatic();
	methods.login();//non static method, called using object name
	StaticAndNonStatic.sendmail();//static method called using class name
	sendmail();//static method called directly
	methods.sendmail();//static method called with object reference- a warning is given
	}

}
