package Loops;

public class Eight {

	public static void main(String[] args) {
	
		int sum=0;
		int counter=0;
		for(int i=2;i<=1000;i++)
		{
//			if(i==2)
//			{
//				System.out.println("P"+i);
//			}
			boolean flag=false;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=true;
				}
			}
			if(flag==true)
			{
				System.out.println("NP"+i);
			}
			else
			{
				System.out.println("P"+i);
				counter++;
				sum+=i;
			}
			if(counter==100)
			{
				break;
			}
		}
		System.out.println(counter);
		System.out.println(sum);
	}

}
