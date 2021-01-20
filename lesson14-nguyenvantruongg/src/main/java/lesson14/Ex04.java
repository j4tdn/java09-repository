package lesson14;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex04 {
	
	
	public static void main(String[] args) {
		File file = new File("student.txt");
		List<Student> students = readFile(file.toPath());
		students.forEach(System.out::println);
		
		students.stream().sorted(Comparator.comparing(mark->mark.getMark())).forEach(System.out::println);
		
		students.stream().filter(mark-> mark.getMark()>8).forEach(System.out::println);
		
		students.stream().filter(se-> "nu".equals(se.getGt())).forEach(System.out::println);
		
	}
	
	private static List<Student> readFile(Path path) {
		List<Student> result = new ArrayList<Student>();
		try {
			List<String> element = Files.readAllLines(path);
			for ( String elements:element) {
				String [] temp = elements.split(", ");
				Student item = new Student(temp[0],temp[1],Double.parseDouble(temp[2]),temp[3]);
				result.add(item);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
