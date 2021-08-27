package JavaSessions;

public class StringManipulation {
//to calculate the size of the array---> '.length' is used
//to calculate the size of the arraylist---> '.size' is used
//to calculate the size of the string---> '.length()' is used

	public static void main(String[] args) {
		
	String s="Hi this is my java code and I am doing well in java";
	System.out.println(s.length());//51
	
	int length=s.length();//51
	int highestIndex=length-1;//50
	int lowestIndex=0;
	
	System.out.println(s.charAt(5));
	System.out.println(s.charAt(50));
	//System.out.println(s.charAt(52));//throws--StringIndexOutofBoundsException
	//System.out.println(s.charAt(-1));//throws--StringIndexOutofBoundsException
	
	System.out.println(s.indexOf('H'));
	System.out.println(s.indexOf('d'));
	System.out.println(s.indexOf("java"));//indexof() can be used to find out the index of either characters or strings
	System.out.println(s.indexOf("doing"));
	System.out.println(s.indexOf("Mythili"));// -1, interview question, when you cant find the string value in the string it will give -1 
	int first=s.indexOf('i');
	int second=s.indexOf('i',first+1);
	int third=s.indexOf('i',second+1);
	int fourth=s.indexOf('i',third+1);
	System.out.println(first);//first occurrence of i
	System.out.println (second);////second occurrence of i
	System.out.println (third);//third occurance of i
	System.out.println (fourth);//4th occurrance of i
	
	System.out.println("--------------------------------------------");
	//Upper and lower case methods
	String s1="This is my java code and I am very happy as I am doing well in Java";
	System.out.println(s1.toUpperCase());
	System.out.println(s1.toLowerCase());
	
	System.out.println("--------------------------------------------");
	//contains method
	String msg="You are logged in as manager";
	System.out.println(msg.contains("manager"));
	
	if(msg.contains("manager")){
		System.out.println("correct welcome message");
	}else {
		System.out.println("incorrect welcome message");
	}
	
	System.out.println("--------------------------------------------");
	//equals method
	//String objects are created in SCP(String constant pool) inside the heap memory
	//when the string objects are created using new keyword, the objects are created both inside the heap memory and in SCP
	//strings are immutable, when we assign different values to the refrence variable, the original values are not changed,instead the variable are directed to the newly assigned value
    String name="mythili";//this way of creating string objects is called string literals
	//when the objects are created by string literals, they are created only in string constant pool
    String name1="mythili";
	String name2="MYTHILI";
	String obj2="object";
	//hard comparison
	System.out.println(name.equals(name1));//true
	System.out.println(name.equals(name2));//false
	System.out.println(name==name1);//true
	
	//soft comparison
	System.out.println(name.equalsIgnoreCase(name2));//true
	System.out.println(name==name2);//false
	
	String obj=new String("object");
	String obj1=new String("object");
	System.out.println(obj==obj1);//false, its comparing the references
	System.out.println(obj.equals(obj1));//true, its comparing the reference values.
	System.out.println(obj==obj2);//false,its comparing the references
	System.out.println(obj.equals(obj2));//true,its comparing the reference values.
	
	System.out.println("--------------------------------------------");
	//sub string method
	String p="This is my latest Java code";
	System.out.println(p.substring(11));
	System.out.println(p.substring(18,22));//last index is not included when JVM executes this line of code
	
	System.out.println("--------------------------------------------");
	//split method
	String a="Jave_Python_C#_Ruby_Pearl_HTML_CSS";
	String array[]=a.split("_");
	System.out.println(array.length);
	System.out.println(array[5]);
	for(String e:array) {
		System.out.println(e);
	}
	System.out.println("--------------------------------------------");
	String b="Jave,Python,C#,Ruby,Pearl,HTML,CSS";
	String langList[]=b.split(",");
	System.out.println(langList.length);
	for(String e:langList) {
		System.out.println(e);
	}
	System.out.println("--------------------------------------------");
	//interview question
	String str="xXJavaXxXXPythonxXRuby";
	String str1[]=str.split("xX");
	System.out.println(str1[0]);//nothing will be printed on the console, because 'xX'was in the 0th position
	System.out.println(str1[1]);
	System.out.println(str1[2]);
	System.out.println(str1[3]);
	//System.out.println(str1[4]);//Arrayindexoutofboundsexception
	
	System.out.println("--------------------------------------------");
	String productinfo="Macbook:Pro_Availability:In PC World_Price:£1400.00_Colour:Red";
	System.out.println(productinfo.split("_")[0]);//productinfo.split("_") becomes an array
	System.out.println(productinfo.split("_")[1]);
	System.out.println(productinfo.split("_")[2]);
	System.out.println(productinfo.split("_")[3]);
	
	System.out.println("--------------------------------------------");
	//string conversion
	String c="100a";
	String subst=c.substring(0,3);
	int i=Integer.parseInt(subst);
	System.out.println(i+50);
	
}

}
