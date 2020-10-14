package exception;

import java.io.File;
import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) {
		try {
			initNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Back to main");
	}
	
	private static void initNewFile() throws IOException {
		File file = new File("rea%$*dme.txt");
		if(!file.exists()) {
			//tao moi file
			file.createNewFile();
			
		}
		File fileava = new File("java09.txt");
		fileava.createNewFile();
		//checked -CompileException extends exception
		//unChecked - runtionException extends RuntimeException
	}
}
