package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Readfile {

	// .READING FILE USING FIS
	public static void main(String[] args) throws IOException {

		/*
		 * File file = new File("./sample.txt"); if (!file.exists()) {
		 * System.out.println(file.createNewFile()); }
		 * 
		 * FileInputStream fis = new FileInputStream(file); int asciicode; while
		 * ((asciicode = fis.read()) != -1) { System.out.print((char) asciicode); }
		 * fis.close();
		 */

		// 2.READING FILE USING SCANNER

		/*
		 * File file = new File("./sample.txt"); if (!file.exists()) {
		 * System.out.println(file.createNewFile()); }
		 * 
		 * Scanner input = new Scanner(file); while (input.hasNext()) {
		 * System.out.println(input.nextLine()); }
		 * 
		 * input.close();
		 */
		/*
		 * File file = new File("./sample.txt"); if (!file.exists()) {
		 * System.out.println(file.createNewFile()); } FileReader fr = new
		 * FileReader(file); int asciicode; String text = new String(); while
		 * ((asciicode = fr.read()) != -1) { text += String.valueOf((char) asciicode);
		 * System.out.print((char) asciicode); } System.out.println();
		 * System.out.println(text);
		 */

		/*
		 * File file = new File("./sample.txt"); if (!file.exists()) {
		 * System.out.println(file.createNewFile()); } FileReader fr = new
		 * FileReader(file); BufferedReader br = new BufferedReader(fr); int asciicode;
		 * String text = new String(); while ((asciicode = br.read()) != -1) { text +=
		 * String.valueOf((char) asciicode); System.out.print((char) asciicode); }
		 * 
		 * System.out.println(text);
		 */

		File file = new File("./sample.txt");
		if (!file.exists()) {
			System.out.println(file.createNewFile());
		}
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		String line = new String();
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}

	}

}
