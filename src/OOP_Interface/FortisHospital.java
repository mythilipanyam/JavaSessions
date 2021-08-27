package OOP_Interface;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FortisHospital extends  HospitalManagement implements USMedical,UKMedical,IndianMedical {
	//class to interface---'implements'keyword is used
	//class to class----'extends' keyword is used
	//interface to interface---'extends' keyword is used
	//only method declaration and no method body in interface-method prototype
	//abstract methods-methods with no method body
	//it is class responsibility to implement the methods declared in interface
	//the object of an interface can NOT be created
	//an interface can NOT have a class as the parent
	//a child class can have multiple interfaces as parents
	//downcasting is NOT possible in interface because object of interface can not be created
	//after jdk1.8, static methods with method body are allowed to declare in an interface
	//the static methods of interface can be called with 'interfacename.method'
	//the chils class can have the same static method inside the child class, it is called method hiding
	//after jdk1.8 default methods can be created in an interface and these default methods can be overriden in child class
	//static methods without a body are not allowed to be declared in an interface
	//a child class has to override all the methods declared in an interface to implement them
	//top casting is possible with parent interfaces and grand parent interfaces
	//if there is a common method in all the parent interfaces, then that method will be implemented only once in child class
	//child class object implements all the methods declared in parent interfaces, it also can have its own methods
	//a child interface can override parent interface methods, but there is no use case of it
	// Interface variables are STATIC and FINALb y default
	//Interface vaiables can be called by 'Interfacename.variable'
	
	private String name;
	private int age;
	private double treatmentFees;
	
//from medical council---multi level inheritance
	@Override
	public void covidTreatment() {
	System.out.println("FH--covidTreatment");
		
	}
	
//Indian medical---multiple inheritance
	@Override
	public void ENTServices() {
		System.out.println("FH--ENT services");	
		
	}

	@Override
	public void optholmologyServices() {
		System.out.println("FH--optholmology");
		
	}

	@Override
	public void GPServices() {
		System.out.println("FH-GP services");
		
	}
	
//UK medical---multiple inheritance
	@Override
	public void onchologyServices() {
		System.out.println("FH--onchology services");
		
	}

	@Override
	public void gynicServices() {
		System.out.println("FH--gynic services");
		
	}

	@Override
	public void OrthoServices() {
		System.out.println("FH--ortho services");
		
	}
	
//US medical---multiple inheritance
	@Override
	public void neuroServices() {
		System.out.println("FH--neuro services");
		
	}

	@Override
	public void cardioServices() {
		System.out.println("FH--cardio services");
		
	}

	@Override
	public void physioServices() {
		System.out.println("FH--physio services");
		
	}
	
	//common method of all interfaces, implemented only once in child class
		@Override
		public void emergencyServices() {
			System.out.println("FH--emergency services");	
			
		}
	
	//Method hiding
	public static void covidVaccine() {
		System.out.println("FH----covid vaccine");
	}
	
	//default method of us medical can be overridden in child class
	@Override
	public  void covidProtection() {
		System.out.println("FH---covid protection");
	}
	

// overridden method from hospital management--parent class of fortis hospital	
	@Override
	public int covidVaccineAge() {
		System.out.println("FH---covid vaccine age is 18 years");
		return 30;
	}
	
	//overridden method from who--grand parent class of fortis hospital
	@Override
	public void secondDoseVaccine() {
		System.out.println("FH---Second dose vaccine");
	}
	
	//Individual method of fortis hospitals
	public void ventilationServices() {
		System.out.println("FH----overridden method from hospital management--parent class of fortis hospital");
	}

}
