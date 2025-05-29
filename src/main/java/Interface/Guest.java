package Interface;

public class Guest {

	public static void main(String[] args) {

		Car car = new Car()

		{
			public void drive() {
				System.out.println("drive is called");
			}

		};
		
		car.drive();

	}
}
