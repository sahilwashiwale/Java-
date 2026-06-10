package Non_Primitives;

public class Fifth {

	public static void main(String[] args) {
      
		Calculator c = new Calculator();
		int add = c.addition(10, 10);
		double sub = c.subtraction(10.50, 5.50);
		int mul =c.multiplication(10, 20);
		int div =c.division(20, 5);
		int mod =c.modulus(10, 3);
     
		System.out.println(div);
	}

}
class Calculator
{
	public int addition(int a,int b)
	{
		return a+b;
	}
	public double subtraction(double a,double b)
	{
		return a-b;
	}
	public int multiplication(int a,int b)
	{
		return a*b;
	}
	public int division(int a,int b)
	{
		return a/b;
	}
	public int modulus(int a,int b)
	{
		return a%b;
	}
	
}