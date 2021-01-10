package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileUtils {

	private FileUtils() {

	}

	public static File[] createFile(String... paths) {
		return Arrays.stream(paths).map(path -> createFile(path)).toArray(File[]::new);
	}

	public static File createFile(String path) {
		boolean isSuccess = false;
		File file = new File(path);

		File parent = file.getParentFile();
		if (!parent.exists()) {
			parent.mkdirs();
		}
		if (!file.exists()) {
			try {
				isSuccess = file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (!isSuccess) {
			System.out.println(file.getName() + " is existed");
		}
		return file;
	}

	// writefile
	public static void writeLine(File file, String... lines) {

		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file,true);
			bw = new BufferedWriter(fw);
			for(String line: lines) {
			bw.write(line);
			bw.newLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(bw, fw);
		}

	}

	public static <T extends AutoCloseable> void close(T... elements) {
		for (T e : elements) {
			try {
				e.close();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
