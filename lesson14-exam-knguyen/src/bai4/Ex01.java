package bai4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ex01 {
	public static void main(String[] args) {
		String pathname= "D:\\java09\\workspace\\javacore\\java09-repository\\lesson14-exam-knguyen\\student.txt";
		Path path = Paths.get(pathname);
		File file = new File(pathname);
		try {
			List<String> result = Files.readAllLines(path);
			result.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

