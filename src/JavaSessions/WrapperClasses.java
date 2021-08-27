package JavaSessions;

public class WrapperClasses {

	public static void main(String[] args) {
//For data conversion-we use predefined methods of wrapper classes
//there are many use cases in selenium-while fetching the value from property file
//the time out mentioned in prop file comes as "20" sec and if we want to increase the timeout by 5secs then we have to convert the data

		//String to int
		String s="100";
		System.out.println(s+20);//10020-string concatenation
		int i=Integer.parseInt(s);//ParseInt is a static method, now the value is 100
		System.out.println(i+20);//120-arithmetic operation
		
		//string to double
		String s1="12.33";
		System.out.println(s1+100);//12.33100
		double d=Double.parseDouble(s1);
		System.out.println(d+100);//112.33
		
		//Numberformarexception
		//during data conversion, the string should be pure numberic string
		String s3="100A";
		//int i1=Integer.parseInt(s3);//NumberFormatException
		String s4=s3.substring(0, 3);
		System.out.println(s4);//"100"
		int i1=Integer.parseInt(s4);
		System.out.println(i1);//100
		
		//String s5="T";
		//int i2=Integer.parseInt(s5);////NumberFormatException
		//System.out.println(i2);
		
		
		//String to boolean
		String headless="true";
		boolean flag=Boolean.parseBoolean(headless);
		//this boolean value can be used as below in selenium
		if(flag) {
			System.out.println("run the tets scripts in headless mode");
		}
		if(Boolean.parseBoolean(headless)){//can also be written like this instead of storing the boolean value in a variable
			System.out.println("run the tets scripts in headless mode");
		}
		
	   //Interger to String
		int t1=100;
		System.out.println(t1+20);//120-Arithmetic operation
		System.out.println(String.valueOf(t1)+20);//10020-String concatenation
		}

}
