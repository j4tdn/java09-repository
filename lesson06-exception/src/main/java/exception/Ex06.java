package exception;

import java.io.File;
import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) {
		try {
			initFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("");
	}
	private static void initFile() throws IOException {
		File file=new File("re*adme.txt");
		if(!file.exists()) {
			//tao moi file
			file.createNewFile();
		}
		File fileava=new File("java09.txt");
		fileava.createNewFile();
	}
}
