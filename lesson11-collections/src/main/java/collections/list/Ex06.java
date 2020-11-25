package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Comparator.*;
import java.util.List;
import bean.Student;

public class Ex06 {
	public static void main(String[] args) {

		List<Student> students = getItems();
		Student user = new Student(1, "Join");
		System.out.println("contains: " + students.contains(user));
		students.removeIf(t -> t.equals(user));
		System.out.println("size: " + students.size());
		System.out.println("-----------Sorting-----------");
		// Arrays.sort
		// Collections.sort
		// List#sort
		students.sort(comparing(Student::getId).thenComparing(Student::getName, reverseOrder()));
		students.forEach(System.out::println);
	}

	public static List<Student> getItems() {
		return new ArrayList<>(Arrays.asList(new Student(1, "Nam"), new Student(13, "Phiêu"), new Student(18, "Hồng"),
				new Student(14, "Nhung"), new Student(15, "Thư"), new Student(20, "Chiến")));
	}

}
