package OOP_Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		
	Employee e1=new Employee();
	e1.setAge(20);
	e1.setName("Mythili");
	e1.getName();
	e1.getAge();
	System.out.println(e1.getName()+":"+e1.getAge());
	
	Employee e2=new Employee("Hansika", 14);
	System.out.println(e2.getName() +":"+e2.getAge());

	}

}