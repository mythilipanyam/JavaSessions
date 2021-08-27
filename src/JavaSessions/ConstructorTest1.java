package JavaSessions;

import java.util.ArrayList;

public class ConstructorTest1 {

	public static void main(String[] args) {
		//employee info 
		ArrayList<String>devList=new ArrayList<String>();
		devList.add("iphone10");
		devList.add("ipad3");
		devList.add("macbook");
		devList.add("win10laptop");
		devList.add("samsungs10");
		
		Constructor e=new Constructor("Mythili",30,devList);
		System.out.println("employee's name is "+e.employeeName+" and emplyee's age is "+e.employeeAge+" and employee has the following devices with her");
		for(String a:devList) {
			System.out.println(a);
		}
		
}

}
