package OOP_Inheritance;


public class KotiWomensCollege extends OsmaniaUniversity {
	
	public KotiWomensCollege() {
		System.out.println("child class constructor");
	}
	
	private void pharmaceuticalChemistry() {
		System.out.println("Koti womens-pharmaceutical");
	}
	
	public void medicinalChemistry() {
		pharmaceuticalChemistry();
		System.out.println("Koti womens--medicinal chemistry");
	}
	
	@Override
	public void studentBusPass() {
		System.out.println("Koti womes--student bus pass");
	}
	
	@Override
	public int freeBooks() {
		System.out.println("Koti womens --free books");
		return 150;
	}
	
	//Method hiding--static menthods can Not be over riden but method hiding is possible
	public static void universityAccommodation() {
		System.out.println("Koti womens--hostel accommodation");
	}
	

}
