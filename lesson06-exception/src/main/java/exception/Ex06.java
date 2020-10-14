package exception;

import java.io.File;
import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) {
		try {
			initNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Back to main thread");
	}
	
	private static void initNewFile() throws IOException {
		File file = new File("re%&&adme.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		File filejava = new File("java09.txt");
		filejava.createNewFile();
	}
	// checked : (compile exception ) T extends Exception
	// unchecked : (runtime exception ) T extends RuntimeException
}
