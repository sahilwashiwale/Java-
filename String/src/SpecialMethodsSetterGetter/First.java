package SpecialMethodsSetterGetter;

public class First {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.Setemail("sahilwashiwale@gmail.com");
		e1.Setphone("7021492413");
		e1.Setid(8);
		System.out.println(e1.Getemail());
		System.out.println(e1.Getmobile());
		System.out.println(e1.Getid());
		System.out.println("***************************");
		Employee e2 = new Employee();
		e2.Setemail("vaibhavubhe@gmail");
		e2.Setemail("yash@gmail.com");//override/reassign
		e2.Setphone("6281002288");
		System.out.println(e2.Getemail());
		System.out.println(e2.Getmobile());

	}

}
    class Employee{
    	int emp_id;
    	String ename;
    	String phone_no;
    	String email;
    	
    	public void Setid(int id1)
    	{
    		if(id1%2==0)
    		{
    			this.emp_id=id1;
    		}
    	}
    	
    	public void Setname(String name2)
    	{
    		if(name2.length()>=2)
    		{
    			this.ename=name2;
    		}
    	}
    	
    	public void Setphone(String phone2)
    	{
    		if(phone2.length()==10)
    		{
    			if(phone2.startsWith("9") || phone2.startsWith("8") || phone2.startsWith("7"))
    			{
    				this.phone_no=phone2;
    			}
    		}
    	}
    	
    	public void Setemail(String email2)
    	{
    		if(email2.endsWith("@gmail.com"))
    		{
    			this.email=email2;
    		}
    	}
    	
    	public String Getemail()
    	{
    		return this.email;
    	}
    	
    	public String Getmobile()
    	{
    		return this.phone_no;
    	}
    	
    	public int Getid()
    	{
    		return this.emp_id;
    	}
    	
    	
    }
 