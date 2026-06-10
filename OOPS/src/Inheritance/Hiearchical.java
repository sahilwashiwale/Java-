package Inheritance;

public class Hiearchical {

	public static void main(String[] args) {

		Goat g = new Goat();
		
		Tiger t =new Tiger();
		g.setall("dog","white");
		System.out.println(g.getname());
		System.out.println(g.getcolor());
	}

}


class Animal{
	String name;
	String color;
	
	public void setall(String name,String color )
	{
		this.color=color;
		this.name=name;
	}
	
	public String getname()
	{
		return this.name;
	}
	
	public String getcolor()
	{
		return this.color;
	}
}
class Goat extends Animal {

	
}
class Tiger extends Animal {
	
}