package Methods;

public class Trim {

	public static void main(String[] args) {
		
		String s = "   Sahil";
		System.out.println(s);
		System.out.println(s.stripLeading());
		//remove whitespace at start of string
		
		String s2 = "Sahil        ";
		System.out.println(s2);
		System.out.println(s2.stripTrailing());
		//remove whitespace at end of string
		
		String s3 = "       Sahil        ";
		System.out.println(s3);
		System.out.println(s3.trim());
		//remove whitespace at start of string as well as end of string 
		
	}

}
