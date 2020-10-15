package exception;

import java.io.File;
import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) {
		try {
			intitFile();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("back to main thread !!! ");
		
		
		
	}
	private static void intitFile() throws IOException {
		File fileava = new File("readme.txt");
		if(!fileava.exists()) {
			//tao moi file
			fileava.createNewFile();
		}
		File folder = new File("java09.txt");
		folder.mkdir();
	}
}

