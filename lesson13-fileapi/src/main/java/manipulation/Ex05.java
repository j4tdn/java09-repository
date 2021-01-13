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
import static utils.FileUtils.*;
public class Ex05 {
	private  static final String pathname = "json/student.json";
	
	public static void main(String[] args) {
		File file = FileUtils.createFile(pathname);
				
		Student student = getStudent();
		
		//convert object to json file
		//writeJson(file, student);
		//open(file);
		
		//convert object to json string
		System.out.println(writeJsonAsString(file, student));
		
		// convert json file to object
		Optional<Student> result = readJson(file, Student.class);
		result.ifPresent(System.out::println);
		
	}
	
	private static Student getStudent() {
		Student student = new Student();
		List<String> languages = Arrays.asList("C", "C++", "php","java");
		List<Grade> grades = Arrays.asList(
				new Grade("T1","11T1"),
				new Grade("T2","12T2"),
				new Grade("T3","13T3")
				);
		Map<String, BigDecimal> points = new HashMap<>();
		points.put("C", BigDecimal.valueOf(8));
		points.put("C++", BigDecimal.valueOf(8.5));
		points.put("php", BigDecimal.valueOf(9));
		points.put("java", BigDecimal.valueOf(9.5));
		
		
		student.setId("1");
		student.setName("Adam");
		student.setLanguages(languages);
		student.setPoints(points);
		student.setGrades(grades);
		return student;
	}
	
	
}
