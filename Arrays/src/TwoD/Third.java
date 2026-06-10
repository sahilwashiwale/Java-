package TwoD;

public class Third {

	public static void main(String[] args) {
		
		int [][] arr = new int[3][3];
		
		arr[0][0]=20;
		arr[0][1]=40;
		arr[0][2]=60;
		
		arr[1][0]=10;
		arr[1][1]=30;
		arr[1][2]=50;
		
		arr[2][0]=90;
		arr[2][1]=80;
		arr[2][2]=70;
		
		
		
		
		
		int sum=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==j)
				{
					sum+=arr[i][j];
				}
			}
		}
		System.out.println(sum);
		for(int k=2;k<sum;k++)
		{
			if(sum%k==0)
			{
				System.out.println("not prime");
				break;
			}
			
		}
		

	}

}
