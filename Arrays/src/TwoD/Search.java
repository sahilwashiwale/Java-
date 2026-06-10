package TwoD;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		
		/*
		 * 46 47 28
		 * 08 72 82
		 * 92 48 91
		 */
		
		int search = 12;
		
		Scanner sc = new Scanner(System.in);
		
		int [][] arr = new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		boolean found = false;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			if(arr[i][j]==search)
			{
				found=true;
			}
			System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		if(found==true)
		{
			System.out.println("element is There"+search);
		}
		else
		{
			System.out.println("element not in arr");
		}

	}

}
