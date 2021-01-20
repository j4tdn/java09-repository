package ex04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex04 {
	public static void main(String[] args) {
		String path = "student.txt";
		List<Student> students = getStudentFromFile(path);
		students.forEach(t -> System.out.println(t));
		System.out.println("-------------------------------------");
		List<Student> require1 = sortStudentBy(students);
		require1.forEach(t -> System.out.println(t));

		System.out.println("-------------------------------------");
		List<Student> require2 = findFemaleStudent(students);
		require2.forEach(t -> System.out.println(t));
		System.out.println("-------------------------------------");
		List<Student> require3 = findStudentByScore(students);
		require3.forEach(t -> System.out.println(t));

		System.out.println("-------------------------------------");
		List<Student> require4 = distinctStudent(students);
		require4.forEach(t -> System.out.println(t));

	}

	public static List<Student> getStudentFromFile(String path) {
		List<Student> students = new ArrayList<>();
		try {
			List<String> lines = Files.readAllLines(Paths.get(path));

			students = lines.stream().map(s -> {
				String[] props = s.split(", ");
				return new Student(props[0], props[1], Float.valueOf(props[2]), props[3]);
			}).collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return students;
	}

	public static List<Student> sortStudentBy(List<Student> students) {
		return students.stream().sorted(Comparator.comparing(Student::getScore).thenComparing(Student::getName))
				.collect(Collectors.toList());
	}

	public static List<Student> findFemaleStudent(List<Student> students) {
		return students.stream().filter(s -> s.getGender().equals("Nu")).collect(Collectors.toList());
	}

	public static List<Student> findStudentByScore(List<Student> students) {
		return students.stream().filter(s -> s.getScore() > 8f).collect(Collectors.toList());
	}

	public static List<Student> distinctStudent(List<Student> students) {
		return students.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.stream().filter(e -> e.getValue() == 1).map(Entry::getKey).collect(Collectors.toList());
	}
}
