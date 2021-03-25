package manipulation;

import java.io.File;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Student;
import utils.FileUtils;

public class Ex05 {
	private static final String pathname = "json/student.json";
	public static void main(String[] args) {
		File file = FileUtils.createFile(pathname);	
		Student student = getStudent();
	}
	private static Student getStudent() {
		Student student = new Student();
		List<String> languages = Arrays.asList("C","C++","JAVA","PHP");
		Map<String, BigDecimal> points = new HashMap<String, BigDecimal>();
		
		points.put("C", BigDecimal.valueOf(8));
		points.put("C++", BigDecimal.valueOf(9));
		points.put("Java", BigDecimal.valueOf(8));
		
		
		
		student.setId("102");
		student.setName("Adam");
		student.setLanguages(languages);
		return student;
	}
}
