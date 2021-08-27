package JavaSessions;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListConcept {

	public static void main(String[] args) {
		//ArrayList is a default class available in JRE
		//need to create an object for the arraylist
		//.size() method is used to get the size of the arraylist and 
		//.size() method always gives the physical capacity of the arraylist not the virtual capacity
		//.add() method is used to add the values to the arraylist
		//The virtual capacity of arraylist is by default 10 segments or buckets
		// the segment/bucked is called backed array[]
		//.get(index) method gets the value from the arraylist
		//.remove() method will remove the entire segment from the arraylist
		// Collection.sort()-It is used to sort the elements present in the arraylist in the ascending order.
		//Collection.reverse()-It is used to sort the elements present in the arraylist in the descending order.
		//Collections.swap method is used to swap two elements of an arraylist
		//.set method is used to update the particular element of an arraylist with a given element
		//.removeAll method is used to empty an array list
		//.trimToSize method trims the virtual capacity size to the current list size
		
		
		ArrayList ar=new ArrayList();
		System.out.println(ar.size());
		ar.add(100);
		ar.add("Mythili");
		System.out.println(ar.size());
		
		System.out.println("-----------------------------");
		ArrayList<Double>ratingOrder=new ArrayList<Double>();
		ratingOrder.add(1.5);//0
		ratingOrder.add(2.5);//1
		ratingOrder.add(3.5);//2
		ratingOrder.add(4.5);//3
		ratingOrder.add(5.5);//4
		ratingOrder.add(1.0);//5
		ratingOrder.add(2.0);//6
		ratingOrder.add(3.0);//7
		ratingOrder.add(4.0);//8
		ratingOrder.add(5.0);//9
	
		ratingOrder.add(9, 5.25);
		System.out.println(ratingOrder.size());
		System.out.println(ratingOrder.get(9));
	    ratingOrder.remove(9);
	    System.out.println(ratingOrder.get(9));
	    System.out.println(ratingOrder.size());
	   System.out.println(ratingOrder);
	   
	 //Printing the arraylist from index(0) to index(n)
	   for(int i=0;i<ratingOrder.size();i++) {
		   System.out.println(ratingOrder.get(i));
	   }
	   System.out.println(ratingOrder.size());
	   
	   //Printing the arraylist from index(n) to index(0)
	   for(int i=ratingOrder.size()-1;i >=0;i--){
		  System.out.println(ratingOrder.get(i));
	   }
	   
	   // sorting the list in ascending order
	   Collections.sort(ratingOrder);
	   System.out.println(ratingOrder);
	   
	   //sorting the list in descending order
	   Collections.reverse(ratingOrder);
	  System.out.println(ratingOrder);
	   
	   	   
}

}
