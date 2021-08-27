package JavaSessions;

public class ArrayConcepts {

	public static void main(String[] args) {
		//collection of multiple elements (similar type)
		//Arrays are static and are fixed in length - this can be overcome by using dynamic collections like arraylist
		//Lowest index is always zero and highest index is length-1
		//Arrays can hold similar type of data types only-this can be overcome by using object class arrays
		//.length is a variable used to find the length of the array and .size() is a method to find the size
		//of the arraylist
		//ArrayIndexOutOfBoundsException occurs when we try to add the elements out side of the range
		
		String str[]=new String[5];
		str[0]="Hansika";
		str[1]="Mythili";
		str[2]="Chandra";
		str[3]="Panyams";
		str[4]="Family";
		
		for(int i=0;i<str.length;i++) {
			System.out.println(i+":"+str[i]);
			//System.out.println(str[5]);//ArrayIndexOutOfBoundsException

		}
		
		System.out.println("-----------------------------------------------");
		//using object class and for each loop
		//Object arrays are also static arrays but can hold different types of data types
		Object ob[]=new Object[5];
		ob[0]="Mythili";
		ob[1]='F';
		ob[2]=70000.50;
		ob[3]=true;
		ob[4]=39;
		
		
		for(Object e:ob) {
			System.out.println(e);
		}
		
		
		

	

}
}
