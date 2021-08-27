package OOP_Inheritance;

public class SaifabadCollege extends OsmaniaUniversity {
    
	private void organicChemistry() {
		System.out.println("saifabad--organic chemistry");
	}
	
	@Override
	public void studentBusPass() {
		System.out.println("saifabad---student pass");
	}
	
	@Override
	public void scholarship() {
		System.out.println("saifabad--scholarship");
	}
	
	public void postGraduation() {
		System.out.println("saifabad--post graduation");
	}
}
