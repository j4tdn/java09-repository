package exception;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex06 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		try {
			createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Back to main thread");
	}
	
	private static void createNewFile() throws IOException {
		File file = new File("readme.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		
//		File folder = new File("JAVA09");
//		folder.mkdir();
	}
}
