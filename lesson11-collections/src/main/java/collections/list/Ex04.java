package collections.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import collections.util.ListUtils;

import static collections.util.ListUtils.*;

public class Ex04 {
	public static void main(String[] args) {
		// List<String> students=new ArrayList();
		//aslist:=> return fixed-size list(ko them phan tu)
		List<String> students = Arrays.asList("Nam", "Hoang", "Teo", "Nguyen");
		
		Collections.reverse(students);
		Collections.shuffle(students);
		printfStr(students);
		
		System.out.println("contain:"+students.contains("Na"));
	}

	

}
