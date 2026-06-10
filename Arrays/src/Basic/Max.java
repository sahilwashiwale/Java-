package Basic;

public class Max {

	public static void main(String[] args) {
		// Find MAx
		int max=Integer.MIN_VALUE;
		int arr[]= {282,43,23,1,3,4,2,-128374474};
       
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}
