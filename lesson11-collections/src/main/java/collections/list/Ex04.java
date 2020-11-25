package collections.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static collections.utils.ListUtils.*;

public class Ex04 {
	public static void main(String[] args) {
		//Arrays.asList => return fixed-size list (cannot add element)
		List<String> students = Arrays.asList("Nam","Hoang","Teo", "Nguyen");
		Collections.reverse(students);
		Collections.shuffle(students);
		printfStr(students);
		
		// class use contain must override equal method
		System.out.println("contains:" + students.contains("Nam"));
	}
	
}
