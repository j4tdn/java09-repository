package util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileUtils {
	private FileUtils() {
	}
	
	public static File createFile(String path) {
		boolean isSuccess = true;
		
		File file = new File(path);
		File parent = file.getParentFile();
		if(!parent.exists()) {
			isSuccess = parent.mkdirs();
		}
		
		if(isSuccess) {
			if(!file.exists()) {
				try {
					isSuccess = file.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return file;
	}
	
	public static File[] createFiles(String ...paths) {
		return Arrays.stream(paths)
				.map(FileUtils::createFile)
				.toArray(File[]::new);
	}
	
	public static void writeLine(File file, String... lines) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);
			
			for(String line: lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			close(bw, fw);
		}
	}
	
	public static <E extends AutoCloseable> void close(E ...elements) {
		for(E e: elements) {
			try {
				e.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
}
