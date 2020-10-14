package exception;

import java.io.File;
import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) {
		try {
			initFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("Back to main thread");
		
	}
	private static void initFile() throws IOException  {
		File file = new File("readme.txt");
		if(!file.exists()) {
			//tao moi file
			file.createNewFile();
			
		}
		
		File fileava = new File("Java09.txt");
		fileava.createNewFile();
	}

}
