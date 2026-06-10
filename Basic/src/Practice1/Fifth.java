package Practice1;

public class Fifth {

	public static void main(String[] args) {
		int [] arr = {34,214,34,431,31};
		int num=215;
		for(int i=0;i<arr.length;i++)
		{			
			if(arr[i]>num)
			{
				num=arr[i];
			}
		}
		System.out.println(num);

	}

}
