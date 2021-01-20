package exercises;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import bean.Student;

public class Ex04 {
	public static void main(String[] args) {
		String fileName = "student.txt";
		File file = new File(fileName);
		List<Student> students = getAll(file);
		Comparator<Student> pre = Comparator.comparing(Student::getMark).thenComparing(Student::getName);
		students.stream().sorted(pre).forEach(System.out::println);
		System.out.println("==");
		students.stream().filter(t->t.getMark()>8).forEach(System.out::println);
		System.out.println("==");
		students.stream().filter(t->t.getGende().compareTo("Nu") == 0).forEach(System.out::println);
		
	}
	
	private static List<Student> getAll(File file) {
		List<Student> students = new ArrayList<>();
		List<String> result = null;
		try {
			result = Files.readAllLines(file.toPath());
			students = result.stream().map(line -> transfer(line)).collect(Collectors.toList());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return students;
		
	}
	
	private static Student transfer(String line) {
		String[] e = line.split(", ");
		if (e.length != 4) {
			throw new IllegalArgumentException();
		}
		return new Student(e[0], e[1], Double.valueOf(e[2]), e[3]);
	}
}
