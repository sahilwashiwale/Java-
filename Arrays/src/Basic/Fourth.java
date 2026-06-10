package Basic;

import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int [10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
//		System.out.println(arr[2]);
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
		

	}

}
