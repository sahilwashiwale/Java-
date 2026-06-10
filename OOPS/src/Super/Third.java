package Super;

public class Third {

	public static void main(String[] args) {
		

		Book b = new Book(10);
	}
}

       class Bag{
    	    public Bag()
    	    {
    	    	System.out.println("This is non param parent");
    	    }
    	    
    	    public Bag(int i,int j)
    	    {
    	    	this(10);
    	    	System.out.println("This is param with 2 argu");
    	    }
    	    public Bag(int i)
    	    {
    	    	System.out.println("This is param with 1 argu");
    	    }
    	   
       }
       
       class Book extends Bag{
    	  
    	   public Book()
    	   {
    		   super(10,20);
    		   System.out.println("this is non param child ");
    	   }
    	   
    	   public Book(int i)
    	   {
    		   this();
    		   System.out.println("This is param with 1 child");
    	   }
    	   
    	   
       }
