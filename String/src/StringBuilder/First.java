package StringBuilder;

public class First {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("abc");
		StringBuilder sb2 = sb.reverse();
		System.out.println(sb);
		System.out.println(sb==sb2);//memory refrence same
		System.out.println(sb.hashCode());
		System.out.println(sb2.hashCode());

	}

}
