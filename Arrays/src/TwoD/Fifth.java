package TwoD;

import java.util.Scanner;

public class Fifth {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [][] arr = new int[4][4];
		int max=-2147483648;
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
				if(arr[i][j]>max)
				{
					max=arr[i][j];
				}
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Maximum element is"+max);
		/*
		 * 73 83 82 19
		 * 52 10 77 98
		 * 22 18 23 43
		 * 40 33 65 68
		 */
		

	}

}
