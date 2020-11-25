package collection.list;
import static java.util.Collections.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import bean.Student;

public class Ex06 {
	public static void main(String[] args) {
		List<Student> students = getItems();
		Student user = new Student(1,"join");
		System.out.println("contain: "+students.contains(user)
		
		);
		students.removeIf(student -> student.equals(user));
		System.out.println(students.size());
		
		System.out.println("===========sort============");
		Comparator <Student> comp = Comparator.comparing(student -> student.getId());
		Collections.sort(students,comp.thenComparing(t ->t.getName(),reverseOrder()));
		students.forEach(student -> System.out.println(student.toString()));
		
		
//		Collections.sort(students,new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				
//				return 0;
//			}
//		});
		}
	//Arrays.sort
	//Collection.sort:Comparable, Comparator
	//List#sort
	
	
	
	private static List<Student> getItems(){
		
		return new ArrayList<> (List.of(
				new Student(1,"nam"),
				new Student(3,"nam"),
				new Student(4,"hoang"),
				new Student(5,"truong"),
				new Student(44,"dung")
				));
				
	}
}
