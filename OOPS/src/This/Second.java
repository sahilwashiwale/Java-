package This;

public class Second {

	public static void main(String[] args) {
		//cbad
		
		Parent p = new Parent(10,20,30);
	}

}

  class Parent{
	  public Parent()
	  {
		  this(10);
		  System.out.println("A");
	  }
	  public Parent(int i)
	  {
		  this(10,20);
		  System.out.println("B");
	  }
	  public Parent(int i, int j)
	  {
		  System.out.println("C");
	  }
	  public Parent(int i,int j,int k)
	  {
		  this();
		  System.out.println("D");
	  }
  }
