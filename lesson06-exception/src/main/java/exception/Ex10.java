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
		System.out.println("done!");
		
	}
	
	private static void writeData(File file) throws IOException {
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			fw.write("cheer java09");
			fw.write("cheer java10");
			fw.write("cheer java11");
			//.........
			fw.write("cheer java1000");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if(fw!=null) {
				fw.close();
			}
		}
		
	}

}
