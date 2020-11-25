package collections.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.*;

import bean.Student;

public class Ex06 {
	public static void main(String[] args) {
		List<Student> students = getStudents();
		Student user = new Student(1, "Le A");
		// contains
		// remove
		students.removeIf(student -> student.equals(user));
		System.out.println("=====sorting=====");
		
		Comparator<Student> com = comparing(student -> student.getId());
		students.sort(com.thenComparing(student -> student.getName(), reverseOrder()));
		students.forEach(System.out::println);
		
	}
	
	private static List<Student> getStudents(){
		return new ArrayList<>(List.of(
				new Student(1, "Le A"),
				new Student(2, "Le B"),
				new Student(3, "Hoang D"),
				new Student(7, "Nam"),
				new Student(4, "Nguyen")));
	}
}
