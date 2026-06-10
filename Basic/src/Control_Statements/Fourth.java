package Control_Statements;

public class Fourth {

	public static void main(String[] args) {
		double money = 400000;

		if(money>=0 && money<=500000)
		{
			System.out.println("0 to 5");	
			System.out.println("TAX=0");
		}
		else if(money>500000 && money<=1000000)
		{
			System.out.println("5 to 10");
			System.out.println("TAX="+money*10/100);
		}
		else if(money>1000000 && money<=2000000)
		{
			System.out.println("10 to 20");
			System.out.println("TAX="+money*20/100);
		}
		else if(money>2000000 && money<=3000000)
		{
			System.out.println("20 to 30");	
			System.out.println("TAX="+money*30/100);
		}
		else if(money>3000000)
		{
			System.out.println("30>");
			System.out.println("TAX="+money*50/100);
		}
		else
		{
			System.out.println("Invalid Bro");
		}

	}

}
