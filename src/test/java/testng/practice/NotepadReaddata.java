package testng.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NotepadReaddata {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fileInputStream = new FileInputStream("./Read Data.txt");

		Scanner scanner = new Scanner(fileInputStream);
		
		while(scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
	}

}
