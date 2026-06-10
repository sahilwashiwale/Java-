package Control_Statements;

public class Third {

	public static void main(String[] args) {
double money = 1000000;
		
		if(money>=0 && money<=500000)
		{
			System.out.println("Lower Chance");		
			System.out.println("TAX="+money*10/100);
		}
		else if(money>500000 && money<=1000000)
		{
			System.out.println("Medium Chance");	
			System.out.println("TAX="+money*10/100);
		}
		else if(money>1000000)
		{
			System.out.println("Best");
			System.out.println("TAX="+money*10/100);
		}
		else
		{
			System.out.println("Invalid");
		}

	}

}
