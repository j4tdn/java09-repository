package ex04;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Ex04 {

	public static void main(String[] args) {
		File file = new File("student.txt");
		if (!file.exists()) {
			throw new RuntimeException("File is not exist");
		}

		List<Student> students = getData(file);
		
	}

	public static List<Student> getData(File file) {
		ObjectMapper mapper = new ObjectMapper();
		List<Student> students = new ArrayList<>();
		try {
			students = (List<Student>) mapper.readValue(file, Student.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return students;
	}

	public static List<Student> sortStudent(List<Student> students) {
		return students.stream().sorted(Comparator.comparing(Student::getMark).thenComparing(Student::getName))
				.collect(Collectors.toList());
	}

	public static List<Student> searchMarkThan8(List<Student> students) {
		return students.stream().filter(s -> s.getMark() > 8)
				.collect(Collectors.toList());
	}
	
	public static List<Student> searchFemale (List<Student> students){
		return students.stream()
				 .filter(s -> s.getGender().equals("Nu"))
				 .collect(Collectors.toList());
	}
	
	public static List<Student> searchUniqueStudent (List<Student> students){
		Map<Student, Integer> tmp = new HashMap<Student, Integer>();
		students.forEach(element -> {
			if (tmp.get(element) == null) {
				tmp.put(element, 1);
			} else {
				tmp.put(element, tmp.get(element) + 1);
			}
		});
		return tmp.entrySet().stream()
				 .filter(s -> s.getValue() == 1)
				 .map(s -> s.getKey())
				 .collect(Collectors.toList());
	}
}
