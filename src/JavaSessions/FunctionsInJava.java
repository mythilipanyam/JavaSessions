package JavaSessions;

public class FunctionsInJava {
	//Functions are also class data members
	//functions can not be created inside another function
	//Duplicate Functions can not be created
	//To call the function-we need to create an object
	//The functions that can not return anything are void in nature
	//There can not be two return statements in a function
	//After the return statement there should not be any code in the function as it becomes unreachable.
	//There are three type of functions:
	//1.no input and no return
	//2.no input but some return
	//3. Some input and return
	
	
	//no input and no return 
	public void test() {
		System.out.println("test function......");
	}
	
	//no input but some return
	public String trainerName() {
		String name="Naveen";
		return name;
	}
	
	// Some input and some return
	public int add(int a, int b) {
		int z=a+b;
		return z;
	}
	//WAF-Pass student name(String) and the function should return student marks(int)
	
   public int studentName(String name) {
	 
	   int marks=10;
	   if(name.equals("Hansika")) {
		   marks=100;
		   System.out.println(name+" has got "+marks+" marks");
	   }
	   else if(name.equals("Chandra")) {
		   marks=5;
		   System.out.println(name+" has got "+marks+" marks");
	   }
	   else if(name.equals("Mythili")) {
		   marks=90;
		   System.out.println(name+" has got "+marks+" marks");
	   }
	   else {
		   marks=-1;
		   if(marks==-1) {
			   System.out.println(name+ ":This student is not in our school");
		   }
	   }
	   return marks;
	 }

	public static void main(String[] args) {
		
		FunctionsInJava obj=new FunctionsInJava();
		
		obj.test();
		
		String trainer=obj.trainerName();
		System.out.println("Trainer name is "+trainer);
	//System.out.println("Trainer name is "+obj.trainerName());//can be written like this also
		
		System.out.println("The sum of a and b is "+obj.add(250, 300));
		
		obj.studentName("Rachana");
		
		String msg=obj.launchingBrowser("IE");
		System.out.println(msg);
		
		
}
	public String launchingBrowser(String browserName) {
		switch (browserName) {
		case "Chrome":
		return browserName+" is launched ---200OK";
		
		case "Edge":
		return browserName+" is launched ---200OK";
		
		case "Firefox":
		return browserName+" is launched ---200OK";
		
		case "Safari":
		return browserName+" is launched ---200OK";	

		default:
		return browserName+" not found --- 404 error";
		}
	
}

}
