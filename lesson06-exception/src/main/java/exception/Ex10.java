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
		System.out.println("Done");
	}
	
	private static void writeData(File file) throws IOException {
		FileWriter fw=null;
		try {
			fw=new FileWriter(file);
			fw.write("cheer java09");
			fw.write("cheer java010");
			fw.write("cheer java11");
			//........
			fw.write("cheer java1000");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(fw!=null) {
				fw.close();
			}
		}
		
	}
}
