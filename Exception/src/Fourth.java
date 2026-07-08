
public class Fourth {

	public static void main(String[] args) {
		
		int marks=36;
		try {
		if(marks>=35)
		{
			throw new MarksException("marks is greater than 35");
		}
		System.out.println("marks is not greater than 35");
		}
		catch(MarksException me)
		{
			System.out.println(me.getMessage());
		}
		finally
		{
			System.out.println("This is End!!!!!!!!");
		}

	}

}

class MarksException extends Exception
{
	public MarksException(String s)
	{
		super(s);
	}
}
