package definition;

import java.io.File;
import java.io.IOException;


public class Ex03 {
	//apple/data.txt
	public static void main(String[] args) {
		 File file = createFile("apple/data.txt");
		 System.out.println("file:" + file.getName());
		 
		 
		 //delete
		 //file.delete();
		 //file.renameTo();
		 //Files.copy(source, out);
		 //File.move
		 
	}
	private static File createFile(String path) {
		boolean isSuccess = false;
		File file = new File(path);
		
		File parent = file.getParentFile();
		if(!parent.exists()) {
			isSuccess =  parent.mkdirs();
		}
		
		if(!file.exists()) {
			try {
				file.createNewFile();
				isSuccess = true;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if(!isSuccess) {
			System.out.println(file.getName() + " is existed.");
		}
		return file;
	}
}
