package Methods;

public class Equal {

	public static void main(String[] args) {
		
		String s = new String("sahil");
		String s2 = new String("sahil");
		String s3 = new String("Sahil");
		
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s3));

	}

}
