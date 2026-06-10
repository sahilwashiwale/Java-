package Inheritance;

public class Hybrid {

	public static void main(String[] args) {

		//Hybrid=> more than one types of inheritance 
		//at the work 
		//exp=> a)hierarchical=>Pets=1.Dog,2.Cat
		//      b)multilevel=>Pets->Cat->Pillu
		//      c)single level=>Pets->dog

	Dog d= new Dog();
	d.sound();
	d.dogsound();
	

	Pillu p = new Pillu();
	p.catsound();
	
	

	}

}
    class Pets{
    	public void sound()
    	{
    		System.out.println("sound of pets");
    	}
    }
    
    class Dog extends Pets{
    	public void dogsound()
    	{
    		System.out.println("Barkingggg");
    	}
    }
    
    class Cat extends Pets{
    	public void catsound()
    	{
    		System.out.println("MEowwwww");
    	}
    }
    
    class Pillu extends Cat{
    }
    
    