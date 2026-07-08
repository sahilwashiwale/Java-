
public class Sixth {

	public static void main(String[] args) {
		
		int money=23;
		if(money<50)
		{
			throw new AbsentException("please increase the value");
		}
		
	}

}

   class AbsentException extends RuntimeException
   {
	   public AbsentException(String s)
	   {
		   super(s);
	   }
   }
