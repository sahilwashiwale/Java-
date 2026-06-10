package JaggedArr;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Taking the rows");
         int [][] arr = new int[sc.nextInt()][];
         System.out.println("rows are "+arr.length);
         for(int i=0;i<arr.length;i++)
         {
        	 System.out.println("rows"+i+"take column");
        	 arr[i]=new int[sc.nextInt()];
         }
         
         System.out.println("taking columns value");
         for(int i=0;i<arr.length;i++)
         {
        	 System.out.println("row of"+i+"have"+arr[i].length+"columns");
        	 for(int j=0;j<arr[i].length;j++)
        	 {
        		 arr[i][j]=sc.nextInt();
        	 }
         }
         for(int i=0;i<arr.length;i++)
         {
        	 for(int j=0;j<arr[i].length;j++)
        	 {
        		 System.out.print(arr[i][j]+" ");
        	 }
        	 System.out.println();
         }
	}

}
