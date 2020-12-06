package collection.set;

import java.util.HashSet;
import java.util.Set;

import bean.Student;
import collections.util.ListUtils;

public class Ex02 {
	public static void main(String[] args) {
		Set<Student> students=new HashSet<>();
		students.add(new Student(1, "Andy"));
		students.add(new Student(1, "Andy"));
		students.add(new Student(3, "Tony"));
		
		ListUtils.printf(students);
	}
}
