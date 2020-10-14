package exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class finallyExample {
	public static void main(String[] args) {
		try {
			writeData(new File("text.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void writeData(File file) throws IOException {
		FileWriter fw = new FileWriter(file);
		try {
			fw.write("Cheers from JAVA09\n");
			fw.write("Cheers from JAVA10" + 1/0);
			fw.write("Cheers from JAVA11\n");
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			fw.close(); //save file
		}
	}
}
