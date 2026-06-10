package Loops;

public class Sixth {

	public static void main(String[] args) {
		
		int num=2;
		int counter=0;
		int sum=0;
		
		while(true) {
			boolean isprime=true;
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					isprime=false;
					break;
				}
			}
			if(isprime)
			{
			   counter++;
			   sum=sum+num;
			}
			if(counter==5)
			{
				break;
			}
			num++;
		}
		System.out.println(sum);

	}

}
