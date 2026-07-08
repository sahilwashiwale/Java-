
public class Fifth {

	public static void main(String[] args) {
		
		StudentEception se = new StudentEception();

		System.out.println(se.getMessage());
		
	}

}

class Trowable{
	
	private String message;
	public Trowable(String s)
	{
		this.message=s;
		System.out.println("Trowable"+s);
	}
	
	public Trowable()
	{
		
	}
	
	public String getMessage()
	{
		return this.message;
	}
}

class Eception extends Trowable
{

	public Eception(String s) {
		super(s);
		System.out.println("Eception"+s);
	}
	
	public Eception()
	{
		
	}
	
}

class StudentEception extends Eception
{

	public StudentEception()
	{
		
	}
	public StudentEception(String s) {
		super(s);
		System.out.println("Student Eception"+s);
	}
	
}
