package exceptionhandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.security.auth.login.LoginException;



public class ExceptionsMain { // throws Throwable for all exceptions

	public static void main(String[] args) throws Throwable {
		/*
		 * File file = new File("./sample.txt"); if (!file.exists())
		 * file.createNewFile(); else System.out.println(file.exists());
		 * 
		 * Scanner sc = new Scanner(file); int count = 0; int largelinelength = 0;
		 * String largeline = " "; while (sc.hasNextLine()) { String currentline =
		 * sc.nextLine(); int currentlinelength = currentline.length();
		 * 
		 * if (largelinelength < currentlinelength) { largelinelength =
		 * currentlinelength; largeline = currentline;
		 * 
		 * } } System.out.println("largest line is: " + largeline);
		 * System.out.println("length of the largest line: " + largelinelength);
		 */
		
		/*
		 * try { int a = 20; //[doubt] int b = 0; int result = 0; result = a / b;
		 * System.exit(0); } catch (Exception e1) { System.out.println("catch");
		 * 
		 * } finally { System.out.println("result");
		 * 
		 * }
		 */
		
		try {
			int result = 20/0;
		} catch (ArithmeticException e1) {
			throw new LoginException("waste fellow don't divide with zero");

		} finally {
			System.out.println("result");

		}

	}

}
