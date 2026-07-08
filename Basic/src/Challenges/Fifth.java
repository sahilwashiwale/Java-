package Challenges;

public class Fifth {

	public static void main(String[] args) {
	
		String s="welcome to pune";
		
	   String[] s2 = s.split(" ");
		
		for(String after : s2) {
			StringBuilder sb = new StringBuilder(after);
			System.out.print(sb.reverse()+" ");
			}

	}

}

