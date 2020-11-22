package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import static collection.utils.ListUtils.*;
import java.util.List;

import javax.sound.sampled.ReverbType;

import collection.utils.ListUtils;

public class Ex04 {
	public static void main(String[] args) {
		//List<String>  students = new ArrayList<String>();
		//Arrays.asList => return fixed-size list
		List<String>  students = Arrays.asList("nam"," hoang","teo","nguyen");
		Collections.reverse(students);
		Collections.shuffle(students);
		System.out.println("contains:"+students.contains("nam"));
		prinf(students);
		
	}
}
