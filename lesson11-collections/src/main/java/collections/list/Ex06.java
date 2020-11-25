package collections.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import static java.util.Comparator.*;

import bean.Student;

public class Ex06 {
	public static void main(String[] args) {
		List<Student> students = getItems();
		Student user = new Student(1, "Nam");
		// contains
		System.out.println("contain: " + students.contains(user));
		// remove
		students.removeIf(student -> student.equals(user));
		System.out.println(students.size());
		System.out.println("================sorting================");
		// Arrays.sort
		// Collections.sort
		// List#sort
		Comparator<Student> comp = comparing(student -> student.getId());
		students.sort(comp.thenComparing(student -> student.getName(), reverseOrder()));
		students.forEach(new Consumer<Student>() {
			@Override
			public void accept(Student student) {
				System.out.println(student);
			}
		});
	}

	private static List<Student> getItems() {
		return new ArrayList<>(List.of(new Student(1, "Nam"), new Student(2, "Nam"), new Student(3, "Le"),
				new Student(2, "Ngoc"), new Student(5, "Dung")));
	}
}
