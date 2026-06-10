package Inheritance;

public class MultiLevel {

	public static void main(String[] args) {
		
		Third t = new Third();
		t.add();
		t.remove();

	}
}
  class First{
	  public void add()
	  {
		  System.out.println("Adding method");
	  }
  }
  class Second extends First{
	 public void remove()
	 {
		 System.out.println("Removing method");
	 }
  }
  class Third extends Second{
	  
  }
