package OOP_Interface;

public class MedicalTest {
//downcasting with parent and grand parent interfaces is not possible even during compile time as we can not create object of an interface
// downcasting with parent and grand parent classes is possible during compile time but will get 'Classcast Exception' during run time.
	public static void main(String[] args) {
		
		FortisHospital fh=new FortisHospital("Mythili", 40, 15000.50);
		System.out.println(fh.getName()+":"+fh.getAge()+":"+fh.getTreatmentFees());
		fh.setName("Chandra");
		fh.setAge(45);
		fh.setTreatmentFees(5000.00);
		System.out.println(fh.getName()+":"+fh.getAge()+":"+fh.getTreatmentFees());
		System.out.println("--------------------------------------------------------");
		//overridden methods from grand parent interface
		fh.covidTreatment();
		//overridden methods from parent interfaces
		fh.ENTServices();
		fh.optholmologyServices();
		fh.GPServices();
		fh.onchologyServices();
		fh.gynicServices();
		fh.OrthoServices();
		fh.neuroServices();
		fh.cardioServices();
		fh.physioServices();
		fh.emergencyServices();
		fh.covidProtection();
		FortisHospital.covidVaccine();
		USMedical.covidVaccine();
		//overridden methods from grand parent class
		fh.secondDoseVaccine();
		//Individual method of Fortis Hospital
		fh.ventilationServices();
		//overridden methods from parent class
		fh.covidVaccineAge();
		int covAge=fh.covidVaccineAge();
		System.out.println(covAge);
		//inherited method from parent class
		fh.covidFunds();
		//variables of an interface
		System.out.println(MedicalCouncil.covidFees);
		System.out.println(MedicalCouncil.covidVaccineFees);
		//inherited method from grand parent class
		fh.wearMask();
		
		System.out.println("--------------------------------------------------------");
		
		//upcasting--with grand parent class
		WHO who=new FortisHospital();
		who.secondDoseVaccine();
		who.wearMask();
		
		System.out.println("--------------------------------------------------------");
		
		//upcasting--with parent class
		HospitalManagement hm=new FortisHospital();
		hm.covidFunds();
		hm.covidVaccineAge();
		int vaccineAge=hm.covidVaccineAge();
		System.out.println(vaccineAge);
		
		System.out.println("--------------------------------------------------------");
		
		//upcasting--with parent interface
		USMedical usm=new FortisHospital();
		usm.neuroServices();
		usm.covidTreatment();
		usm.covidProtection();
		usm.physioServices();
		usm.cardioServices();
		
       System.out.println("--------------------------------------------------------");
		
	//upcasting--with grand parent interface
    MedicalCouncil mc=new FortisHospital();
    mc.covidTreatment();
    System.out.println(MedicalCouncil.covidFees);
    System.out.println(MedicalCouncil.covidVaccineFees);
    
 }

}
