package JavaSessions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaAssignment2 {
	
	public static void main(String[] args) {
		// Printing the pattern using for loop
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=9;j++) {
				System.out.print(i+""+j+" ");
			}
			System.out.println();
			}
		
		System.out.println("--------------------------------------");
		//creating multiple objects of arrays for players and printing them on the console
		
		Object player1[]=new Object[7];
		player1[0]="Virat Kohli";
		player1[1]=32;
		player1[2]="Royal Challengers Bangalore squad";
		player1[3]="01-01-1988";
		player1[4]='m';
		player1[5]=105.09;
		player1[6]=true;
		
		System.out.println("player 1 details are:");
		
		int i=0;
		while(i<=6) {
			System.out.println(player1[i]);
			i++;
		}
		
		Object player2[]=new Object[7];
		player2[0]="MS Dhoni";
		player2[1]=35;
		player2[2]="Chennai Super Kings";
		player2[3]="01-01-1982";
		player2[4]='m';
		player2[5]=101.09;
		player2[6]=true;
		
		System.out.println("player 2 details are:");
		
		for(Object e:player2) {
			System.out.println(e);
		}
		
		Object player3[]=new Object[7];
		player3[0]="Rohit sharma";
		player3[1]=34;
		player3[2]="Mumbai Indians";
		player3[3]="02-02-1985";
		player3[4]='m';
		player3[5]=100.09;
		player3[6]=true;
		
		System.out.println("player 3 details are:");
		
		for(int j=0;j<=6;j++) {
			System.out.println(player3[j]);
		}
		
		System.out.println("-------------------------------------------------");
		//printing a pattern
		
		for(int num=4;num>=0;num--) {
			System.out.println("n = "+num);
		}
		
		System.out.println("-------------------------------------------------");
		//printing a collection of colours
		ArrayList<String>colours=new ArrayList<String>();
		colours.add("Red");
		colours.add("Blue");
		colours.add("Black");
		colours.add("Purple");
		colours.add("Green");
		//for(String e:colours) {
		//	System.out.println(e);
		//}
		System.out.println(colours);
		
		System.out.println("-------------------------------------------------");
		//inserting elements into first and last positions of an arraylist
		
		ArrayList<String>numbers=new ArrayList<String>();
		numbers.add("one");
		numbers.add("two");
		numbers.add("three");
		numbers.add("four");
		numbers.add("six");
		
		System.out.println(numbers);
		
		numbers.add(0, "zero");//inserting an element into the first position 
		System.out.println(numbers);
		
		numbers.add(5, "five");////inserting an element into the last position 
		System.out.println(numbers);
		
		System.out.println("-------------------------------------------------");
		//retrieve an element (at a specified index) from the an array list
		
		System.out.println(numbers.get(5));
		
		System.out.println("-------------------------------------------------");
		//update an element from the colours array list by given element
		
		colours.set(3, "yellow");
		System.out.println(colours);
		
		System.out.println("-------------------------------------------------");
		//remove the third element from an array list. 
		
		System.out.println(numbers.size());
		numbers.remove(3);
		System.out.println(numbers.size());
		
		System.out.println("-------------------------------------------------");
		//search an element in an array list.
		
		if(colours.contains("yellow")) {
			System.out.println("element found in the arraylist");
		}
		else {
			System.out.println("element not found");
		}
		
		System.out.println("-------------------------------------------------");
		//reverse elements in an array list
		
		for(int a=numbers.size()-1;a>=0;a--){
			  System.out.println(numbers.get(a));
		   }
		
		System.out.println("-------------------------------------------------");
		//extract a portion of an array list.
		
		ArrayList<String>fruits=new ArrayList<String>();
		fruits.add("Banana");
		fruits.add("Berry");
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Pear");
		fruits.add("Grapes");
		
		System.out.println(fruits);
		List<String>sublistOfFruits= fruits.subList(0, 4);//extract first 4 of the list
		System.out.println(sublistOfFruits);
		
		System.out.println("-------------------------------------------------");
		//swap two elements in an array list
		
		System.out.println(fruits);//list order before swapping
		Collections.swap(fruits, 1, 2);//swapping the 2nd element with 3rd
		System.out.println(fruits);//list order after swapping
		
		System.out.println("-------------------------------------------------");
		//empty an arraylist
		
		System.out.println(fruits);//list of elements before emptying an arraylist
		fruits.removeAll(fruits);
		System.out.println(fruits);//list of elements after emptying an arraylist
		
		System.out.println("-------------------------------------------------");
		//trim the vc size to the current list size
		
		System.out.println(numbers.size());
	    numbers.trimToSize();
		System.out.println(numbers.size());
		
		System.out.println("-------------------------------------------------");
		//print all the elements of a ArrayList using the position of the elements
		
		for(int b=0;b<numbers.size();b++) {
			System.out.println(numbers.get(b));
		}	
		

	}

}
