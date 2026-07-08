package Practice;

public class Fifth {

	public static void main(String[] args) {
		
		int [] arr= {10,20,90,14,80,70,40,35};
		int first=-2147483648;
		int sec=-2147483648;
		int third=-2147483648;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>first)
			{
				third=sec;
				sec=first;
				first=arr[i];
//				sec=first;
//				first=arr[i];
				
			}
			if(arr[i]>sec && arr[i]<first)
			{
				third=sec;
				sec=arr[i];
			}
			if(arr[i]>third && arr[i]<first && arr[i]<sec)
			{
				third=arr[i];
			}
			
		}
		System.out.println(first);
		System.out.println(sec);
		System.out.println(third);

	}

}
