package Polymorphism;

public class Two {

	public static void main(String[] args) {
		

		School school = new School();
		
	}
}

    class School{
    	public School(){
    		System.out.println("A");
    	}
    	
    	public School(int a)
    	{
    		System.out.println("B"+a);
    	}
    }
