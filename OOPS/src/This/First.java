package This;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Constructor Jumping Exp
     Vehicle v = new Vehicle();
	}

}
//BDCA
class Vehicle{
	public Vehicle()
	{
		this(10,10);
		System.out.println("A");
	}
	public Vehicle(int i)
	{
		System.out.println("B");
	}
	public Vehicle(int i, int j)
	{
		this(10,10,10);
		System.out.println("C");
	}
	public Vehicle(int i,int j,int k)
	{
		this(10);
		System.out.println("D");
	}
}
