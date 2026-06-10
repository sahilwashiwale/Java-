package Abstraction;

public class Fourth {

	public static void main(String[] args) {
		

	}

}

    abstract class Car
    {
    	abstract public void start();
    	
    	public void stop()
    	{
    		System.out.println("Apply the break");
    	}
    }
    
    class Porsche extends Car
    {
    	public void start()
    	{
    		System.out.println("by speaking");
    	}
    }
