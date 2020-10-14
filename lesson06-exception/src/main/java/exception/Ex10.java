package exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex10 {
	public static void main(String[] args) {
		try {
			writeData(new File("readme.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("DONE");
	}

	private static void writeData(File file) throws IOException {
		FileWriter fw = new FileWriter(file);
		try {

			fw.write("Cheers from JAVA09\n");
			fw.write("Cheers from JAVA10\n");
			fw.write("Cheers from JAVA11\n");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fw != null) {
				fw.close();// save file
			}
		}

	}
}
