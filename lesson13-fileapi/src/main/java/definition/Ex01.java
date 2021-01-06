package definition;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex01 {
	// Ex01: create file current_project/data.txt
	public static void main(String[] args) throws IOException {
		File file = createFile("data.txt");
		
		Path path = Paths.get("infor.txt");
		Files.createFile(path);
		
		System.out.println("name:" + path.getName(0));	
		
		
		//infor file 
		System.out.println("name: " + file.getName());
		System.out.println("path: " + file.getPath());
		System.out.println("AbsolutePath: " + file.getAbsolutePath());
		System.out.println("CanonicalPath: " + file.getCanonicalPath());
	}
	private static File createFile(String path) {
		boolean isSuccess = false;
		File file = new File(path);
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
