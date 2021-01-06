package definition;

import java.io.File;
import java.nio.file.Files;

public class Ex03 {
	public static void main(String[] args) {
		// apple/data.txt
		File file = createFile("apple" + File.separator + "data.txt");
		System.out.println("file:"+file.getName());
		
		//delete:
		file.delete();
		//rename
		//file.renameTo(dest)=cut and rename
		//Files.copy
		//Files.move
	}

	private static File createFile(String path) {
		File file = new File(path);
		boolean isSuccess = false;

		File parent = file.getParentFile();
		if (!parent.exists()) {
			isSuccess = parent.mkdirs();
		}

		if (!file.exists()) {
			try {
				isSuccess = file.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		if (!isSuccess) {
			System.out.println("Cannot create file " + file.getName() + " is existed");
		}
		return file;
	}
}
