package Final_Finally_Finalise;

public class FinallyBlock {
//Even if the exception is occurring or not when finally block is declared, the code in the finally block is always executed
//finally block can not be used on its own
//finally block is always used with try-catch block
//use cases for finally use are database connection and file handling
//step 1-data base connection
//step 2-data fetching from data base-exception might occur
//step 3-database disconnection in finally block	
	
	String name="Mythili";
	public static void main(String[] args) {
		
		FinallyBlock obj=new FinallyBlock();
		obj=null;
		try {
		System.out.println(obj.name);
		}catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("data not found");
		}
		finally {//the code in this block is always executed
			System.out.println("database connection disconnected");
		}
	}

}
