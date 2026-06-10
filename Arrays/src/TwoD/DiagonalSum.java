package TwoD;

import java.util.Scanner;

public class DiagonalSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			if(i==j)
			{
				sum+=arr[i][j];
			}
			System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(sum);
		for(int k=2;k<sum;k++)
		{
			boolean flag = false;
			if(sum%k==0)
			{
				flag=true;
				break;
			}
			if(flag==true)
			{
				System.out.println("Not prime");
			}
			else
			{
				System.out.println("Prime");
				break;
			}
			
			
		}

	}

}
