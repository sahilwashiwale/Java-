package Interface;

public class Second {

	public static void main(String[] args) {
		
		Hyva h = new Hyva();
		h.start();
	}

}

 interface I_r{
	 void start();
 }

 interface I_r2{
	 void start();
 }
 
 class Hyva implements I_r2,I_r
 {


	public void start() {
		
		System.out.println("hello ");
	}
	 
 }