
public class Third {

	public static void main(String[] args) {
		

		
		int salary=2000;
		
		try 
		{
			if(salary<=5000)
			{
				throw new SalaryException("salary is less than 5000");
			}
		}
		catch(SalaryException se)
		{
			System.out.println( se.getMessage());
		}
		finally
		{
			System.out.println("THE END!");
		}
	}

}

 class SalaryException extends Exception
 {

	public SalaryException(String s)
	 {
		 super(s);
	 }
 }
