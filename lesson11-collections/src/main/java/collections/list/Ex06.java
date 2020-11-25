package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import bean.Student;

public class Ex06 {

	public static void main(String[] args) {
		List<Student> students = getItems();
		Student user = new Student(1, "Nam");
		// contains
		System.out.println("contains:" + students.contains(user));
		// remove
		students.removeIf(student -> student.equals(user));

		System.out.println(students.size());

		System.out.println("============sorting===============");
		// collection:comparable, comparator
		// List#sort
//		Collections.sort(students,new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				return 0;
//			}
//			
//		});
//		
		Comparator<Student> comparator = Comparator.comparing(student -> student.getId());
		students.sort(comparator.thenComparing(student -> student.getName(), Comparator.reverseOrder()));

		students.forEach(student -> System.out.println(student));

	}

	private static List<Student> getItems() {
		return new ArrayList<>(List.of(new Student(1, "Nam"), new Student(13, "Hoa"), new Student(8, "Le"),
				new Student(13, "Ngoc"), new Student(18, "Dung")));
	}

}
