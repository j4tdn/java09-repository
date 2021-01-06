package definition;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex01 {
	// Ex01: create file data.txt
	public static void main(String[] args) throws IOException {
		File file = createFile("data.txt");
		
		Path path = Files.createFile(Paths.get("info.txt"));
		System.out.println("path: " + path.getName(0));
		
		System.out.println("name: " + file.getName());
		System.out.println("path: " + file.getPath());
		System.out.println("absolute path: " + file.getAbsolutePath());
		System.out.println("canonical path: " + file.getCanonicalPath());
	}
	
	private static File createFile(String path) {
		File file = new File(path);
		if(file.exists()) {
			return file;
		}
		
		try {
			if(!file.exists()) {
				throw new RuntimeException("cannot create new file");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return file;
	}
}
