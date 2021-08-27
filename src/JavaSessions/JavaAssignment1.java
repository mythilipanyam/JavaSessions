package JavaSessions;

public class JavaAssignment1 {

	public static void main(String[] args) {
		System.out.println("even numbers between 1 to 100");
		//Print even numbers between 1 to 100
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println("--------------------------------------------------------");
		System.out.println("odd numbers between 1 to 100");
		//print odd numbers from 1 to 100
		for(int i=1;i<=100;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		System.out.println("--------------------------------------------------------");
		//printing batman 1 to batman 10
		for(int a=1; a<=10;a++) {
			System.out.println("Batman "+a);
		}
		System.out.println("--------------------------------------------------------");
		//printing I am Batman 10 times
		for(int a=1; a<=10;a++) {
			System.out.println("I am Batman");
		}
		System.out.println("--------------------------------------------------------");
		//Printing 10 to 1 using while loop
		int b=10;
		while(b>=1) {
			System.out.println(b);
			b--;
		}
		System.out.println("--------------------------------------------------------");
		//Printing Hello World 10 times using while loop
		int num=1;
		while(num<=10) {
			System.out.println("Hello WOrld");
			num++;
		}
		System.out.println("--------------------------------------------------------");
	    //quit the loop when multiple of 7 is encountered
		int a1=1;
		while(a1<=15) {
			if(a1%7==0) {
				System.out.println("The loop is broken because of multiples of 7:  " + a1);
				break;
			}
			a1++;
			
		}
		System.out.println("--------------------------------------------------------");
		// Hello
		//Mythili
		
		String s1="Hello";
		String s2="Mythili";
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("--------------------------------------------------------");
		//sum of two numbers
		int num1=74;
		int num2=36;
		int num3=num1+num2;
		System.out.println(num3);
	
		System.out.println("--------------------------------------------------------");
		//division of two numbers
		int num1ForDiv=50;
		int num2ForDiv=3;
		int num3Quotient=num1ForDiv/num2ForDiv;
		System.out.println(num3Quotient);
		
		System.out.println("--------------------------------------------------------");
		//arithmetic operations on 3 numbers
		int n1=-5;
		int n2=8;
		int n3=6;
		int arithmeticOperationValue1=n1+n2*n3;
		System.out.println(arithmeticOperationValue1);
		
		System.out.println("--------------------------------------------------------");
		//Arithmetic operations on floats and doubles
	    double d1=25.5;
		double d2=3.5;
		double d3=3.5;
		double d4=3.5;
		double d5=40.5;
		double d6=4.5;
		System.out.println((d1*d2-d3*d4)/(d5-d6));	
		
		System.out.println("--------------------------------------------------------");
		//String concatenation with a character
		String str="Hello Selenium";
		char c='t';
		char a='b';
		System.out.println(str+c);
		System.out.println(c+a);
		
		System.out.println("--------------------------------------------------------");
		byte b3 = 065; 

		System.out.println(b3);
		
		System.out.println("--------------------------------------------------------");
		//+ve and -ve numbers
		
		int numb=35;
		if(numb>0) {
			System.out.println("positive number");
		}
		else {
			System.out.println("negative number");
		}
		
		System.out.println("--------------------------------------------------------");
		//printing 111 to 555
		for(int x=1;x<=5;x++) {
			for(int y=1;y<=5;y++) {
				for(int z=1;z<=5;z++) {
					System.out.print(x+""+y+""+z+" ");
				}
				System.out.println();
			}
		}
		System.out.println("--------------------------------------------------------");
		//addition and string concatenation
		int x=100;
		int y=200;
		int z=3400;
	
		System.out.println("Your Total amount is. "+ (x+y+z) );
		
		System.out.println("--------------------------------------------------------");
		//printing greatest number
		int k=25;
		 int l=78;
		 int m=87;
		 
		 if(k>l && k>m) {
			 System.out.println("The Greatest: "+k);
		 }
		 else if(l>m) {
			 System.out.println("The Greatest: "+l);
		 }
		 else {
			 System.out.println("The Greatest: "+m);	 
		 }
		 
		 System.out.println("--------------------------------------------------------");
		//grading depending on marks
		 int marks=40;
		 if(marks<=100 && marks>=90) {
			 System.out.println("Grade A");
			}
		 else if(marks<=89 && marks>=71) {
			 System.out.println("Grade B");
		 }
		 else if(marks<=70 && marks>=50) {
			 System.out.println("Grade C");
		 }
		 else {
			 System.out.println("Failed");
		 }
		 System.out.println("--------------------------------------------------------");
		 //printing a pattern using for loop
		 for(int p=1;p<6;p++) {
			 for(int q=1;q<=p;q++) {
			 System.out.print("*");
		 }
			 System.out.println();
		 }

}
}
