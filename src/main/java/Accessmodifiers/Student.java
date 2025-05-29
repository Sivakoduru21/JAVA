package Accessmodifiers;

public class Student {
	
	public int number = 10;
	
	public Student() {
		number = 20;
	}
	
	public void printNumber() {
		System.out.println(number);
	}

	
	private void abc() {
		printNumber();
		System.out.println(number);
	}
}
