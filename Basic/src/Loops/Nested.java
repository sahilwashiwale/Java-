package Loops;

public class Nested {

	public static void main(String[] args) {
int counter=0;
       for(int i=0;i<5;i++)
       {
    	   for(int j=0;j<5;j++)
    	   {
    		   System.out.println(i);
    		   System.out.println(j);
    		   counter++;
    	   }
       }
       System.out.println(counter);//Total 25 times loop executed 
		
	}

}
