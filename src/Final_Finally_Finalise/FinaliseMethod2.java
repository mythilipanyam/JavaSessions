package Final_Finally_Finalise;
//Object class is the parent class of all the classes in java
//finalise is the method of object, so it can be overridden in all child classes
//JVM executes finalise method first before gc mechanism
//finally-is a block
//finalise is a method
//final is a keyword used:(1). to declare constant variables
//(2):to final classes can not be inherited--that is final is used to prevent inheritance
//(3):to prevent method overriding
//finalise method is deprecated after jdk 1.8


public class FinaliseMethod2 {

	public static void main(String[] args) {
		
		FinaliseMethod2 fm2=new FinaliseMethod2();
		fm2=null;
		
		FinaliseMethod1 fm1=new FinaliseMethod1();
		fm1=null;
		
		System.gc();
		System.out.println("hii---------------");
		}
	
	public void finalise(){
		System.out.println("this is finalise method of finelisemethod2 class");
	}

}
