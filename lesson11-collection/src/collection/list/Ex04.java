package collection.list;

import static utils.ListUtils.printf;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
		List<String> students = Arrays.asList("Nam", "Hoang", "Teo", "Nguyen");
		Collections.reverse(students);
		Collections.shuffle(students);
		printf(students);
		
		System.out.println("contains: " + students.contains("Nam"));
	}
}
