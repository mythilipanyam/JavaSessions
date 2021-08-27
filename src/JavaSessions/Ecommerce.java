package JavaSessions;

import java.util.ArrayList;

public class Ecommerce {
	
	public ArrayList<String> getSellerList(String productName) {
		
		//System.out.println("The suppliers for "+productName+ " are :");
		
		ArrayList<String>sellerList=new ArrayList<String>();
		
		if(productName.equals("Dell Laptop")) {
			System.out.println("The suppliers for "+productName+ " are :");
			sellerList.add("Amazon");
			sellerList.add("Argos");
			sellerList.add("Currys");
			sellerList.add("pcworld");
			for(String e:sellerList) {
				System.out.println(e);
			}
			}
		else if(productName.equals("Tshirts")) {
			System.out.println("The suppliers for "+productName+ " are :");
			sellerList.add("Gap");
			sellerList.add("Debenhams");
			sellerList.add("M&S");
			sellerList.add("Adidas");
			for(String e:sellerList) {
				System.out.println(e);
			}
		}
		else if(productName.equals("Shoes")) {
			System.out.println("The suppliers for "+productName+ " are :");
				sellerList.add("Sketchers");
				sellerList.add("Clarks");
				sellerList.add("Adidas");
				sellerList.add("Nike");
				for(String e:sellerList) {		
					System.out.println(e);
				}
		}
		else {
			System.out.println(productName+ " not found in the search list");
		}
		return sellerList;
	}
	

	public static void main(String[] args) {
		
		Ecommerce ecom=new Ecommerce();
		ArrayList<String>list=ecom.getSellerList("Pen");
	}

}
