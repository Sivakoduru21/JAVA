package filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import java.util.Arrays;
import java.util.Date;

public class Filehandling {

	
	/*
	 * public static void main(String[] args) throws IOException { File file = new
	 * File("D:\\Testfiles\\Resume.pdf"); if (file.exists())
	 * System.out.println(file.exists()); else
	 * System.out.println(file.createNewFile()); System.out.println(file.delete());
	 */
	 
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\JAVA\\src\\test\\resources\\resources");

		System.out.println(Arrays.toString(file.list()));
		System.out.println(new Date(file.lastModified()));
		System.out.println(file.mkdirs());
		System.out.println(file.delete());
		System.out.println(file.exists());

		System.out.println(file.createNewFile());
	}

}
