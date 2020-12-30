package collections.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import bean.Student;
import collections.utils.CollectionUtils;

public class Ex02 {
	public static void main(String[] args) {
		Set<Student> students = new HashSet<>();
		Student andy = new Student(1, "Andy");
		students.add(andy);
		students.add(new Student(1, "Andy"));
		students.add(new Student(3, "John"));
		CollectionUtils.printf(students);
	}
}
