package OOP_Interface;

public interface USMedical extends MedicalCouncil {
	
	
	public void neuroServices(); 
	
	public void cardioServices(); 
	
	public void physioServices(); 
	
	//common method in all the interfaces
		public void emergencyServices();
		
	
	//After jdk 1.8
	public static void covidVaccine() {
		System.out.println("USmedical----covid vaccine");
	}
	
	//After jdk 1.8
	public default void covidProtection() {
		System.out.println("USmedical---covid protection");
	}
	
	
}
