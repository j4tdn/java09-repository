package collection.set;

import java.util.HashSet;
import java.util.Set;

import bean.Student;
import collection.utils.CollectionUtils;

public class Ex02 {
	public static void main(String[] args) {
		Set<Student> students = new HashSet<>();
		students.add(new Student(1, "Amdy"));
		students.add(new Student(2, "Terry"));
		students.add(new Student(1, "Amdy"));
		CollectionUtils.prinf(students);
	}
}
	