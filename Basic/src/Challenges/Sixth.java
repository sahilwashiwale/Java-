package Challenges;

import java.util.ArrayList;

public class Sixth {

	public static void main(String[] args) throws Exception {
			
		ArrayList<HotelRen> list = new ArrayList<HotelRen>();
		HotelRen h1 = new HotelRen("Sahil");
		HotelRen h2 = new HotelRen("xahil");
		list.add(h1);
		list.add(h2);
		System.out.println(list);

	}
}

  class HotelRen
  {
	  
	  String name;

	public HotelRen(String name) throws Exception {
		
		this.name = name;
		if(name.length()!=5)
		{
			throw new Exception();
		}
	}
	  
	public String toString()
	{
		return this.name;
		
	}
	  
	  
  }

  


