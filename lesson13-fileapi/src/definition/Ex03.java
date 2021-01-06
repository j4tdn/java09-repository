package definition;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Ex03 {
	public static void main(String[] args) {
		File file = createFile("apple" + File.separator + "data.txt");
		System.out.println("file" + file.getName());
		
		// delete
		//file.delete();
		//file.renameTo()
		//Files.copy()
		//Files.move()
	}
	
	private static File createFile(String path) {
		boolean isSuccess = false;
		File file = new File(path);
		
		File parent = file.getParentFile();
		if(!parent.exists()) {
			isSuccess = parent.mkdirs();
			if(isSuccess) {
				if(!file.exists()) {
					try {
						isSuccess = file.createNewFile();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		if(!isSuccess) {
			System.out.println(file.getName() + " is existed");
		}
		return file;
	}
}
