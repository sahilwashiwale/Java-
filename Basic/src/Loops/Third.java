package Loops;

public class Third {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=17999;i++)
		{
			if(i%3==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

}
