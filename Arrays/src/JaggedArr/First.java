package JaggedArr;

public class First {

	public static void main(String[] args) {
		
		int[][] arr = new int[2][];
		
		arr[0]=new int[4];
		arr[1]=new int[3];
		
		arr[0][0]=12;
		arr[0][1]=24;
		arr[0][2]=36;
		arr[0][3]=48;
		
		arr[1][0]=60;
		arr[1][1]=72;
		arr[1][2]=84;
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
