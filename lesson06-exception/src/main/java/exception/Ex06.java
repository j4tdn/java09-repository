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
		
		System.out.println("Back to main");
		
	}
	
	private static void initFile() throws IOException {
		File file = new File("readme.txt");
		if (!file.exists()) {
			//Tao moi file
			file.createNewFile();
		}
		
		File folder = new File("java09.txt");
		folder.createNewFile();
	}
}
