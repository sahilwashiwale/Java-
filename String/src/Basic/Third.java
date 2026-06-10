package Basic;

public class Third {

	public static void main(String[] args) {
		
		String vowel = "aeiou";
		String name="welcome";
		String name2 = "";
		
		for(int i=0;i<name.length();i++)
		{
			for(int j=0;j<vowel.length();j++)
			{
				if(name.charAt(i)==vowel.charAt(j))
				{
					System.out.println(name.toUpperCase().charAt(i));
				}
			}
		}
	}

}
