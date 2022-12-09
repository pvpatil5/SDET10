package testng.practice;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataintxtfile {

	public static void main(String[] args) throws IOException {
		String text="Hi i am writing the data into txt file";
		
		FileOutputStream fileOutputStream = new FileOutputStream("./writedata.txt");
		
		byte[] strtobytes = text.getBytes();
		
		fileOutputStream.write(strtobytes);
	

	}

}
