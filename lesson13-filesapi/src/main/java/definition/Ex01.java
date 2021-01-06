package definition;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.management.RuntimeErrorException;

public class Ex01 {
	public static void main(String[] args) throws Exception {
		//ex01: create data.txt
			File file = createFile("data.txt");
			System.out.println("name: "+file.getName());
			System.out.println("path: "+file.getPath());
			System.out.println("absolutepath: "+file.getAbsolutePath());
			System.out.println("canonicapath: "+file.getCanonicalPath());
			
			Path path = Paths.get("info.txt");
			Files.createFile(path);
			System.out.println("name: " + path.getName(0));
			
	}
		private static File createFile(String path) {
			boolean isSuccess = false;
			File file = new File(path);
			if(!file.exists()) {
				try {
					isSuccess=file.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (!isSuccess) {
				System.out.println(file.getName()+" is existed");	
			}
			return file;
		}
}
