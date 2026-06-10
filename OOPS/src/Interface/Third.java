package Interface;

public class Third {

	public static void main(String[] args) {
		
      USS u = new FSDI();
      u.teacher();
      
      
       
      
	}

}

 
  interface USS
  {
	  void teaches();
	  
	 default void teach()
	 {
		 System.out.println("Hellooo broooo");
	 }
  }

  
  class FSDI implements USS
  {

public void teaches() {
	System.out.println("heloooooooooooo");
}

public void teach()
{
	USS.super.teach();
}
	
	}
  
  
	  
  