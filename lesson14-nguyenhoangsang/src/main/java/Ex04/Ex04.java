package Ex04;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex04 {
	public static void main(String[] args) {
		String path = "student.txt";
		File file = new File(path);
		
		List<String> list = null;;
		try {
			list = Files.readAllLines(Paths.get(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		List<Student> students = getStudents(list);
		
		//cau 1
		List<Student> list1 = students.stream()
								.sorted(Comparator.comparingDouble(Student::getPoint).thenComparing(t -> t.getName()))
								.collect(Collectors.toList());
		
		
		//cau 2
		List<Student> list2 = students.stream()
								.filter(t -> (t.getPoint() > 8))
								.collect(Collectors.toList());
		
		for (Student t : list2) {
			System.out.println(t.getPoint() + " " + t.getName());
		}
		
		//cau 3
		List<Student> list3 = students.stream()
								.filter(t -> ("Nu".equals(t.getGender())))
								.collect(Collectors.toList());
		
		//cau 4
		List<String> list4 = students.stream()
								.map(Student::getMssv)
								.distinct()
								.collect(Collectors.toList());
	}
	
	private static List<Student> getStudents(List<String> students){
		List<Student> result = new ArrayList<>();
		for (String str : students) {
			String[] student = str.split(",");
			result.add(new Student(student[0],student[1],Double.parseDouble(student[2]),student[3]));
		}
		return result;
	}
}
