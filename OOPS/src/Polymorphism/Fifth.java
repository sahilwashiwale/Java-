package Polymorphism;

public class Fifth

{

	public static void main(String[] args) {
		
		

		USSC us = new USSC();
		us.java();
	}

}

class USS
{
	public void java()
	{
		System.out.println("this is java method");
	}
}

class USSC extends USS
{
	public void java()
	{
		System.out.println("this is java method with AI");
	}
}