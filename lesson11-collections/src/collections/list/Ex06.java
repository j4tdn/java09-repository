package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import static java.util.Comparator.*;


import bean.Student;

public class Ex06 {
	public static void main(String[] args) {
		List<Student> students = getItems();
		Student User = new Student(1, "Nam");
		
		System.out.println("contain: " +students.contains(User));
		//contains 
		
		students.removeIf(student -> student.equals(User));
		System.out.println("size " +students.size());
		System.out.println("===========Sorting========");
		//Collections.sort	:Comparable, Comparator
		//List#sort
		Comparator<Student> comp = comparing(student->student.getId());
		students.sort(comp.thenComparing(student->student.getName(), reverseOrder()) );
		students.forEach(student-> System.out.println(student));
		
	
	}
	private static List<Student> getItems(){
		return new ArrayList<> (List.of(
				new Student(1, "Nam"),
				new Student(13, "Hoang"),
				new Student(8, "Le"),
				new Student(13, "Ngoc"),
				new Student(6, "Dung")
				));
	}

}
