package Interface;


@FunctionalInterface
public interface Car {    //functional interface has only one abstract method
	
	void drive();    
	
	default void honk() {  //this method can use many times
		
	}
	
	static void light() {   //this method can use many times
		
	}
	
	
	
}
