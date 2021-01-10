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
		if (!file.exists() || !file.canWrite()) {
			return;
		}
		
		//write file
		String line1 = "line 1";
		String line2 = "line 2";
		String line3 = "line 3";
		String line4 = "line 4";
		FileUtils.writeLine(file, line1, line2);
		
		//option2
		try {
			Files.write(path, Arrays.asList(line3, line4), StandardOpenOption.APPEND);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Desktop.getDesktop().open(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//read file
		try {
			List<String> result = Files.readAllLines(path);
			result.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
