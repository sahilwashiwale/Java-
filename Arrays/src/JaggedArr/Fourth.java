package JaggedArr;

import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
	  
		Scanner sc = new Scanner(System.in);
		System.out.println("take how many rows");
		int[][] arr = new int[sc.nextInt()][];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("row of"+i);
			arr[i]=new int[sc.nextInt()];
		}
		System.out.println("take columns");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("row of "+i+"has"+arr[i].length+"columns");
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]%2==0) {
				System.out.print(arr[i][j]+" ");
				sum+=arr[i][j];
			}
				else
				{
					System.out.print("*");
				}
				}
			System.out.println();
		}
		System.out.println(sum);
		
		

	}

}
