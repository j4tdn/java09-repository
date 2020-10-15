package exception;

import java.io.File;
import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) {
		try {
			createNewFile();
		} catch (IOException e) {
			// TODO: handle exception
		}
		System.out.println("Back to main thread");
	}
	private static  void createNewFile() throws IOException {
		File file=new File("readme.txt");
		if(file.exists()) {
			file.createNewFile();
		}
		File fileleava=new File("java09.txt");
		fileleava.createNewFile();
	}
}
