package manipulation;

import java.io.File;
import java.io.ObjectInputStream.GetField;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Grade;
import bean.Student;
import utils.FileUtils;
import static utils.FileUtils.*;

public class Ex05 {
	private static final String pathname = "json/studnet.json";
	public static void main(String[] args) {
		File file = createFile(pathname);
		//convert object to json file
		Student stundent = getStudent();
		writeJson(file, stundent);
		open(file);
		//convert object to json string
	//	System.out.println(writeJsonAsString(student));
	}
	private static Student getStudent() {
		Student student = new Student();
		List<String> languages = Arrays.asList("C","C++","JAVA","PHP");
		List<Grade> grades = Arrays.asList(
				new Grade("T1","11T1"),
				new Grade("T2","12T2"),
				new Grade("T3","13T3"));
	
		//amonymous class
		Map<String, BigDecimal> points = new HashMap<>() ;
			points.put("C",BigDecimal.valueOf(8));
			points.put("C++",BigDecimal.valueOf(9));
			points.put("JAVA",BigDecimal.valueOf(8));
			points.put("PHP",BigDecimal.valueOf(9.5));
	
		
		student.setId("102");
		student.setName("Adam");
		student.setLanguages(languages);
		return student;
	}
}
