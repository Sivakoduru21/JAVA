package Inheritance;

public class User {

	public static void main(String[] args) {
		
		Guest guest = new Guest();
		guest.Read();
		
		Developer developer = new Developer();
		developer.Write();
		developer.Read();
		
		Administrator administrator = new Administrator();
		administrator.Manage();
		administrator.Read();
		administrator.Write();
		
	}
}
