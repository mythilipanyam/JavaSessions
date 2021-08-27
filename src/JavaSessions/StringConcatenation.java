package JavaSessions;

public class StringConcatenation {

	public static void main(String[] args) {
		String a="Mythili";
		System.out.println("My name is "+a);
		System.out.println("My name is "+"/Mythili/");
		System.out.println("My name is \"Mythili\", my family name is \"Panyam\" and my daughter's name is \"Hansika\"");
		int b=1;
		int b1=b++;
		System.out.println(b);
		System.out.println(b1);
		int b2=++b;
		System.out.println(b);
		System.out.println(b2);

	int m=10;
	System.out.println(m++);
	System.out.println(m);
	
	int i='a';//asci value is 97
	char c='b';//asci value is 98
	System.out.println(i+c);//arithmetic calculation between asci values
	System.out.println('a'+'b');//arithmetic calculation between asci values
	System.out.println('a'+""+'b');//string concatenation
	
	}

}

