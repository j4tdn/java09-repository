package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileUtils {
	private FileUtils() {
		
	}
	public static File[] createFile(String ...paths) {
		return Arrays.stream(paths)
				.map(path -> createFile(path))
				.toArray(File[]::new);
	}
	public static File createFile(String path) {
		boolean isSuccess = false;
		File file = new File(path);
		
		File parent = file.getParentFile();
		if(!parent.exists()) {
			isSuccess = parent.mkdirs();
			if(isSuccess) {
				if(!file.exists()) {
					try {
						isSuccess = file.createNewFile();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		if(!isSuccess) {
			System.out.println(file.getName() + " is existed");
		}
		return file;
	}
	
	public static boolean writeLine(File file, String... lines) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(bw, fw);
		}
		return true;
	}
	
	public static <E extends AutoCloseable>void close(E... element) {
		for(E e: element) {
			try {
				e.close();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
