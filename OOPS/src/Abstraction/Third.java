package Abstraction;

public class Third {

	public static void main(String[] args) {
		
		Tv tv = new Sansui();
		tv.on();
	}

}

   abstract class Tv
    {
	    public Tv()
	   {
		   System.out.println("hiii");
	   }
    	abstract public void on();
    	
    }
    class Sansui extends Tv
    {
    	public void on()
    	{
    		System.out.println("turn on the tv");
    	}
    }
