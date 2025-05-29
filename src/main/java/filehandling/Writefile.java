package filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writefile {

	public static void main(String[] args) throws IOException {
		
		File file = new File("./sample2.txt");
		if(!file.exists())
		file.createNewFile();
		
		FileOutputStream fos = new FileOutputStream(file);
		String text = "hello shiva prasad koduru";
		for(char ch:text.toCharArray())
		{
			fos.write((ch));
		}
		/*
		 * fos.write(72); fos.write(69); fos.write(76); fos.write(76); fos.write(79);
		 */
		fos.close();
	}

}
