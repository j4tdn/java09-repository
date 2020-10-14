package exception;

import java.io.File;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) {
		try {
			createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main thread");
	}
	private static void createNewFile() throws IOException {
		File file = new File("readme.txt");//khoi tao file readme trong thu muc hien co
		if (!file.exists()) {
			file.createNewFile();//bay h ms tao file
		}
		File filejava = new File("java09.txt");
		filejava.createNewFile();
	}
}
