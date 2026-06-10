package Loops;

public class Fifth {

	public static void main(String[] args) {
		int counter=0;
		boolean flag=false;
		int sum=0;
		for(int i=2;i<100;i++)
		{
			if(i%2==0)
			{
				counter++;
				sum=sum+i;
			}
			if(counter==5)
			{
				break;
			}
			
		}
		System.out.println(sum);
		
	}

}
