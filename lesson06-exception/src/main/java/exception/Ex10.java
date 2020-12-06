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
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			fw.write("Cheers from JAVA09\n");
			fw.write("Cheers from JAVA10\n");
			fw.write("Cheers from JAVA11");
			fw.write("Cheers from JAVAK-1");
			// .. k-1
			fw.write("Cheers from JAVAK " + 1/0);
			
			// ...... k
			fw.write("Cheers from JAVA1000");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				fw.close();
			}
		}
		
		// NPE -- close asa write file
		// fw.close();
	}
}
