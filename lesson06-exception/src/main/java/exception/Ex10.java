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
	}
	private static void writeData(File file) throws IOException {
		FileWriter fw=null;
		try {
			fw=new FileWriter(file);
			fw.write("loc");
			fw.write("loc");
			fw.write("loc");
		} catch (Exception e) {
			e.getMessage();
		}finally {
			if(fw!=null) {
				fw.close();
			}
		}
	}
}
