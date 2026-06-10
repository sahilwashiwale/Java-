package TwoD;

import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum=0;
		
		int [][] arr = new int[4][4];
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		
		}
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(arr[i][j]+" ");
				if(i==0 && j==0)
				{
					continue;
					
				}
				if(i%2==0 || j%2==0)
				{
					sum+=arr[i][j];
				}
			}
			System.out.println();
		
		}
		System.out.println(sum);
				

	}

}
