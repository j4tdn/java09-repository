package manipulation;

import java.awt.Desktop;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

import utils.FileUtils;

public class Ex01 {
	private static final String pathname ="apple" + File.separator + "data.txt";
	public static void main(String[] args) {
		File file = new File(pathname);
		Path path = Paths.get(pathname);
		
		
		
		
		if (!file.exists() || !file.canWrite()) {
			return;
		}
		String line1 = "welcome to class111111";
		String line2 = "welcome to class2222";
		String line3 = "welcome to class33333";
		String line4 = "welcome to class444444";
		FileUtils.writeLine(file, line1, line2);
		
		
		
		try {
			Desktop.getDesktop().open(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//option2
		try {
			Files.write(path, Arrays.asList(line3, line4), StandardOpenOption.APPEND);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//option2
		try {
			List<String> result = Files.readAllLines(path);
			result.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}
}
