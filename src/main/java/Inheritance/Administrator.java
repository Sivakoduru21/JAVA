package Inheritance;

public class Administrator extends Developer {

	public void Manage() {

		Read();
		//(or)
		super.Read(); //need to access only read method from parent not the method in same class
		
		Write();
		System.out.println("Manage code");
	}
	
	 public void Read() {
			System.out.println("special read for administrator");

	 }
}

   

	


