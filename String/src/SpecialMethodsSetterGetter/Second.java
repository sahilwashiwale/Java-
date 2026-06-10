package SpecialMethodsSetterGetter;

public class Second {

	public static void main(String[] args) {
		
		

		Student s = new Student();
		s.setall("sahil", 21);
		System.out.println(s.getage());
		System.out.println(s.getname());
	}

}
class Student{
	String name;
	int age;
	
	public void setall(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public String getname()
	{
		return this.name;
	}
	public int getage()
	{
		return this.age;
	}
}
