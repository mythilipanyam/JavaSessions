package JavaSessions;

public class NullReferenceConcept {
	
	String name;


	public static void main(String[] args) {
		
		NullReferenceConcept nrc=new NullReferenceConcept();
		System.out.println(nrc.name);//null
		
		nrc.name="Mythili";
		System.out.println(nrc.name);
		
		nrc=null;
		System.out.println(nrc.name);//NullPointerException
		

	}

}
