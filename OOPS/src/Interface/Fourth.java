package Interface;

public class Fourth {

	public static void main(String[] args) {

	}

}

interface Folder{
	default void run()
	{
		System.out.println("this is run one");
	}
}
interface Files{
	default void run()
	{
		System.out.println("this is run two");
	}
}
   
class  Dot implements Folder,Files{
	
	
	
}
