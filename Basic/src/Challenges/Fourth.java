package Challenges;

public class Fourth {

	public static void main(String[] args) {
		
		Marry m = new Marry();
		m.getMarried();

	}

}

   class Marraige
   {

	   public void getMarried()
	   {
		   System.out.println("father Choice");
	   }
   }
   
   class Marry extends Marraige
   {
	   public void getMarried()
	   {
		   System.out.println("son Choice");
	   }
   }
   