package definition;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		// create file current project data.txt
		File file = createFile("data.txt");
		
		// info file
		System.out.println("Name:" + file.getName());
		System.out.println("Path:" + file.getPath());
		System.out.println("Absolute Path:" + file.getAbsolutePath());
		System.out.println("Canonical Path:" + file.getCanonicalPath());
		
		Path path = Paths.get("info.txt");
		Files.createFile(path);
		System.out.println("Name:" + path.getName(0));
	}
	
	private static File createFile (String path) {
		boolean isSuccess = false;
		File file = new File(path);
		try {
			if (!file.exists()) {
				isSuccess = file.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (!isSuccess) {
			System.out.println(file.getName() + " is existed");
		}
		return file;
	}
}
