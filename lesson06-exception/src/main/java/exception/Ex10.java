package exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex10 {
	public static void main(String[] args) {
		
		try {
			writeData(new File("readme.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("DONE");
		
	}
	private static void writeData(File file) throws IOException {
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			fw.write("Cheers from JAVA 9\n");
			fw.write("Cheers from JAVA 10\n");
			fw.write("Cheers from JAVA K-1\n");
			fw.write("Cheers from JAVA K\n");
			fw.write("Cheers from JAVA 1000");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				fw.close();
			}
		}
	}
}
