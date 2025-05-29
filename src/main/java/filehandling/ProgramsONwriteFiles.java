package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProgramsONwriteFiles {

	// 1.program to print number of characters present in a text file using fis

	public static void main(String[] args) throws IOException {

		/*
		 * File file = new File("./sample.txt"); if (!file.exists())
		 * file.createNewFile(); else System.out.println(file.exists());
		 */

		/*
		 * FileInputStream fis = new FileInputStream(file); int asciicode=0; int
		 * count=0; while((asciicode=fis.read()) !=-1) {
		 * //System.out.print((char)asciicode); count++;
		 * 
		 * } System.out.println(count);
		 */

		/*
		 * Scanner sc = new Scanner(file); while (sc.hasNext()) {
		 * System.out.println(sc.nextLine()); } sc.close();
		 */
		
		
		//2.print number of lines in the .txt

		/*
		 * Scanner sc = new Scanner(file); int count=0; while (sc.hasNextLine()) {
		 * //System.out.println(sc.nextLine()); sc.nextLine(); count++; }
		 * System.out.println(count); sc.close();
		 */
		
		//3.find lengthy line in a text file
		
		/*
		 * Scanner sc = new Scanner(file); int count = 0; int largelinelength = 0;
		 * String largeline = " "; while (sc.hasNextLine()) { String currentline =
		 * sc.nextLine(); int currentlinelength = currentline.length();
		 * 
		 * if (largelinelength < currentlinelength) { largelinelength =
		 * currentlinelength; largeline = currentline; }
		 * 
		 * } System.out.println("largest line is: " + largeline);
		 * System.out.println("length of the largest line: "+largelinelength );
		 */
		
		//4.print number of words in the .txt

		
		/*
		 * Scanner sc = new Scanner(file); int count = 0; int totalwordcount=0; while
		 * (sc.hasNextLine()) { String line = sc.nextLine(); String words[] =
		 * line.split(" "); int lengthofline = words.length; totalwordcount =
		 * totalwordcount+lengthofline; }
		 * 
		 * System.out.println(totalwordcount); sc.close();
		 */
		
		//5.program to find occurence of a given word in text file
		
		/*
		 * Scanner input = new Scanner(System.in);
		 * System.out.println("ENTER THE WORD TO BE VERIFIED"); String repeatedword =
		 * input.nextLine();
		 * 
		 * Scanner sc = new Scanner(file); int count = 0; while (sc.hasNextLine()) {
		 * 
		 * String currentline = sc.nextLine(); String current[] =
		 * currentline.split(" ");
		 * 
		 * for (int i = 0; i < current.length; i++) { if
		 * (repeatedword.equalsIgnoreCase(current[i])) { repeatedword = current[i];
		 * count++; } }
		 * 
		 * } //System.out.println(repeatedword); System.out.println(count);
		 */
		
		//6.program to convert existing text in a file to uppercase data in other file
		
		/*
		 * File tempfile = new File("./tempsample.txt"); tempfile.createNewFile();
		 * 
		 * 
		 * FileWriter writer = new FileWriter(tempfile);
		 * 
		 * Scanner sc = new Scanner(file); while(sc.hasNextLine()) { String currentline
		 * = sc.nextLine(); //currentline = currentline.toUpperCase();
		 * writer.write(currentline.toUpperCase() + System.lineSeparator());
		 * 
		 * } sc.close(); writer.close();
		 * 
		 * System.out.println("data updated successfully");
		 */
		//6.program to convert existing text in a file to uppercase data in same file
		
		File tempfile = new File("./tempsample.txt");
		if (!tempfile.exists())
			tempfile.createNewFile();
		else
			System.out.println(tempfile.exists());

		File tempfile2 = new File("./tempsample2.txt");
		tempfile2.createNewFile();

		FileWriter writer = new FileWriter(tempfile2);

		Scanner sc = new Scanner(tempfile);
		while (sc.hasNextLine()) {
			String currentline = sc.nextLine();
			// currentline = currentline.toUpperCase();
			writer.write(currentline.toUpperCase() + System.lineSeparator());

		}
		sc.close();
		writer.close();
		
		 if (tempfile.delete()) {
	            if (tempfile2.renameTo(tempfile)) {
	                System.out.println("Data updated successfully.");
	            } else {
	                System.out.println("Failed to rename the temporary file.");
	            }
	        } else {
	            System.out.println("Failed to delete the original file.");
		}

	}

}
