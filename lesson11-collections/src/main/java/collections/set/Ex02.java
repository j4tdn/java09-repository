package collections.set;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import bean.Student;
import collections.utils.CollectionUtils;

public class Ex02 {
	public static void main(String[] args) {
		Set<Student> students = new TreeSet<>(Comparator.comparing(s -> s.getId()));
		students.add(new Student(1, "Andy"));
		students.add(new Student(2, "Terry"));
		students.add(new Student(3, "Tom"));
		CollectionUtils.printf(students);
	}
}
