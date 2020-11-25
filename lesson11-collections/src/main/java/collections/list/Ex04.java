package collections.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static collections.utils.ListUtils.*;

public class Ex04 {
	public static void main(String[] args) {
		List<String> students = Arrays.asList("Hồng", "Thảo", "Chiến", "Lan", "Phi");
		Collections.reverse(students);
		Collections.shuffle(students);
		printfString(students);
		System.out.println("contains: " + students.contains("Nam"));
	}
}
