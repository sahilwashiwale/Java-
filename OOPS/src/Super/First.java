package Super;

public class First {

	public static void main(String[] args) {

		Student s = new Student();
		System.out.println(s.speed2());
		s.printname();
	}
}
    class Teacher{
    	String name;
    	public Teacher()
    	{
    		System.out.println("Teacher obj created");
    	}
    	public int speed()
    	{
    		return 100;
    	}
    }
    
    class Student extends Teacher{
    	
    	public void printname()
    	{
    		super.name="Sahil";
    		System.out.println(name);
    	}
    	public Student()
    	{
    		System.out.println("Student obj created");		
    	}
    	public int speed2()
    	{
    		return super.speed()*2;
    	}
    }