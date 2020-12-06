package collections.set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import bean.Student;
import collections.utils.ListUtils;

public class Ex02 {
	public static void main(String[] args) {
		Set<Student> students=new HashSet<Student>();
		students.add(new Student(1,"Andy"));
		students.add(new Student(1,"Andy"));
		students.add(new Student(3,"Tom"));
		ListUtils.print(students);
	}
}
