package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IO_Demo {

	public static void main(String[] args) {
		String fileName = "out.txt";
		Scanner inputStream = null;
		try {
			inputStream = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		while (inputStream.hasNextLine()) {
			String line = inputStream.nextLine();
			System.out.println(line);
		}
		inputStream.close();
	}

}
