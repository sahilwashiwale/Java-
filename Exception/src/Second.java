
public class Second {

	public static void main(String[] args) {
		
		
		System.out.println("good morning");
		try {
		System.out.println("helloooo");
		System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("byeeeeeeeeeee");
		}
		
	}

}
