package Super;

public class Firth {

	public static void main(String[] args) {
		
		Three t = new Three();
	}
}

      class One{
    	  public One(int i,int j)
    	  {
    		  System.out.println("this is one");
    	  }
      }
      
      class Two extends One{
    	  public Two()
    	  {
    		  super(10,20);
    		  System.out.println("this is two");
    	  }
      }
      
      class Three extends Two{
    	  public Three()
    	  {
    		  super();
    		  System.out.println("this is three");
    	  }
      }
