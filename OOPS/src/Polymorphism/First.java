package Polymorphism;

public class First {

	public static void main(String[] args) {

		Car car = new Car();
		car.run(10,20);
		
		
	}
}

    class Car{
    	public void run()
    	{
    		System.out.println("A");
    	}
    	
    	public void run(int a)
    	{
    		System.out.println("B"+10);
    	}
    	
    	public void run(int a,int b)
    	{
    		System.out.println(a+b);
    	}
    }
