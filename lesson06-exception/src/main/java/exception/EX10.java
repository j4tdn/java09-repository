package exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EX10 {
	public static void main(String[] args) {
		try {
		writeData(new File("readme.txt"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("DONE");
	}
	private static void writeData(File file) throws IOException {
		FileWriter fw=null;
		try {
			fw=new FileWriter(file);
			fw.write("Cheer from JAVA09");
			fw.write("Cheer from JAVA10");
			fw.write("Cheer from JAVA11");
			fw.write("Cheer from JAVAk-1");
			fw.write("Cheer from JAVA09"+1/0);
			fw.write("Cheer from JAVA1000");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(fw!=null) {
			fw.close();
			}
		}
	}
}
