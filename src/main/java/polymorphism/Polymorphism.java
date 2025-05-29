package polymorphism;

public class Polymorphism {

	public void add(int a, int b) {
		int sum = a + b;
		System.out.println(sum);

	}

	public void add(int a, int b, int c) {

	}

	public void add(double a, double b) {

	}

	public void add(int b, String a) {
		String sum = a + b;
		System.out.println(sum);

	}

	public static void main(String[] args) {

		Polymorphism object = new Polymorphism();
		object.add(50, 50);
		object.add(4,"shiva");

	}

}
