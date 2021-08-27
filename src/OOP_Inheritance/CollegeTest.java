package OOP_Inheritance;

public class CollegeTest {

	public static void main(String[] args) {
// child class object can be referred by parent class reference variable-this is called 'top casting' or 'upcasting'
//with parent class reference variable, we can access the inherited methods and overriden methods  of child class-topcasting
//but with parent class reference variable, we can NOT access the individual or specific methods of child class
// because of 'reference type check' 
//down casting-parent class object can be referred by child class reference variable
//down casting will not throw any errors during compiling time but will throw 'Classcast Exception' during run time
//child class object can be referred by grand parent class reference variable also-this is called 'top casting' 
//when object of a child class is created, parent class constructor is called first then child class constructor is called		
		
	KotiWomensCollege kwc=new KotiWomensCollege();
	kwc.freeBooks();//Inherited from osmania,overriden in osmania
	kwc.freeMeals();//inherited from doe
	kwc.studentBusPass();//overriden
	kwc.medicinalChemistry();//individual or specific to koti womens
	kwc.scholarship();//inherited
	//kwc.freeEducation();//inherited
	DepartmentOfEducation.freeEducation();
	int noOfBooks=kwc.freeBooks();//over riden
	System.out.println(noOfBooks);
	KotiWomensCollege.universityAccommodation();//method hiding
	
	System.out.println("---------------------------------------------------------");
	
	//top casting/up casting with parent class reference variable
	 OsmaniaUniversity ou=new KotiWomensCollege();
	 ou.studentBusPass();
	int books=ou.freeBooks();//over riden
	System.out.println(books);
	 ou.freeMeals();
	 ou.scholarship();
	 OsmaniaUniversity.universityAccommodation();
	 //ou.medicinalChemistry()-not possible because of reference type check
	 
	System.out.println("--------------------------------------------------------------"); 
	//top casting/up casting with grandparent class reference variable 
	 DepartmentOfEducation doe=new KotiWomensCollege();
	 int booksNumber= doe.freeBooks();
	 System.out.println(booksNumber);
	 doe.freeMeals();
	 doe.freeEducation();
		
	 //downcasting
	 //KotiWomensCollege koti=(KotiWomensCollege) new  OsmaniaUniversity ();-throws classcast exception during run time
	}

}
