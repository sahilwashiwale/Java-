package Practice1;

public class First {

	public static void main(String[] args) {
		
		int i = 3000;
		int j = 400;
		int k = 50;
		if(i>=j && i>=k)
		{
			System.out.println("Largest"+i);
		}
		else if(j>=i && j>=k)
		{
			System.out.println("Largest"+j);
		}
		else if(k>=i && k>=j)
		{
			System.out.println("Largest"+k);
		}
		else
		{
			System.out.println("There is no largest");
		}
	}

}
