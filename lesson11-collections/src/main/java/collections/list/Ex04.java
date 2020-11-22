package collections.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static collections.utils.ListUtils.*;

public class Ex04 {
	public static void main(String[] args) {
		List<String> students = Arrays.asList("Huy", "Hung", "Hau", "Hoang", "Hong");
		printf(students);
		
		Collections.reverse(students);
		printf(students);
		Collections.shuffle(students);
		printf(students);
		
		System.out.println("contains: " + students.contains("Huy"));
	}
}
