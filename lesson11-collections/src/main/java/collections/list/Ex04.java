package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static collections.utils.ListUtils.*;

public class Ex04 {
	public static void main(String[] args) {
		List<String> students = Arrays.asList(
				"Nam", "Hoang", "Thuong", "Nguyen"
				);
		
		Collections.reverse(students);
		Collections.shuffle(students);
		printfStr(students);
		
		System.out.println("contains: " + students.contains("Nam"));
	}
}
