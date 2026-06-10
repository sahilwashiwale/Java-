package Methods;

public class ToChar {

	public static void main(String[] args) {
		
//		String s = "Sahil";
//		char[] s3 = s.toCharArray();
//		for(char s2:s3)
//		{
//			System.out.println(s2);
//		}
		
		String s = "madam";
		
		for(int i=0;i<s.length();i++)
		{
			boolean flag = false;
			for(int j=s.length()-1;j>=0;j--)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					flag = true;
					break;
				}
			}
			if(flag==true)
			{
				System.out.println("Palindrome");
			}
		}
		
		

	}

}
