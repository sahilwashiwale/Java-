package Challenges;

public class Second {

	public static void main(String[] args) {
		
		Folder f = new Folder();
		//System.out.println(Folder.name.toUpperCase());
		
	}
}

 class Folder{
	 
	static
	{
		run();
		System.out.println("this is static block");
		name="sahil";
	}

	public static void run()
	{
		System.out.println(name.toUpperCase());
	}
	
	static String name;
 }
 


