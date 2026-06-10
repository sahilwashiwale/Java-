package Practice;

public class First {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				arr[i]=2;
			}
			arr[i]=arr[i]+2*i;
			//System.out.println(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>15)
			{
				System.out.println(arr[i]);
			}
		}
		

	}

}
