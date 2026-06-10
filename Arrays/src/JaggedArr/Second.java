package JaggedArr;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("take how many rows");
		int[][] arr = new int[sc.nextInt()][];
		System.out.println("rows taken"+arr.length);
		System.out.println("taking columns");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("rows"+i);
			arr[i]=new int[sc.nextInt()];	
		}
		
		System.out.println("printing columns");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("row of"+i+"has"+arr[i].length+"columns");
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		

	}

}
