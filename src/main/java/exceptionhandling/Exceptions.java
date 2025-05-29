package exceptionhandling;

public class Exceptions {

	public static void main(String[] args) {
		System.out.println("progarm started");
		int a = 20;
		int b = 10;
		int result = 0;
		try {
			result = a / b;
		} 
		catch (ArithmeticException ae) {

			System.out.println(ae.toString());
			System.out.println(ae.getMessage());

			ae.printStackTrace();

			throw ae;

		} 
		finally {
			System.out.println("final block");
		}

		System.out.println("output is: " + result);
		System.out.println("program ended");

	}

}
