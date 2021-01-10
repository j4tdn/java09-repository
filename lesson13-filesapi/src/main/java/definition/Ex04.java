package definition;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Random;

import utils.FileUtils;

public class Ex04 {
	public static void main(String[] args) {
		String[] extensions = {".txt", ".json", ".xml"};
		Random rd = new Random();
		for (int i = 1; i <= 10; i++) {
			String path = "filefilter"
						+ File.separator
						+ i
						+ extensions[rd.nextInt(extensions.length)];
			File file = FileUtils.createFile(path);
			System.out.println(file.getPath());
		}
		
		// file filter
		File file = new File("filefilter");
		File[] xmlFiles = file.listFiles(subFile -> subFile.isFile() && subFile.getName().endsWith(".xml"));
		System.out.println("==");
		Arrays.stream(xmlFiles).forEach(System.out::println);
	}
}
