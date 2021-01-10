package definition;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.management.RuntimeErrorException;

public class Ex01 {
	// ex01: create file data.txt
	public static void main(String[] args) throws Exception {
		File file = createFile("data.txt");

		// info file
		System.out.println("name   " + file.getName());
		System.out.println("path   " + file.getPath());
		System.out.println("absolutepath   " + file.getAbsolutePath());
		System.out.println("canonical    " + file.getCanonicalPath());


		Path path=Paths.get("info.txt");
		 Files.createFile(path);
		 System.out.println("name   "+path.getName(0));
	}

	private static File createFile(String path) {

		boolean isSuccess = false;
		File file = new File(path);
		if (!file.exists()) {
			try {
				isSuccess = file.createNewFile();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (!isSuccess) {
			System.out.println(file.getName() + "is existed");
		}
		return file;
	}
}