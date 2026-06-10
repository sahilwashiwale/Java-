package StringBuilder;

public class Second {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("abc");
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.getClass());
		String s2 = sb.toString();
		System.out.println(s2.getClass());
		

	}

}
