package definition;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.management.RuntimeErrorException;

public class Ex01 {
	//Ex01: create file current_project: data.txt 
	public static void main(String[] args) throws IOException {
		//info files
		File file = createFile("data.txt");
		System.out.println("Name: " + file.getName());
		System.out.println("path: " + file.getPath());
		System.out.println("absolute: " + file.getAbsolutePath());
		System.out.println("canical path: " + file.getCanonicalPath());
		Path path = Paths.get("info.txt");
		Files.createFile(path);
		System.out.println("Name: " + path.getName(0));
	}
	private static File createFile(String path) {
		boolean isSuccess = false;
		File file = new File(path);
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
