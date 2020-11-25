package collections.list;

import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import static java.util.Comparator.*;
import java.util.List;
import static collections.utils.ListUtils.*;

import bean.students;

public class Ex06 {
	public static void main(String[] args) {
		List<students> students=getItems();
		students user=new students(1,"John");
		System.out.println("contains: " + students.contains(user));
		students.removeIf(student -> student.equals(user));
		
		System.out.println("size : " + students.size());
		
		System.out.println("===========Sorting============" );
		/*Collections.sort(students,new Comparator<students>() {

			@Override
			public int compare(students s1, students s2) {
				return 0;
			}
		});*/
		Comparator<students> comp=comparing(student ->student.getId());
		students.sort(comp.thenComparing(student -> student.getName(),reverseOrder()));
		students.forEach(student->System.out.println(student));
	}
	private static List<students> getItems() {
		return new ArrayList<> (List.of(
				new students(1,"Nam"),
				new students(7,"Hoa"),
				new students(13,"Nam"),
				new students(13,"Ngoc"),
				new students(8,"Dung"),
				new students(1,"Nhan")
				
		));
}
}
