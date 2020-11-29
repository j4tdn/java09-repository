package collections.list;

import java.util.ArrayList;
import static java.util.Comparator.*;
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
		System.out.println("Contain :" + students.contains(user));
		students.removeIf(student -> student.equals(user));
		System.out.println("size:" + students.size());
		
		//Cach sort
		//1.Collections.sort : comparable,comparator
		//2.List.sort
		
		Collections.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				return s1.getId() - s2.getId();
			}
		});
		Comparator<Student> comp = comparing(student -> student.getId());
		students.sort(comp.thenComparing(student -> student.getName(),reverseOrder()));
		students.forEach(student -> System.out.println(student));
		
	}
	
	private static List<Student> getItems(){
		return new ArrayList<Student>(List.of (
			new Student(1, "Nam"),
			new Student(13, "Hoa"),
			new Student(8, "Le"),
			new Student(22, "Ngoc"),
			new Student(16, "Dung")
		));
	}
}
