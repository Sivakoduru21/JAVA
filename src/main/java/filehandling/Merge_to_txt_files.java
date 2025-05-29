package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// merge two text files into new text file
public class Merge_to_txt_files {

	public static void main(String[] args) throws IOException {
		File file1 = new File("./sample.txt");
		if (file1.exists()) {
			System.out.println(file1.exists());
		} else {
			System.out.println(file1.exists());
		}
		File file2 = new File("./sample2.txt");
		if (file2.exists()) {
			System.out.println(file2.exists());
		} else {
			System.out.println(file2.exists());
		}
		File file3 = new File("./sample3.txt");
		
		System.out.println(file3.createNewFile());

		Scanner sc1 = new Scanner(file1);
		Scanner sc2 = new Scanner(file2);

		FileWriter writer = new FileWriter(file3);

		while (sc1.hasNextLine()) {
			String currentline = sc1.nextLine();
			writer.write(currentline + System.lineSeparator());
		}
		while (sc2.hasNextLine()) {
			String currentline = sc2.nextLine();
			writer.write(currentline + System.lineSeparator());
		}

		sc1.close();
		sc2.close();
		writer.close();
        System.out.println("merged successfully");
	}

}
