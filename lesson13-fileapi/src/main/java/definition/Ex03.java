package definition;

import java.io.File;
import java.io.IOException;

public class Ex03 {
	// apple/data.txt
	public static void main(String[] args) {
		File file = createFile("apple"+ File.separator + "data.txt");
		
//		file.delete();
//		file.renameTo();
//		Files.copy(source, out)
//		Files.move(source, target, options)
	}
	
	private static File createFile (String path) {
		boolean isSuccess = false;
		File file = new File(path);
		File parent = file.getParentFile();
		if (!parent.exists()) {
			isSuccess = parent.mkdirs();
		}
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
