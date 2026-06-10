package Super;

public class Fourth_super {

	public static void main(String[] args) {
		
		Hall h = new Hall();
		h.ac("Sahil");

	}
}

    class Room{
    	String name;
    	
    	public void bed()
    	{
    		System.out.println("this is bed");
    	}
    }
    
    class Hall extends Room{
    	
    	public void ac(String name2)
    	{
    		super.name=name2;
    		System.out.println(name2);
    		super.bed();
    		System.out.println("This is ac");
    	}
    	
    }
