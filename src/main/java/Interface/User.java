package Interface;

public class User {

	
	public static void main(String[] args) {
		
		
		Lenovo lenovo = new Lenovo();
		HP hp = new HP();
		Apple apple = new Apple();
		
		Laptop.privacy();
		lenovo.copy();
		lenovo.camera();
		lenovo.security();
		
		
		hp.printing();
		apple.logo();
	}
}
