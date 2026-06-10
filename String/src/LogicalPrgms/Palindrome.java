package LogicalPrgms;

public class Palindrome {

	public static void main(String[] args) {


	String s = "anna";
//		String s2="";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			s2 = s2+s.charAt(i);
//		}
//		System.out.println(s2);
//        System.out.println(s.equals(s2));
		
		//by using String Builder
		
		StringBuilder sb = new StringBuilder(s);
		String s2=sb.reverse().toString();
		System.out.println(s2.equals(s));
	}

}
