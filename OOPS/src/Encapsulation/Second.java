package Encapsulation;

public class Second {

	public static void main(String[] args) {


		Car swift = new Car();
		swift.setColor("whiTE");
		System.out.println(swift.getcolor());
		
		
	}

}
 class Car{
	 private String color;
	 
	 public void setColor(String color_name)
	 {
		 if(color_name.equalsIgnoreCase("white") || color_name.equalsIgnoreCase("black"))
		 {
			 this.color=color_name;
		 }
	 }
	 
	 public String getcolor()
	 {
		 return this.color;
	 }
 }
