package LogicalPrgms;

public class First {

	public static void main(String[] args) {
		
		char[] c = {'a','b','c','d'};
		String s = "";
		for(int i=0;i<c.length;i++)
		{
			s=s+"^"+c[i];
		}
   System.out.println(s);
	}

}
