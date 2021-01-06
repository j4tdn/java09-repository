package definition;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Ex03 {
	public static void main(String[] args) {
		//apple /data.txt
		File file = createFile("apple" + File.separator + "data.txt");
		System.out.println("file: " + file.getName());
		//file.delete();
		//file.renameTo();
		//file.copy
		//Files.move
	}
	private static File createFile(String path) {
		boolean isSuccess = false;
		File file = new File(path);
		File parent = file.getParentFile();
		if(!parent.exists()) {
			 parent.mkdirs();
		}
		if(!file.exists()) {
			try {
			isSuccess=	file.createNewFile();
		
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(!isSuccess) { 
			System.out.println(file.getName() + " is exitsted");
		}
		return file;
	}
}
