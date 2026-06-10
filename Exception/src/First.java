
public class First {

	public static void main(String[] args) {
		
		Tiger t = new Tiger("eating");
		System.out.println(t.Getval());

	}

}

  class Animal
  {
	  String msg;
	  public Animal(String message)
	  {
		  this.msg=message;
	  }
	  
	  public String Getval()
	  {
		  return this.msg;
	  }
  }
  
  class Tiger extends Animal
  {

	public Tiger(String message) {
		super(message);
		
	}
	  
  }
