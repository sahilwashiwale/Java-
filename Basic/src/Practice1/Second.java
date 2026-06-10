package Practice1;

public class Second {

	public static void main(String[] args) {
      int  first=0;
      int sec=1;
      int next=0;
		for(int i=1;i<=10;i++)
		{
			System.out.println(first);
			next=first+sec;
			first=sec;
			sec=next;
			
		}
	
	  
		

	}

}
