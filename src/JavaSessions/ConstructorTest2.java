package JavaSessions;

public class ConstructorTest2 {

	public static void main(String[] args) {
		
		Object st[]=new Object[3];
		st[0]="Hansika";
		st[1]="Year 9";
		st[2]=14;
		
		Constructor c=new Constructor(st);
		for(Object e:st) {
			System.out.println(e);
		}
		

	}

}
