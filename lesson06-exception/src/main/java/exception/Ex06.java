package exception;

import java.io.File;
import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) {
		try {
			createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Back to main thread");
	}

	private static void createNewFile() throws IOException {
		File file = new File("read%me.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		
		File fileava = new File("jav09.txt");
		fileava.createNewFile();
	}
}
