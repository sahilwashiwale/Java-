package TwoD;

import java.util.Scanner;

public class RowWise {

	public static void main(String[] args) {
		
		int [][] arr = new int[3][3];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
			}
			
		}
		
		for(int i=0;i<3;i++)
		{
			int sum=0;
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
				sum+=arr[i][j];
				
			}
			System.out.println();
			System.out.println(sum);
		}
		
		
		
	}

}
