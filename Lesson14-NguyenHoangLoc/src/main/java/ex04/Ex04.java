package ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


public class Ex04 {
	public static void main(String[] args) {
		File file = new File("student.txt");
		List<Student> students = readFile(file.toPath());
//		students.forEach(System.out::println);
//		
		System.out.println("=====1======");
//
		students.stream().sorted(Comparator.comparing(Student::getPoint)).forEach(System.out::println);

		System.out.println("=====2======");
		students.stream().filter(point -> point.getPoint()>8).forEach(System.out::println);
		
		
		System.out.println("=====3======");
		
		students.stream().filter(sex -> "nu".equals(sex.getSex().toLowerCase())).forEach(System.out::println);
		System.out.println("============");
		
	}

	private static List<Student> readFile(Path path) {
		List<Student> result = new ArrayList<Student>();
		try {
			List<String> list = Files.readAllLines(path);
			for (String elements : list) {
				String[] arr = elements.split(", ");
				Student studen = new Student(arr[0], arr[1], Double.parseDouble(arr[2]), arr[3]);
				result.add(studen);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
}
