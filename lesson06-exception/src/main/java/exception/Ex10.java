package exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex10 {
	public static void main(String[] args) {
		try {
			writeData(new File("readme.txt"));	
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("DONE");
		
	}
	private static void writeData(File file) throws IOException {
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			fw.write("cheers from JAVA099\n");
			fw.write("cheers from JAVA010\n");
			fw.write("cheers from JAVA011");
			//................
			fw.write("cheers from JAVA01000000");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			if(fw != null) {
				fw.close();
			}
			
		// NPE -- close asa write file
		// fw.close()
		}
	}
}
