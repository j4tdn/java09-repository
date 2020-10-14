package exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex10 {
	public static void main(String[] args) {
		writeDate(new File("readme.txt"));
	}
	
	private static void writeDate(File  file )  {
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			fw.write("cheers from java09\n");
			fw.write("cheers from java10");
			//.....
			//....k + 1/0);
			fw.write("cheers from java1000");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(fw != null) {
					fw.close();			
				}				
			} catch (Exception e2) {
				e2.getMessage();
			}
		}
	}
}
