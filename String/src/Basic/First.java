package Basic;

public class First {

	public static void main(String[] args) {
		//String => combination of characters together
		//abc=>assign once. it should not be changed
		String str = new String("abc");
		String str2 = "abc";
		
//		System.out.println(str.equals(str2));
//		System.out.println(str.charAt(1));
		System.out.println(str.concat("xyz"));
		System.out.println(str);
	}

}
