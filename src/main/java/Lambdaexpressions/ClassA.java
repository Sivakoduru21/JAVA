package Lambdaexpressions;

public class ClassA {

	public static void main(String[] args) {

		Audi audi = new Audi();
		audi.drive();

		Car car1 = new Car() {
			public void drive() {
				System.out.println("driving bmw");

			}
		};

		car1.drive();

		// lambda expressions usage

		Car car2 = () -> {
			System.out.println("driving tata");
			System.out.println("driving smoothly");
			System.out.println("driving at full speed");
		};
		car2.drive();

	}

}

class Audi implements Car {

	@Override
	public void drive() {
		System.out.println("driving audi");

	}

}

@FunctionalInterface
interface Car {

	public void drive();

}
