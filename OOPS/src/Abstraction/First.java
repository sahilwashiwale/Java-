package Abstraction;

public class First {

	public static void main(String[] args) {

		Teacher t = new Sahil();
		t.study();
	}

}

      abstract class Teacher
      {
    	  public abstract void study();
      }

      class Sahil extends Teacher
      {
    	  public void study()
    	  {
    		  System.out.println("do study brooo");
    	  }
      }