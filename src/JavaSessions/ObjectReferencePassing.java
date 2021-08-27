package JavaSessions;

public class ObjectReferencePassing {
	String name;
	int age;

	public static void main(String[] args) {
		ObjectReferencePassing obj=new ObjectReferencePassing ();
		obj.name="Mythili";
		obj.age=40;
		//ObjectReferencePassing.test(obj);
		//ObjectReferencePassing p1=obj;
		obj.test(obj);
	}
	
	public  void test(ObjectReferencePassing p1) {
		System.out.println(p1.name +" : "+p1.age);
		p1.testMethod();
		ObjectReferencePassing p2=p1;//call by reference value
		System.out.println(p2.name+":"+p2.age);
		}
	
        public void testMethod() {
		System.out.println("test method");
		
		
	}

}
