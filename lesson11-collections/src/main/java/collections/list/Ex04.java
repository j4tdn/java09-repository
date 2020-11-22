package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static collections.utils.ListUtils.*;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> students = Arrays.asList("nam","hoang","teo","nguyen");
		Collections.reverse(students);
		Collections.shuffle(students);
		printf(students);
		
		
		System.out.println("contains : "+students.contains("nam"));
	}

}
