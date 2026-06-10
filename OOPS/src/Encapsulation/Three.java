package Encapsulation;

public class Three {

	public static void main(String[] args) {
		UIDAI sahil = new UIDAI();
		sahil.SetAadhar("102020304050");
        System.out.println(sahil.getAadhar());
	}

}
  class UIDAI{
	  String aadhar_no;
	  public void SetAadhar(String aadhar)
	  {
		  if(aadhar.length()==12 && aadhar.startsWith("10"))
		  {
			  this.aadhar_no=aadhar;
		  }
	  }
	  
	  public String getAadhar() {
		  return this.aadhar_no;
	  }
  }
