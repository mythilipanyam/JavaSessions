package OOP_Inheritance;

public class OsmaniaUniversity extends DepartmentOfEducation{
	public OsmaniaUniversity() {
		System.out.println("parent class constructor");
	}
	
	
	public void scholarship() {
		System.out.println("Osmania--scholarship");
	}
	
	public void studentBusPass() {
		System.out.println("Osmania--student bus pass");
	}
	
	
	@Override
	public int freeBooks() {
		System.out.println("Osmania --free books");
		return 100;
	}
	
	public static void universityAccommodation() {
		System.out.println("Osmania--hostel accommodation");
	}
	

}
