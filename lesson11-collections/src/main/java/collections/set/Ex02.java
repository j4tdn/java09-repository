package collections.set;

import java.util.HashSet;
import java.util.Set;

import bean.Student;

public class Ex02 {
	public static void main(String[] args) {
		Set<Student> students = new HashSet<>();
		students.add(new Student(1,"Andy"));
		students.add(new Student(1,"Andy"));
		students.add(new Student(3,"Tom"));
		
		System.out.println(students);
	}
}
