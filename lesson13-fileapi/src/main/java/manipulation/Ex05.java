package manipulation;

import java.io.File;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import bean.Grade;
import bean.Student;
import utils.FileUtils;

public class Ex05 {
	private static final String pathname = "json/student.json";

	public static void main(String[] args) {
		File file = FileUtils.createFile(pathname);
		Student student = getStudent();

		// convert object to JSON file
		FileUtils.writeJson(file, student);
		FileUtils.open(file);
		System.out.println(FileUtils.writeJsonAsString(student));
		// convert object to json string'

		Optional<Student> result = FileUtils.readJson(file, Student.class);
		result.ifPresent(System.out::println);
	}

	private static Student getStudent() {
		Student student = new Student();
		List<String> languages = Arrays.asList("C", "C++", "Java", "PHP");
		List<Grade> grades = Arrays.asList(new Grade("T1", "11T1"), new Grade("T2", "11T2"), new Grade("T3", "11T3"));

		Map<String, BigDecimal> points = new HashMap<>();
		points.put("C", BigDecimal.valueOf(8));
		points.put("C++", BigDecimal.valueOf(8));
		points.put("Java", BigDecimal.valueOf(8));
		points.put("PHP", BigDecimal.valueOf(8));

		student.setId("102");
		student.setName("Chien");
		student.setLanguages(languages);
		student.setPoints(points);
		student.setGrades(grades);
		return student;
	}
}
