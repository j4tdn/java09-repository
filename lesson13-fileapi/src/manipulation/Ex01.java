package manipulation;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

import utils.FileUtils;

public class Ex01 {
	private static final String pathname = "apple" + File.separator + "data.txt";
	
	public static void main(String[] args) {
		File file = new File(pathname);
		Path path = Paths.get(pathname);
		if(!file.exists() || !file.canWrite()) {
			return;
		}
		// write file
		// option 1
		String line1 = "welcome to class";
		String line2 = "Nice to learn with you";
		String line3 = "Line 3";
		String line4 = "Line 4";
		
		FileUtils.writeLine(file, line1);
		FileUtils.writeLine(file, line2);
	
		
		try {
			Desktop.getDesktop().open(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//option 2
			try {
				Files.write(path, Arrays.asList(line3,line4), StandardOpenOption.APPEND);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			// read file
			List<String> result;
			try {
				result = Files.readAllLines(path);
				result.forEach(System.out::printf);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
}
