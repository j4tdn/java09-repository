package manipulation;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import bean.Student;
import static util.FileUtils.*;

public class Ex05 {
	private static final String pathname = "json/student.json";
	
	public static void main(String[] args) {
		File file = createFile(pathname);
		
		Student student = getStudent();
		
		// convert pojo object to json
		writeJson(file, student);
		open(file);
		
		// convert to string
		System.out.println(writeAsStringJson(student));
		
		// read json file
		Student out = readJson(file, Student.class);
		System.out.println(out);
	}

	private static Student getStudent() {
		Student student = new Student();
		
		student.setId("102");
		student.setName("Adam");
		student.setLanguages(Arrays.asList("en", "sp", "ru", "china"));
		
		Map<String, Double> points = new HashMap<>();
		points.put("en", 2D);
		points.put("sp", 2D);
		points.put("ru", 2D);
		points.put("china", 2D);
		
		student.setPoints(points);
		
		return student;
	}
}
