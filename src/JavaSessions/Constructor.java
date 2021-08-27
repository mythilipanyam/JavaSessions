package JavaSessions;

import java.util.ArrayList;

public class Constructor {
	//Class name and Constructor name should always be same
	//Constructor looks like a function/method but its not a function
	//Constructor never returns anything-there is no 'return' or 'void' keyword in constructor
	//constructors can be overloaded
	//constructors will be called when object of the same class is created
	// 'this' keyword is used to assign the constructor local variable value to the class global variable value
	//the purpose of the function is to write the business login
	//constructor is a template of the class and the purpose is to initialise the class ariables
	
	
	
	//car booking system
	String carType;
	String from;
	String to;
	int carCapacity;
	
	public Constructor(String from, String to) {
		this.from = from;
		this.to = to;
	}

	public Constructor(String carType, String from, String to) {
		this.carType = carType;
		this.from = from;
		this.to = to;
	}

	public Constructor(String carType, String from, String to, int carCapacity) {
		this.carType = carType;
		this.from = from;
		this.to = to;
		this.carCapacity = carCapacity;
	}
	
	public void businessLogic() {
		System.out.println(carType+" is booked"+" from "+from+" to "+to+" "+"and the car capacity is "+carCapacity);
	}
	
	
	//employee info
	String employeeName;
    int employeeAge;
    ArrayList<String>deviceList;


	public Constructor(String employeeName, int employeeAge, ArrayList<String> deviceList) {
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.deviceList = deviceList;
	}
	
	//students array
	Object studentInfo=new Object[3];
	//String studentName;
	//String studentClass;
	//int studentAge;

	public Constructor(Object studentInfo) {
		this.studentInfo = studentInfo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
