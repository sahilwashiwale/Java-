package Non_Primitives;

public class First {

	public static void main(String[] args) {
		Bike bullet = new Bike();
		Bike splender = new Bike();
		Bike unicorn = new Bike();
		
		bullet.colour="Red";
		bullet.model_year=2018;
		bullet.price=210000.20;
		
		splender.colour="Black";
		splender.model_year=2011;
		splender.price=95000.20;
		
		unicorn.colour="gray";
		unicorn.model_year=2014;
		unicorn.price=99000.80;
		
		
		boolean val = bullet.isbike();
		bullet.getstart();
		
		System.out.println("bullet color"+bullet.colour);
		System.out.println("unicorn model year"+unicorn.model_year);
		System.out.println("Splender PRice"+splender.price);
		System.out.println(val);
		
		
	}
}
 class Bike{
	 int model_year;
	 String colour;
	 double price;
	 public void getstart()
	 {
		 System.out.println("Start the bike");
	 }
	 public boolean isbike()
	 {
		 return true;
	 }
 }
