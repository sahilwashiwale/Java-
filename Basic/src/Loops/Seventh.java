package Loops;

public class Seventh {

	public static void main(String[] args) {
		int counter=0;
		int sum=0;
		Demo:
		for(int i=2;i<=1000;i++)
		{
			boolean flag=false;
			
			if(i==2)
			{
				counter++;
				sum=sum+2;
				continue;
			}
			for(int j=2;j<i;j++)
			{
			if(i%j==0)
			{
				flag=true;
			}
			}
			if(flag==true)
			{
			  //System.out.println("not prime");
			}
			else
			{
				counter++;
				sum=sum+i;
			}
			if(counter==25)
			{
				break Demo;
			}
		}
		System.out.println(counter);
		System.out.println(sum);

	}

}
