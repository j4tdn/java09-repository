package collections.set;

import java.beans.Statement;
import java.util.HashSet;
import java.util.Set;

import bean.Student;
import collections.utils.CollectionUtils;

public class Ex02 {
	public static void main(String[] args) {
		Set<Student> students = new HashSet<>();
		students.add(new Student(1, "Andy"));
		students.add(new Student(2, "An"));
		students.add(new Student(1, "Andy"));
		CollectionUtils.printf(students);
	}
}

