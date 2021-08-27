package JavaSessions;

public class IfElseConditions {

	public static void main(String[] args) {
		//'=' is called as assignment operator and '==' is called as comparison operator
		//grading depending on marks
	 int marks=40;
	 if(marks<=100 && marks>=90) {
		 System.out.println("Grade A");
		}
	 else if(marks<=89 && marks>=71) {
		 System.out.println("Grade B");
	 }
	 else if(marks<=70 && marks>=50) {
		 System.out.println("Grade C");
	 }
	 else {
		 System.out.println("Failed");
	 }
	 //find the greatest number
	 // && (and) is called as short circuit operator
	 int a=600;
	 int b=400;
	 int c=300;
	 
	 if(a>b && a>c) {
		 System.out.println("a is the greatest number");
	 }
	 else if(b>c) {
		 System.out.println("b is the greatest number");
	 }
	 else {
		 System.out.println("c is the greatest number");	 
	 }
	 
	 //Dead code is the code which will never get executed, in if else conditions,
	 //when the if condition is defined as true, the else block will never get executed
	 if(true) {
		 System.out.println("Pass");
	 }
	 else {
		 System.out.println("Fail");
	 }
	 //using || (or) operataor
	 // To compare two strings, we use '.equals()' method
	 String s="Linux";
	 if(s.equals("Win10") || s.equals("Mac") || s.equals("Linux")) {
		 System.out.println("OS is running");
	 }
	 else {
		 System.out.println("Please supply an OS");
	 }
	 // using '!'(not) operator-it reverses the outcome
	 String user="admin";
	 if(!user.equals("admin")) {
		 System.out.println("admin profile");
	 }
	 else {
		 System.out.println("customer profile");
	 }
	 
	 // using .isBlank() and .isEmpty()
	 String str="";
	 if(str.isEmpty()) {
		 System.out.println("empty string");
	 }
	 else {
		 System.out.println("blank string");
	 }
	 //Switch case
	String  browser="ie";
	
	switch (browser) {
	case "Chrome":
	System.out.println("Browser is Chrome");
	break;
	
	case "Edge":
	System.out.println("Browser is Edge");
	break;
	
	case "Safari":
	System.out.println("Browser is Safari");
	break;
	
	case "Firefox":
	System.out.println("Browser is ff");
	break;
		
	default:
	System.out.println("There is no browser available");
	break;
	
	}
			 
}
}
