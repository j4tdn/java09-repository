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

		String line1 = "Hello World";
		String line2 = "My name is Huy";
		FileUtils.writeLine(file, line1, line2);

		//
		String line3 = "3Hello World";
		String line4 = "4My name is Huy";
		try {
			Files.write(path, Arrays.asList(line3, line4), StandardOpenOption.APPEND);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Desktop.getDesktop().open(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// read file
		try {
			List<String> lines = Files.readAllLines(path);
			lines.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}