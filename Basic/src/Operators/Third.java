package Operators;

public class Third {

	public static void main(String[] args) {
		//*******Logical Opt(&&,||,!)*******
		//always going to work on boolean value.
	//or works output of relationsl operator.
		 
       System.out.println(12>20 && 20>10);//AND opt
       System.out.println(12>20 || 20>10);//OR opt
       System.out.println(!(12>20));
       // u can combine multiple logical opt together like
      System.out.println(!(30>40 && 23<47 || 10>30));
                            // !(false||false)=>true
	}

}
