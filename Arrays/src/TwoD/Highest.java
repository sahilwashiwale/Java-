package TwoD;

import java.util.Scanner;

public class Highest {

	public static void main(String[] args) {
		
		int max=Integer.MIN_VALUE;
		
		int[][] arr=new int[3][3];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]>max)
				{
					max=arr[i][j];
				}
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(max);

	}

}
