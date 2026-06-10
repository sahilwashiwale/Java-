package Constructor;

public class First {

	public static void main(String[] args) {

		Student s1 = new Student();
		Student s2 = new Student();
//		System.out.println(s1.name);
//		s1.name="Yash";
//		System.out.println(s1.name);
		s1.print();
		s2.print();

		
	}

}
class Student{
	String name="sahil";
	public Student()
	{
	name="sah";
	}
	public Student(String name2)
	{
		name2=name;
	}
	public void print()
	{
		System.out.println(name);
	}
}
