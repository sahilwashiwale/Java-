package Non_Primitives;

public class Third {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.name="The Ghost";
		book2.name="Mumbai Crimes";
		
		book1.author="C.P.Ranade";
		book2.author="P.L.Deshpande";
		
		book1.open();
		
		System.out.println(book1.name);
		System.out.println(book1.author);

	}
}
class Book{
	String name;
	String author;
	
	public void open()
	{
		System.out.println("Start the reading");
	}
	
}
