package Polymorphism;

public class Polymorphic {
// this is dmd example
	public static void main(String[] args) {
   //reference of PC || obj of CC
		Mobile m = new Iphone();
	     m.on();
	
	}
}
    class Mobile{
    	public void on()
    	{
    		System.out.println("mobile started");
    	}
    }
    class Iphone extends Mobile
    {
//    	public void start()
//    	{
//    		System.out.println("iphone is started");
//    	}
    	public void on()
    	{
    		System.out.println("iphone started");
    	}
    }
