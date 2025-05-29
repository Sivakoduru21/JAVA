package conditionalstatements;

import java.util.Scanner;

public class Conditions {


	public static void main(String[] args) {
		
	// 1. verify the number is even or odd
		
		/*
		 * Scanner input = new Scanner(System.in);
		 * System.out.println("Enter your number"); int n = input.nextInt(); if (n % 2
		 * == 0) { System.out.println(n + " is even number "); } else
		 * System.out.println(n + " is odd number ");
		 */

	// 2.exam status based on marks

		/*
		 * Scanner input = new Scanner(System.in);
		 * System.out.println("Enter your marks"); int n = input.nextInt(); if (n<35) {
		 * System.out.println("student is failed"); } else if(n==35) {
		 * System.out.println("student is just passed"); } else if(n>35 && n<70) {
		 * System.out.println("student passed in third class"); } else if(n>70 && n<85)
		 * { System.out.println("student passed in second class"); } else if(n>85) {
		 * System.out.println("student passed in first class"); }
		 */

	// 3.Based on day name using if and if else
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the day");
		String day = input.nextLine();
		if (day.equalsIgnoreCase("sunday") || day.equalsIgnoreCase("saturday")) 
		{
			System.out.println("yay it's weekend");
		} 
		else if (day.equalsIgnoreCase("monday") || day.equalsIgnoreCase("tuesday")
				|| day.equalsIgnoreCase("wednesday") || day.equalsIgnoreCase("thursday")
				|| day.equalsIgnoreCase("friday")) 
		{
			System.out.println("uff it's weekday");
		} 
		else 
		{
			System.out.println("Invalid day name");
		} 
		*/
		
	// 4.Based on day name using switch()
	/*	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the day");
	String day = input.nextLine();
	String newday = day.toLowerCase();
	switch (newday) {
	case "monday":
	case "tuesday":
	case "wednesday":
	case "thursday":
	case "friday":
		System.out.println("uff it's weekday");
		break;
	case "saturday":
	case "sunday":
		System.out.println("yayy it's weekend");
		break;
	default:
		System.out.println("Invalid day name");

	}  */
	
	// 5. verify the number is even or odd USING switch()
	
	/*
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your number");
	int n = input.nextInt();
	switch (n % 2) {
	case 0: {
		System.out.println(n + " number is even");
		break;
	}
	case 1:
	case -1: {
		System.out.println(n + " number is odd");
		break;
	}

	default:
		System.out.println(n + " number is invalid");
		break;

	}  */
		
	// 6. arithmetic operations on 2 inputs using switch()
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first number");
		int n1 = input.nextInt();
		System.out.println("Enter your second number");
		int n2 = input.nextInt();
		input.nextLine();    // reads the buffer memory(\n = enter in keyboard)
		System.out.println("Enter operation to be performed");
		String operation = input.nextLine();
		switch(operation)
		{
		case "+":
			System.out.println(n1+n2);
			break;
		case "-":
			System.out.println(n1-n2);
			break;
		case "*":
			System.out.println(n1*n2);
			break;
		case "/":
			if(n1/n2!=0)
			{
				System.out.println("negative numbers");
			}
			else
			System.out.println(n1/n2);
			break;
		case "%":
			System.out.println(n1%n2);
			break;
		default:
			System.out.println("Invalid operator");
			break;
			
		}
		
	}

}
