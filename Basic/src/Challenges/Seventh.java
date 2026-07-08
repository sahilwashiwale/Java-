package Challenges;


public class Seventh {

	public static void main(String[] args){


		
		int arr[] = {1,3,7,10};
		
		for(int i=1;i<=10;i++)
		{
			boolean flag=false;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==i)
				{
					flag=true;
					break;
				}
			}
			if(!flag)
			{
				System.out.println(i);
			}
		}
	
	}

}

 

  