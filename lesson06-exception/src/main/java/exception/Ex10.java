package exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex10 {
	public static void main(String[] args) {
		try {
			writeData(new File("readme.txt"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done");
	}
	private static void writeData(File file) throws IOException {
		FileWriter fw= null;
		try {
			 fw = new FileWriter(file);
			fw.write("Cheers from java09\n");
			fw.write("Cheers from java10\n");
			fw.write("Cheers from java11");
			fw.write("Cheers from java n-1");
			fw.write("Cheers from java n+1"+1/0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if ( fw!= null) {
				fw.close();
			}
		}
	}
}
