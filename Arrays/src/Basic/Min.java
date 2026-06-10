package Basic;

public class Min {

	public static void main(String[] args) {
		int [] arr = {2,3,4,-113,425,-2325325,-5253235,-22};
		int min = 2147483647;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		System.out.println(min);

	}

}
