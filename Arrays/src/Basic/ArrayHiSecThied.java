package Basic;

public class ArrayHiSecThied {

	public static void main(String[] args) {

		int arr[]= {12,15,13,16};
		
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		int third=Integer.MIN_VALUE;
		int forth=Integer.MIN_VALUE;
		
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>first)
			{
				second=first;
				first=arr[i];
			}
			if(arr[i]>second &&  arr[i]<first)
			{
				third=second;
				second=arr[i];
			}
			if(arr[i]>third && arr[i]<first)
			{
				forth=third;
				third=arr[i];
			}
			
			
		}
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
	}

}
