package Non_Primitives;

public class Second {

	public static void main(String[] args) {

		Laptop lenovo = new Laptop();
		Laptop asus = new Laptop();
		
		lenovo.price=60000.89;
		lenovo.RAM="6GB";
		lenovo.storage=256;
		
		asus.price=54000.48;
		asus.RAM="8GB";
		asus.storage=512;
		
		lenovo.start();
		
		System.out.println(lenovo.price);
		System.out.println(lenovo.RAM);
		System.out.println(lenovo.storage);
		
		lenovo.stop();
		
	} 
}

     class Laptop{
    	 double price;
    	 String RAM;
    	 int storage;
    	 
    	 public void start()
    	 {
    		 System.out.println("Laptop is booting");
    	 }
    	 
    	 public void stop()
    	 {
    		 System.out.println("Shut down");
    	 }
    	 public int speed()
    	 {
    		 return 100;
    	 }
     }
