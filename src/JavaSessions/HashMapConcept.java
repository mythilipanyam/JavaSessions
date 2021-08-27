package JavaSessions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {
//Hashmap is a part of dynamic collection
//HashMap is a type of dynamic collection which stores the info in the form of key and value pair
// '.put(key,value) method is used to add the values in hashmap
//.add() method is used to add the values in array list
//Hasmap does not maintain the insertion order but arralist maintains the insertion order
//insertion order-index value is assigned based on the order the values are added
//in Hashmap: the index values are assigned based on the hashcode
//in Hashmap: to fetch the value, we have to use '.get(key)' is used
//in Hashmap: 16 virtual segments are created as soon as the hashmap is declared(the index values for 16 segments are from 0 to 15)
//each virtual segment is divided into 3parts:key,value,hashcode of the key.
//then index is calculated by doing modular operation of the hashcode	
//index=mod(hashcode)
//The hashcode could be same for two or more different keys-in that case both the values are stored at the same index 	
//The above process is called collision
//When the hashcode is same for 2 or more keys, equals() method check that both Keys are equal or not. 
//If Keys are same, replace the value with the current value.
//Otherwise, connect this node object to the existing node object through the LinkedList.
//Hence both Keys will be stored at the same index
//Before JDK 1.8, for every collision, hashmap created one linkedlist node at the same index
//After JDK 1.8-linkedlist nodes at the same index will be maintained upto 8 collisions, 
//after 8 nodes (threshold of 8) then hashmap creates a balanced binary tree
//This conversion of linkedlist to binary tree improves the  performance from O(n) to O(log n) .
//linked list time complexity is O(n) and binary tree time complexity is O(log n)
//Hash Code is a number calculated by the hashCode() method of the Object class.	
//when hashmap stores 'null' key, the index of the null key value pair is always zero
//Hascode is always calculated based on 'key'
//In hashmap, if the key is an integer then the index value will be same as the insertion order
//Hashmap is the child class of Map Interface
//Hashmap(class) implements Map(Interface)
//'->' is called supplier in lambda
	
	public static void main(String[] args) {
		
		HashMap<String,String>empData=new HashMap<String,String>();
		empData.put("Mythili", "Test Analyst");
		empData.put("Steve","Assistant Test Analyst");
		empData.put("SteveM","Test Manager");
		empData.put("Louise","Service Operations Manager");
		empData.put("Dan","COO");
		empData.put("null","SDET");//index is always zero for null key
		empData.put("null","SDET1");//SDET value will be replaced with SDET1
		
		System.out.println(empData.get("Mythili"));//Test Analyst will be printed on the console
		
		for(Entry element:empData.entrySet()) {
			System.out.println(element.getKey()+":"+element.getValue());
		}
		System.out.println("--------------------------------------------");
	//the key-values can be fetched using lambda also
		empData.forEach((k,v) -> System.out.println(k+":"+v));
		
		//the index order will be same as the insertion order when the key is an Integer
		HashMap<Integer,String>prodNum=new HashMap<Integer,String>();
		prodNum.put(1,"MAcbook");
		prodNum.put(2,"Ipad");
		prodNum.put(3,"Iphone");
		prodNum.put(4,"Samsung");
		prodNum.put(5,"win10");
		
		System.out.println(prodNum);
		
		
		
		
		
		
	}

}
