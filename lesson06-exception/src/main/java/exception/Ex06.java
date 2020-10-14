package exception;

import java.io.File;
import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) {
		try {
			creatNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Back to main");
	}

	private static void creatNewFile() throws IOException {
		File file = new File("readme.txt");
		if (!file.exists()) {
			// tao moi file
			file.createNewFile();
		}
		File filejava =new File ("java09.txt");
		filejava.createNewFile();
	}
}
