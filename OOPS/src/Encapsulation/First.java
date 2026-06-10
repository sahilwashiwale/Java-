package Encapsulation;

public class First {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.setName("Sahil");
		s1.setRoll(20);
		
		System.out.println(s1.getRoll());
		System.out.println(s1.getName());

		
	}

}
class Student{
	
	private int roll;
	private String name;
	
	public int getRoll() 
	{
		return roll;
	}
	public void setRoll(int roll)
	{
		this.roll = roll;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
}