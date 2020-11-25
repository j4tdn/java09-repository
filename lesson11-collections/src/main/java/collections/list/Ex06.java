package collections.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import bean.Student;

public class Ex06 {
	public static void main(String[] args) {
		List<Student> students = getItem();
		Student user = new Student(1, "John");
		System.out.println("contains:" + students.contains(user));
		students.removeIf(student -> student.equals(user));
		System.out.println("size:" + students.size());
		// contain
		// remove
		System.out.println("=======Sorting========");
		// Arrays.sort
		// Collection.sort
		// List#sort
		Comparator<Student> comp = Comparator.comparing(Student::getId); 
		students.sort(comp.thenComparing(Student::getName, Comparator.reverseOrder()));
		students.forEach(student -> System.out.println(student));
	}

	private static List<Student> getItem() {
		return new ArrayList<>(List.of(new Student(1, "Nam"), new Student(13, "Nam"), new Student(8, "Le"),
				new Student(13, "Ngoc"), new Student(16, "Dung")));

	}
}
