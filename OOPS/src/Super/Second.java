package Super;

public class Second {

	public static void main(String[] args) {

		BCA bb = new BCA();
		
	}
}  
   
    class ABC{
    	public ABC()
    	{
    		System.out.println("tHIS IS ABC");
    	}
    }
    
    class CBA extends ABC{
    	public CBA(int i)
    	{
    	super();
    	System.out.println("THIS IS CBA");
    	}
    }
    class BCA extends CBA{	
    	public BCA()
    	{
    		
            super(10);
            System.out.println("This is BCA");
    	}
    }
    			
    	
    
