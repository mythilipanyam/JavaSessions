package JavaSessions;

public class MainMethodOverLoading {
	
	//Main method is always void in nature-it never returns anything
	//Main method CAN be overloaded (vvimp interview question)
	// JVM will always look for the same signature of "public static void main(String[] args)" and this will be executed 

	public static void main(String[] args) {// always this will be executed first as this is the starting point
		System.out.println("start the programme");
	}
   public static void main(int a) {//JVM will consider this method as the normal method and this will be called using the static way
	   System.out.println("print the value of : a "+a);
		
	}
   public static void main(int a, int b) {//JVM will consider this method as the normal method and this will be called using the static way
	   System.out.println("print the value of : a and b"+a+" "+b);
	
}

}
