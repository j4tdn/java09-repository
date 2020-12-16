package collections.list;
import static java.util.Comparator.*;

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
		Student user = new Student(1,"Join");
		System.out.println("contain: " +  students.contains(user));
		students.removeIf(student -> student.equals(user));
		System.out.println("size: " + students.size());
		System.out.println("============sorting===========");
		//Arrays.sort
		//collections.sort:comparable.comparator
		//List#sort
	Comparator<Student>	comp = comparing(student -> student.getId());
		students.sort(comp.thenComparing(student -> student.getName(), reverseOrder()));
		students.forEach(student -> System.out.println(student));


	}

	private static List<Student> getItems(){
		return new ArrayList<Student>(List.of(

				new Student(1,"Nam"),
				new Student(13,"Nam"),
				new Student(8,"le"),
				new Student(13,"ngoc"),
				new Student(16,"dung")

				));



	}

}